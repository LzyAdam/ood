package edu.neu.csye6200.Controller;

import edu.neu.csye6200.Model.Classroom;
import edu.neu.csye6200.Model.DayCare;
import edu.neu.csye6200.Model.Immunization;
import edu.neu.csye6200.Model.Student;
import edu.neu.csye6200.Model.Teacher;
import edu.neu.csye6200.View.StudentView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class StudentController
{
    private final DayCare model;
    private final StudentView view;
//    private Immunization immunization;

    public StudentController(DayCare model, StudentView view)
    {
        this.model = model;
        this.view = view;
        updateStudentTable();
        setEditable(false);
    }

    private void updateStudentTable()
    {
        DefaultTableModel model = (DefaultTableModel) view.tblStudents.getModel();
        //Immunization i= new Immunization();
                
        model.setRowCount(0);
        List<Student> students = this.model.getStudents();
      // Immunization i= new Immunization();
        if (!students.isEmpty())
        {
            for (Student s : students)
            {
                Object[] row = new Object[7];
                row[0] = s;
                row[1] = s.getAge();
                row[2] = s.getAssignedTeacher().getName();
                row[3] = s.getAssignedTeacher().getClassroom().getName();
//                row[4] = i.getVaccineType();
//                row[5] = i.getDose();
//                row[6] = i.getDose();
                //row[5] = s.getAssignedTeacher().getClassroom().getName();
               // row[6] = s.getAssignedTeacher().getClassroom().getName();
               model.addRow(row);
//              Immunization i= new Immunization();
//                row[4] = i.getVaccineType();
//                row[5] = i.getDose();
//                row[6] = i.getDose(); 
//                model.addRow(row);
            }
        }
    }

    public void enableAddStudent()
    {
        clearInput();
        view.btnUpdate.setVisible(false);
        view.btnConfirm.setVisible(true);
        view.btnVaccInfoUpdate.setVisible(false);
        view.txtVaccineType.setVisible(false);
        view.txtDoes.setVisible(false);
        view.txtDate.setVisible(false);
        view.jLabel9.setVisible(false);
        view.jLabel10.setVisible(false);
        view.jLabel11.setVisible(false);
        view.jLabel13.setVisible(false);
        setEditable(true);
        for (Teacher teacher : model.getTeachers())
            view.teacherGroup.addItem(teacher.getName() + "-Capacity:" + String.valueOf(teacher.getCapacity()));

    }
    
    public boolean viewStudentImm()
    {
        setEditable(false);
        view.teacherGroup.setEditable(true);
        view.btnUpdate.setVisible(false);
        view.btnConfirm.setVisible(false);
        view.btnVaccInfoUpdate.setVisible(false);
        view.txtVaccineType.setVisible(true);
        view.txtDoes.setEditable(false);
        view.txtDate.setEditable(false);
        view.txtVaccineType.setEditable(false);
        view.txtDoes.setVisible(true);
        view.txtDate.setVisible(true);
        view.jLabel9.setVisible(true);
        view.jLabel10.setVisible(true);
        view.jLabel11.setVisible(true);
        view.jLabel13.setVisible(true);
        
        int selectedRow = view.tblStudents.getSelectedRow();
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a student.");
            return false;
        }
        DefaultTableModel model = (DefaultTableModel) view.tblStudents.getModel();
        Student s = (Student) model.getValueAt(selectedRow, 0);
        view.txtAddress.setText(s.getParentAddress());
        view.txtAge.setText(String.valueOf(s.getAge()));
        view.txtParName.setText(s.getParentName());
        view.txtParNum.setText(s.getParentPhoneNum());
        view.txtName.setText(s.getName());
        view.txtClassroom.setText(s.getAssignedTeacher().getClassroom().getName());
        view.teacherGroup.setSelectedItem(s.getAssignedTeacher().toString() + "-Capacity:" + String.valueOf(s.getAssignedTeacher().getCapacity()));
        /************************************/
       //DefaultTableModel dt = (DefaultTableModel) jTable1.;
        //Immunization i= new Immunization();
                
//        model.setRowCount(0);
//      List<Student> students = this.model.getStudents();
//      Immunization i= new Immunization();
//        if (!students.isEmpty())
//        {
//            for (Student t : students)
//            {
//                Object[] row = new Object[7];
//                //row[0] = t;
//                row[1] = t.getAge();
//                row[2] = t.getAssignedTeacher().getName();
//                row[3] = t.getAssignedTeacher().getClassroom().getName();
////                row[4] = i.getVaccineType();
////                row[5] = i.getDose();
////                row[6] = i.getDose();
//                //row[5] = s.getAssignedTeacher().getClassroom().getName();
//               // row[6] = s.getAssignedTeacher().getClassroom().getName();
//               model.addRow(row);
////              Immunization i= new Immunization();
////                row[4] = i.getVaccineType();
////                row[5] = i.getDose();
////                row[6] = i.getDose(); 
////                model.addRow(row);
//            }
//        }
        
        /***************************************/
        if (s.getImmunizations().isEmpty()){
            view.txtVaccineType.setText(null);
            view.txtDoes.setText(null);
            view.txtDate.setText(null);
        }
        else{
            for(Immunization obj:s.getImmunizations()){
                if (obj.getVaccineType() != null){
                    view.txtVaccineType.setText(obj.getVaccineType());
                    view.txtDoes.setText(String.valueOf(obj.getDose()));
                    view.txtDate.setText(String.valueOf(obj.getDate()));
                }
                else{
                    view.txtVaccineType.setText(null);
                    view.txtDoes.setText(null);
                    view.txtDate.setText(null);
                }
            }
        }
        return true;
    }
    
    public void EditStudentImm(){       
        
        int selectedRow = view.tblStudents.getSelectedRow();
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a student.");
            return;
        }
        DefaultTableModel model_ = (DefaultTableModel) view.tblStudents.getModel();
        Student s = (Student) model_.getValueAt(selectedRow, 0);

            String vaccineType = view.txtVaccineType.getText();
            String does = view.txtDoes.getText();
            String date = view.txtDate.getText();

            if (vaccineType.isEmpty() | does.isEmpty() | date.isEmpty()){
                JOptionPane.showMessageDialog(view, "Input error!");
            }
            else{
                int does_ = Integer.parseInt(does);
                LocalDate date_ = LocalDate.parse(date);
                if (s.getImmunizations().isEmpty()){
                    s.createImmuRecord(vaccineType, does_, date_);
                }
                for(Immunization obj:s.getImmunizations()){
                    obj.setDate(date_);
                    obj.setDose(does_);
                    obj.setVaccineType(vaccineType);
                }
                model_.setValueAt(s, selectedRow, 0);
                JOptionPane.showMessageDialog(view, "Update successful!");
                view.btnVaccInfoUpdate.setVisible(false);
                clearInput();
                view.txtDoes.setEditable(false);
                view.txtDate.setEditable(false);
                view.txtVaccineType.setEditable(false);
                model.updateDB();
            }
    }
    
    public void enableEditStudentImmun()
    {
        setEditable(false);
        view.teacherGroup.setEditable(true);
        view.btnUpdate.setVisible(false);
        view.btnConfirm.setVisible(false);
        view.btnVaccInfoUpdate.setVisible(true);
        
        view.txtVaccineType.setVisible(true);
        view.txtDoes.setEditable(true);
        view.txtDate.setEditable(true);
        view.txtVaccineType.setEditable(true);
        view.txtDoes.setVisible(true);
        view.txtDate.setVisible(true);
        view.jLabel9.setVisible(true);
        view.jLabel10.setVisible(true);
        view.jLabel11.setVisible(true);
        view.jLabel13.setVisible(true);
        
        int selectedRow = view.tblStudents.getSelectedRow();
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a student.");
        }
        DefaultTableModel model_ = (DefaultTableModel) view.tblStudents.getModel();
        Student s = (Student) model_.getValueAt(selectedRow, 0);
        if (s.getImmunizations().isEmpty()){
            view.txtVaccineType.setText(null);
            view.txtDoes.setText(null);
            view.txtDate.setText(null);
        }
        else{
            for(Immunization obj:s.getImmunizations()){
                    view.txtVaccineType.setText(obj.getVaccineType());
                    view.txtDoes.setText(String.valueOf(obj.getDose()));
                    view.txtDate.setText(String.valueOf(obj.getDate()));
            }
        }
        view.txtAddress.setText(s.getParentAddress());
        view.txtAge.setText(String.valueOf(s.getAge()));
        view.txtParName.setText(s.getParentName());
        view.txtParNum.setText(s.getParentPhoneNum());
        view.txtName.setText(s.getName());
        view.txtClassroom.setText(s.getAssignedTeacher().getClassroom().getName());
        view.teacherGroup.setSelectedItem(s.getAssignedTeacher().toString() + "-Capacity:" + String.valueOf(s.getAssignedTeacher().getCapacity()));
    }
    
    public boolean viewStudent()
    {
        setEditable(false);
        view.btnVaccInfoUpdate.setVisible(false);
        view.txtVaccineType.setVisible(false);
        view.txtDoes.setVisible(false);
        view.txtDate.setVisible(false);
        view.jLabel9.setVisible(false);
        view.jLabel10.setVisible(false);
        view.jLabel11.setVisible(false);
        view.jLabel13.setVisible(false);
        view.teacherGroup.setEditable(true);
        view.btnUpdate.setVisible(false);
        view.btnConfirm.setVisible(false);
        int selectedRow = view.tblStudents.getSelectedRow();
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a student.");
            return false;
        }
        DefaultTableModel model = (DefaultTableModel) view.tblStudents.getModel();
        Student s = (Student) model.getValueAt(selectedRow, 0);
        view.txtAddress.setText(s.getParentAddress());
        view.txtAge.setText(String.valueOf(s.getAge()));
        view.txtParName.setText(s.getParentName());
        view.txtParNum.setText(s.getParentPhoneNum());
        view.txtName.setText(s.getName());
        view.txtClassroom.setText(s.getAssignedTeacher().getClassroom().getName());
        view.teacherGroup.setSelectedItem(s.getAssignedTeacher().toString() + "-Capacity:" + String.valueOf(s.getAssignedTeacher().getCapacity()));
        return true;
    }

    public void enableEditStudent()
    {
        if (!viewStudent()) return;
        setEditable(true);
        view.btnVaccInfoUpdate.setVisible(false);
        view.txtVaccineType.setVisible(false);
        view.txtDoes.setVisible(false);
        view.txtDate.setVisible(false);
        view.jLabel9.setVisible(false);
        view.jLabel10.setVisible(false);
        view.jLabel11.setVisible(false);
        view.jLabel13.setVisible(false);
        view.btnUpdate.setVisible(true);
        view.btnConfirm.setVisible(false);
        String teacherField = (String) view.teacherGroup.getSelectedItem();
        String currTeacherName = teacherField.substring(0, teacherField.indexOf("-"));
        view.teacherGroup.removeAllItems();
        int teacherCount = 0;
        for (Teacher teacher : model.getTeachers())
        {
            view.teacherGroup.addItem(teacher.getName() + "-Capacity:" + String.valueOf(teacher.getCapacity()));
            if (currTeacherName.equals(teacher.getName()))
                view.teacherGroup.setSelectedIndex(teacherCount);
            teacherCount++;
        }
    }

    public void editStudent()
    {
        int selectedRow = view.tblStudents.getSelectedRow();
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a student to view.");
            return;
        }
        DefaultTableModel modelTable = (DefaultTableModel) view.tblStudents.getModel();
        Student s = (Student) modelTable.getValueAt(selectedRow, 0);
        String name = view.txtName.getText();
        String ageText = view.txtAge.getText();
        
        if (!ageText.matches("[0-9]*"))
        {
            printError("Invalid age!");
            return;
        }
        int age = Integer.parseInt(ageText);
        String parentName = view.txtParName.getText();
        String parentNum = view.txtParNum.getText();
        if (!parentNum.matches("[0-9]*"))
        {
            printError("Invalid phone number!");
            return;
        }
        String address = view.txtAddress.getText();
        s.setAge(age);
        s.setParentAddress(address);
        s.setParentName(parentName);
        s.setParentPhoneNum(parentNum);
        s.setName(name);
        s.setRegistrationDate(LocalDate.now());
        String teacherField = (String) view.teacherGroup.getSelectedItem();
        if (teacherField == null)
        {
            printError("Invalid teacher!");
            return;
        }
        String teacherName = teacherField.substring(0, teacherField.indexOf("-"));

        Teacher teacher = model.findTeacherByName(teacherName);
        if (Classroom.getAgeGroupByAge(age) != teacher.getAgeGroup())
        {
            printError("Teacher's responsible age group incorrect!");
            return;
        }
        if (!s.assignTeacher(teacher))
        {
            printError("Teacher's student list is full!");
            return;
        }
        modelTable.setValueAt(s, selectedRow, 0);
        JOptionPane.showMessageDialog(view, "Update successful!");
        view.btnConfirm.setVisible(false);
        updateStudentTable();
        clearInput();
        setEditable(false);
        model.updateDB();
    }

    public void addStudent()
    {
        String name = view.txtName.getText();
        String ageText = view.txtAge.getText();
        if (!ageText.matches("[0-9]*"))
        {
            printError("Invalid age!");
            return;
        }
        int age = Integer.parseInt(ageText);
        String parentName = view.txtParName.getText();
        String parentNum = view.txtParNum.getText();
        if (!parentNum.matches("[0-9]*"))
        {
            printError("Invalid phone number!");
            return;
        }
        String address = view.txtAddress.getText();

        Student student = new Student(name, age, parentName, address, parentNum, LocalDate.now());

        if (!model.addStudent(student))
        {
            printError("Student already exists!");
            return;
        }

        String teacherField = (String) view.teacherGroup.getSelectedItem();
        if (teacherField == null)
        {
            printError("Invalid teacher!");
            model.deleteStudentByName(name);
            return;
        }
        String teacherName = teacherField.substring(0, teacherField.indexOf("-"));
        Teacher teacher = model.findTeacherByName(teacherName);
        if (Classroom.getAgeGroupByAge(age) != teacher.getAgeGroup())
        {
            printError("Teacher's responsible age group incorrect!");
            model.deleteStudentByName(name);
            return;
        }
        if (!student.assignTeacher(teacher))
        {
            printError("Teacher's student list is full!");
            model.deleteStudentByName(name);
            return;
        }
        JOptionPane.showMessageDialog(view, "Add successful!");
        view.btnConfirm.setVisible(false);
        updateStudentTable();
        clearInput();
        setEditable(false);
        model.updateDB();

    }

    public void deleteStudent()
    {
        int selectedRow = view.tblStudents.getSelectedRow();
        String studentName = ((Student) view.tblStudents.getModel().getValueAt(selectedRow, 0)).getName();
        model.deleteStudentByName(studentName);
        updateStudentTable();
        model.updateDB();
    }

    public void updateClassroom()
    {
        view.txtClassroom.setEditable(false);
        if (!view.teacherGroup.isEnabled())
        {
            return;
        }

        String teacherField = (String) view.teacherGroup.getSelectedItem();
        if (teacherField == null || teacherField.isEmpty())
        {
            view.txtClassroom.setText("");
            return;
        }
        String teacherName = teacherField.substring(0, teacherField.indexOf("-"));
        if (model.findTeacherByName(teacherName).getClassroom() == null)
            view.txtClassroom.setText("");
        else
        {
            view.txtClassroom.setText(Classroom.getAgeRangeByAgeGroup(model.findTeacherByName(teacherName).getAgeGroup()) + " months");
        }
    }

    public void setEditable(Boolean n)
    {
        view.txtAddress.setEditable(n);
        view.txtAge.setEditable(n);
        view.txtParName.setEditable(n);
        view.txtParNum.setEditable(n);
        view.txtName.setEditable(n);
        view.teacherGroup.setEnabled(n);
        view.btnConfirm.setEnabled(n);
    }

    public void clearInput()
    {
        view.txtAddress.setText("");
        view.txtAge.setText("");
        view.txtParName.setText("");
        view.txtParNum.setText("");
        view.txtName.setText("");
        view.teacherGroup.removeAllItems();
        view.txtDoes.setText("");
        view.txtDate.setText("");
        view.txtVaccineType.setText("");

        view.txtClassroom.setText("");
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
