package edu.neu.csye6200;

import edu.neu.csye6200.Model.Classroom;
import edu.neu.csye6200.Model.DayCare;
import edu.neu.csye6200.Model.Student;
import edu.neu.csye6200.Model.Teacher;
import edu.neu.csye6200.View.MainJFrame;

import java.time.LocalDate;

public class Application
{
    public static void main(String[] args)
    {
        DayCare context = new DayCare();

        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // start the application
        java.awt.EventQueue.invokeLater(() -> new MainJFrame(context).setVisible(true));
    }
}
