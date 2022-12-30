import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Activity2 extends JFrame
{
    JLabel label1 = new JLabel("Name");
    JLabel label2 = new JLabel("Phone");
    JLabel label3 = new JLabel("Gender");
    JLabel label4 = new JLabel("Dept Name");
    JLabel label5 = new JLabel("Dept Location");
    JLabel label6 = new JLabel("GPA");
    JLabel label7 = new JLabel("Semester");
    JLabel label8 = new JLabel("Section");

    JTextField text1 = new JTextField(20);
    JTextField text2 = new JTextField(20);
    JTextField text3 = new JTextField(20);
    JTextField text4 = new JTextField(20);
    JTextField text5 = new JTextField(20);
    JTextField text6 = new JTextField(20);
    JTextField text7 = new JTextField(20);
    JTextField text8 = new JTextField(20);
    Activity2() 
    {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); setLayout(new GridLayout(9,2));
        

        JButton b1 = new JButton("Submit");
        JButton b2 = new JButton("Home");
        MyActionListener a1 = new MyActionListener();
        MyActionListener2 a2 = new MyActionListener2();

        b1.addActionListener(a1);
        b2.addActionListener(a2);

        add(label1); add(text1);
        add(label2); add(text2);
        add(label3); add(text3);
        add(label4); add(text4);
        add(label5); add(text5);
        add(label6); add(text6);
        add(label7); add(text7);
        add(label8); add(text8);
        add(b1); add(b2);
    }

    class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getActionCommand().equals("Submit")) 
            {
                String name = text1.getText();
                String phone = text2.getText();
                String gender = text3.getText();
                String dptname = text4.getText();
                String dptLocation = text5.getText();
                double gpa = Double.parseDouble(text6.getText());
                int sem = Integer.parseInt(text7.getText());
                String sect = text8.getText();

                Departments d = new Departments(dptname, dptLocation);
                Student s1 = new Student(name, phone, gender,d,gpa,sem,sect);
                JOptionPane.showMessageDialog(new JFrame(), s1.toString()+"\n\tSubmitted");
                Serialization ser = new Serialization();
                ser.dataWriting(s1, true);
            }
        }
    }
    class MyActionListener2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getActionCommand().equals("Home")) {
                dispose();
            }
        }
    }
    
}
