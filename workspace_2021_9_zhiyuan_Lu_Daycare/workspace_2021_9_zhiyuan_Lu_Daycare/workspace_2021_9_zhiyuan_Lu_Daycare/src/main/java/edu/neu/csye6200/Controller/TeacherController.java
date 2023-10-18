/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.Controller;

import edu.neu.csye6200.Model.Classroom;
import edu.neu.csye6200.Model.DayCare;
import edu.neu.csye6200.Model.Student;
import edu.neu.csye6200.Model.Teacher;
import edu.neu.csye6200.View.StudentView;
import edu.neu.csye6200.View.TeacherView;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author 86133
 */
public class TeacherController {
    
    private final DayCare model;
    private final TeacherView view;
    Classroom classroomend;

    public TeacherController(DayCare model, TeacherView view)
    {
        this.model = model;
        this.view = view;
        updateTeacherTable();
        setEditable(false);
    }

    private void updateTeacherTable() {
        DefaultTableModel model = (DefaultTableModel) view.tblTeachers.getModel();
        model.setRowCount(0);
        List<Teacher> teachers = this.model.getTeachers();
        if (!teachers.isEmpty())
        {
            for (Teacher t : teachers)
            {
                if (t.getClassroom() != null)
                {
                    Object[] row = new Object[4];
                    row[0] = t;
                    row[1] = t.getAgeGroup();
                    row[2] = t.getReviewDate();
                    row[3] = t.getClassroom().getName();
                    model.addRow(row);
                }
            }
        } 
    }
    
    public void enableAddTeacher(){
        clearInput();
        view.btnUpdate.setVisible(false);
        view.btnConfirm.setVisible(true);
        setEditable(true);
        for (Teacher teacher : model.getTeachers())
            view.teacherGroup.addItem(teacher.getClassroom().getName());
        
    }
    
    public boolean viewTeacher()
    {
        setEditable(false);
        view.teacherGroup.setEditable(true);
        view.btnUpdate.setVisible(false);
        view.btnConfirm.setVisible(false);
        int selectedRow = view.tblTeachers.getSelectedRow();
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a teacher.");
            return false;
        }
        DefaultTableModel model = (DefaultTableModel) view.tblTeachers.getModel();
        Teacher t = (Teacher) model.getValueAt(selectedRow, 0);
        view.txtAge.setText(String.valueOf(t.getAgeGroup()));
        view.txtName.setText(t.getName());
        view.txtReviewDate.setText(String.valueOf(t.getReviewDate()));
        view.teacherGroup.setSelectedItem(t.getClassroom().getName());
        return true;
    }
    
    public void enableEditTeacher()
    {
        if (!viewTeacher()) return;
        setEditable(true);
        view.btnUpdate.setVisible(true);
        view.btnConfirm.setVisible(false);
        
    }
    public void editTeacher()
    {
        int selectedRow = view.tblTeachers.getSelectedRow();
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a teacher to view.");
            return;
        }
        DefaultTableModel modelTable = (DefaultTableModel) view.tblTeachers.getModel();
        Teacher t = (Teacher) modelTable.getValueAt(selectedRow, 0);
        String name = view.txtName.getText();
        String ageText = view.txtAge.getText();
        if (!ageText.matches("[0-9]*"))
        {
            printError("Invalid age!");
            return;
        }
        int age = Integer.parseInt(ageText);
        String reviewdate = view.txtReviewDate.getText();
        LocalDate reviewd = LocalDate.parse(reviewdate);
        t.setAgeGroup(age);
        t.setName(name);
        t.setReviewDate(reviewd);
        String classroom = (String) view.teacherGroup.getSelectedItem();
        
        if (classroom == null)
        {
            printError("Invalid teacher!");
            return;
        }
       
        
        modelTable.setValueAt(t, selectedRow, 0);
        JOptionPane.showMessageDialog(view, "Update successful!");
        view.btnConfirm.setVisible(false);
        updateTeacherTable();
        clearInput();
        setEditable(false);
        model.updateDB();
    }

    public void addTeacher()
    {
        
        String name = view.txtName.getText();
        String ageText = view.txtAge.getText();
        
        if (!ageText.matches("[0-9]*"))
        {
            printError("Invalid age!");
            return;
        }
        int ageGroup = Integer.parseInt(ageText);
        String reviewdate = view.txtReviewDate.getText();
        LocalDate reviewd = LocalDate.parse(reviewdate);
        Teacher teacher = new Teacher(name, ageGroup, reviewd);
        
        String classroom1 = (String) view.teacherGroup.getSelectedItem();
        if (classroom1 == null)
        {
            printError("Invalid teacher!");
            return;
        }
        
        for(Classroom classroom : model.getClassrooms()){
            if(classroom.getName().equals(classroom1)){
                classroomend = classroom;
            }
        }
        teacher.setClassroom(classroomend);
        if (!model.addTeacher(teacher))
        {
            printError("Teacher already exists!");
            return;
        }
        
        
       
        JOptionPane.showMessageDialog(view, "Add successful!");
        view.btnConfirm.setVisible(false);
        updateTeacherTable();
        clearInput();
        setEditable(false);
        model.updateDB();

    }
    
    public void deleteTeacher()
    {
        int selectedRow = view.tblTeachers.getSelectedRow();
        String teacherName = ((Teacher) view.tblTeachers.getModel().getValueAt(selectedRow, 0)).getName();
        model.deleteTeacherByName(teacherName);
        updateTeacherTable();
        model.updateDB();
    }

    public void setEditable(Boolean n)
    {
        view.txtAge.setEditable(n);
        view.txtName.setEditable(n);
        view.teacherGroup.setEnabled(n);
        view.txtReviewDate.setEnabled(n);
        view.btnConfirm.setEnabled(n);
    }

    public void clearInput()
    {
        
        view.txtAge.setText("");
        view.txtName.setText("");
        view.teacherGroup.removeAllItems();
        view.txtReviewDate.setText("");
    }

    private void printError(String errMsg)
    {
        JOptionPane.showMessageDialog(view,
                errMsg,
                "Error!",
                JOptionPane.ERROR_MESSAGE);
    }

    private void printSuccMsg(String msg)
    {
        JOptionPane.showMessageDialog(view,
                msg,
                "Success!",
                JOptionPane.PLAIN_MESSAGE);
    }
}
