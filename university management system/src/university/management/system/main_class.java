package university.management.system;
import javax.swing.*;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Callable;

public class main_class extends  JFrame implements ActionListener {
    main_class(){
       ImageIcon i1= new ImageIcon((ClassLoader.getSystemResource("icon/gurunanakimage.jpg")));
       Image i2 = i1.getImage().getScaledInstance(1560,750, Image.SCALE_DEFAULT);
      ImageIcon i3 = new  ImageIcon(i2);
       JLabel img = new JLabel(i3);
       add(img);

       JMenuBar mb = new JMenuBar();

       // new information//
        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        mb.add(newInfo);

        JMenuItem facultyInfo= new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInfo.add(facultyInfo);

       JMenuItem studentInfo = new JMenuItem("New Student Information");
       studentInfo.setBackground(Color.WHITE);
       studentInfo.addActionListener(this);
       newInfo.add(studentInfo);

        // Details//
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
       details.addActionListener(this);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
       facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        //Leave//
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        leave.addActionListener(this);
        mb.add(leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
         studentLeave.addActionListener(this);
        leave.add(studentLeave);

        // Leave Details//
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
       leaveDetails.addActionListener(this);
        mb.add(leaveDetails);

        JMenuItem facultyLeaveDetails = new JMenuItem("View Faculty Leave Details");
     facultyLeaveDetails .setBackground(Color.WHITE);
     facultyLeaveDetails .addActionListener(this);
       leaveDetails.add(facultyLeaveDetails);

        JMenuItem studentLeaveDetails = new JMenuItem("View Student Leave Details");
     studentLeaveDetails.setBackground(Color.WHITE);
     studentLeaveDetails.addActionListener(this);
        leaveDetails.add(studentLeaveDetails);


        //Upadte info//
        JMenu updateInfo= new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        updateInfo.addActionListener(this);
        mb.add(updateInfo);

        JMenuItem updateFacultyInfo = new JMenuItem("Update Faculty Details");
        updateFacultyInfo.setBackground(Color.WHITE);
        updateFacultyInfo.addActionListener(this);
        updateInfo.add(updateFacultyInfo);

        JMenuItem updateStudentInfo= new JMenuItem("Update Student Details");
        updateStudentInfo.setBackground(Color.WHITE);
        updateStudentInfo.addActionListener(this);
        updateInfo.add(updateStudentInfo);

        //fee//
     JMenu fee= new JMenu("Fee Details");
     fee.setForeground(Color.BLACK);
     fee.addActionListener(this);
     mb.add(fee);

     JMenuItem feeStructure = new JMenuItem("Fee Structure");
     feeStructure.setBackground(Color.WHITE);
     feeStructure.addActionListener(this);
      fee.add(feeStructure);

     JMenuItem feeForm= new JMenuItem("Student Fee Form");
     feeForm.setBackground(Color.WHITE);
     feeForm.addActionListener(this);
     fee.add(feeForm);

     //utility//
     JMenu utility= new JMenu("Utility");
     utility.setForeground(Color.BLACK);
     utility.addActionListener(this);
     mb.add(utility);

     JMenuItem Calculator = new JMenuItem("Calculator");
     Calculator.setBackground(Color.WHITE);
    Calculator.addActionListener(this);
     utility.add(Calculator);

     JMenuItem Notepad = new JMenuItem("Notepad");
     Notepad.setBackground(Color.WHITE);
    Notepad.addActionListener(this);
     utility.add(Notepad);

     //about//
     JMenu about= new JMenu("About");
     about.setForeground(Color.BLACK);
     about.addActionListener(this);
     mb.add(about);

     JMenuItem About = new JMenuItem("About");
     About.setBackground(Color.WHITE);
     About.addActionListener(this);
     about.add(About);

     //exit//
     JMenu exit= new JMenu("Exit");
    exit.setForeground(Color.BLACK);
     mb.add(exit);

     JMenuItem Exit = new JMenuItem("Exit");
     Exit.setBackground(Color.WHITE);
    Exit.addActionListener(this);
     exit.add(Exit);

        setJMenuBar(mb);

        setSize(1540,850);
        setVisible(true);
    }

 @Override
 public void actionPerformed(ActionEvent e) {
     String sm =e.getActionCommand();
  if(sm.equals("Exit")){
   System.exit(13);
  } else if (sm.equals("Calculator")) {
   try {
    Runtime.getRuntime().exec("calc.exe");
   } catch (Exception E) {
    E.printStackTrace();
   }
  }else if (sm.equals("Notepad")){
   try {
    Runtime.getRuntime().exec("notepad.exe");
   } catch (Exception E) {
    E.printStackTrace();
   }
  }
  else if(sm.equals("New Faculty Information")){
   new AddFaculty();
  } else if (sm.equals("New Student Information")) {
   new AddStudent();
  } else if (sm.equals("View Faculty Details")) {
   new TeacherDetails();
  }
  else if(sm.equals("View Student Details")){
   new StudentDetails();
  }
  else if(sm.equals("Faculty Leave")){
   new  TeacherLeave();
  }
  else if(sm.equals("Student Leave")){
   new  StudentLeave();
  }
  else if(sm.equals("View Faculty Leave Details")){
   new TeacherLeaveDetails();
  }
  else if(sm.equals("View Student Leave Details")){
   new StudentLeaveDetails();
  }
else if(sm.equals("Update Faculty Details")){
 new UpdateTeacher();
  }
else if(sm.equals("Update Student Details")){
 new UpdateStudentDetails();
  }
else if(sm.equals("Fee Structure")){
 new FeeStructure();
  }
else if(sm.equals("Student Fee Form")){
 new StudentFeeForm();
  }
else if(sm.equals("About")){
 new About();
  }
 }

 public static void main(String[] args) {
new main_class();
    }
}
