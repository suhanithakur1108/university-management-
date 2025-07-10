package university.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public  class  AddFaculty extends JFrame implements ActionListener {

    JTextField textName, textFather,textAddress,textphone,textemail,textm10,textm12,textaadhar;
    JLabel empText;
    JDateChooser cdob;
    JComboBox courseBox,departmentBox;
    JButton submit ,cancel;

    Random ran = new Random();
    long f4=Math.abs((ran.nextLong()%9000L)+1000L);

    AddFaculty(){
      getContentPane().setBackground(new Color(166,164,252));


        JLabel heading = new JLabel("New Teacher Details ");
         heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
       add(heading);

       JLabel name = new JLabel("Name");
       name.setBounds(50,150,100,30);
       name.setFont(new Font("serif", Font.BOLD, 20));
      add(name);

      textName = new JTextField();
      textName.setBounds(200,150,150,30);
      add(textName);

      //Father name//
        JLabel fname = new JLabel("Father Name");
        fname.setBounds(400,150,150,30);
        fname.setFont(new Font("serif", Font.BOLD, 20));
        add(fname);

        textFather = new JTextField();
        textFather.setBounds(600,150,150,30);
        add(textFather);

        //employee id
        JLabel empID = new JLabel("Employee ID");
      empID.setBounds(50,200,150,30);
        empID.setFont(new Font("serif", Font.BOLD, 20));
        add(empID);

        empText = new JLabel("2208"+f4);
        empText.setBounds(200,200,150,30);
        empText.setFont(new Font("serif", Font.BOLD, 20));
        add(empText);

        //date of birth
        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(400,200,150,30);
        dob.setFont(new Font("serif", Font.BOLD, 20));
        add(dob);

       cdob =new JDateChooser();
       cdob.setBounds(600,200,150,30);
       add(cdob);

       //address
        JLabel address = new JLabel("Address");
        address.setBounds(50,250,200,30);
        address.setFont(new Font("serif", Font.BOLD, 20));
        add(address);

        textAddress = new JTextField();
        textAddress.setBounds(200,250,150,30);
        add(textAddress);

        //phone number//
        JLabel phone = new JLabel("Phone Number");
        phone.setBounds(400,250,200,30);
        phone.setFont(new Font("serif", Font.BOLD, 20));
        add(phone);

        textphone = new JTextField();
        textphone.setBounds(600,250,150,30);
        add(textphone);

        //email
        JLabel email = new JLabel("Email");
        email.setBounds(50,300,200,30);
        email.setFont(new Font("serif", Font.BOLD, 20));
        add(email);

        textemail = new JTextField();
        textemail.setBounds(200,300,150,30);
        add(textemail);

        // class 10 marks
        JLabel m10 = new JLabel("Class X (%)");
        m10.setBounds(400,300,200,30);
        m10.setFont(new Font("serif", Font.BOLD, 20));
        add(m10);

        textm10 = new JTextField();
        textm10.setBounds(600,300,150,30);
        add(textm10);

        //class 12 marks
        JLabel m12 = new JLabel("Class XII (%)");
        m12.setBounds(50,350,200,30);
        m12.setFont(new Font("serif", Font.BOLD, 20));
        add(m12);

        textm12 = new JTextField();
        textm12.setBounds(200,350,150,30);
        add(textm12);

        //Aadhar Number
        JLabel AadharNo = new JLabel("Aadhar Number");
        AadharNo.setBounds(400,350,200,30);
        AadharNo.setFont(new Font("serif", Font.BOLD, 20));
        add(AadharNo);

        textaadhar= new JTextField();
        textaadhar.setBounds(600,350,150,30);
        add(textaadhar);

        //Qualification
        JLabel Qualification = new JLabel("Qualification");
        Qualification.setBounds(50,400,200,30);
        Qualification.setFont(new Font("serif", Font.BOLD, 20));
        add(Qualification);

        String course[]={"B.Tech","BBA","BSC","MSC","MBA","MCom","MA","BA","LAW","M.TECH"};
        courseBox = new JComboBox(course);
        courseBox.setBounds(200,400,150,30);
        courseBox.setBackground(Color.WHITE);
        add(courseBox);

        JLabel Department = new JLabel("Department");
        Department.setBounds(400,400,200,30);
        Department.setFont(new Font("serif", Font.BOLD, 20));
        add(Department);

        String department[]={"Computer Science","Electronics and Communication","Electronics and Computer","Mechanical","Civil"};
        departmentBox = new JComboBox(department);
        departmentBox.setBounds(600,400,150,30);
        departmentBox.setBackground(Color.WHITE);
        add(departmentBox);

        //submit
        submit= new JButton("Submit");
        submit.setBounds(250,550,150,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        //cancel
        cancel= new JButton("Cancel");
       cancel.setBounds(450,550,150,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==submit){
    String name =textName.getText();
    String fname= textFather.getText();
    String empID =empText.getText();
    String dob= ((JTextField)cdob.getDateEditor().getUiComponent()).getText();
    String address =textAddress.getText();
    String phone =textphone.getText();
    String email =textemail.getText();
    String x= textm10.getText();
    String xII= textm12.getText();
    String aadhar =textaadhar.getText();
    String course =(String)courseBox.getSelectedItem();
    String department =(String)departmentBox.getSelectedItem();
    try{
        String q= "insert into teacher values('"+name+"', '"+fname+"','"+empID+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xII+"','"+aadhar+"','"+course+"','"+department+"')";
        Conn c= new Conn();
        c.statement.executeUpdate(q);
        JOptionPane.showMessageDialog(null,"Details Inserted");
           setVisible(false);
    }
    catch (Exception E){
        E.printStackTrace();
    }
    }
else {
    setVisible(false);
}
}
    public static void main(String[] args) {
        new AddFaculty();
    }
}
