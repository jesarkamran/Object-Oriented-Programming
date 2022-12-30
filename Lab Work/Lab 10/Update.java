import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.File;
public class Update extends JFrame
{
    JTextField search = new JTextField("Enter Name to Update GPA");
    JTextField gpa = new JTextField("Enter GPA to Update ");
    JButton gpab = new JButton("EnterGPA");

    JLabel label1 = new JLabel("Name");
    JLabel label2 = new JLabel("Phone");
    JLabel label3 = new JLabel("Gender");
    JLabel label4 = new JLabel("Dept Name");
    JLabel label5 = new JLabel("Dept Location");
    JLabel label6 = new JLabel("GPA");
    JLabel label7 = new JLabel("Semester");
    JLabel label8 = new JLabel("Section");
    
    //Labels Declaration an Initialization
    // To Show Output
    JLabel text2 = new JLabel();
    JLabel text3 = new JLabel();
    JLabel text4 = new JLabel();
    JLabel text5 = new JLabel();
    JLabel text6 = new JLabel();
    JLabel text7 = new JLabel();
    JLabel text8 = new JLabel();
    JLabel text9 = new JLabel();

    Update()
    {
        setSize(400,400); setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); setLayout(new GridLayout(11,2));
        JButton enter = new JButton("Enter");
        JButton home = new JButton("Home");

        MyActionListener1 act = new MyActionListener1();
        enter.addActionListener(act);
        gpab.addActionListener(act);
        home.addActionListener(act);

        add(search); add(enter);
        add(gpa); add(gpab); gpa.setVisible(false); gpab.setVisible(false);
        add(label1); label1.setVisible(false); add(text2); text2.setVisible(false);
        add(label2); label2.setVisible(false); add(text3); text3.setVisible(false);
        add(label3); label3.setVisible(false); add(text4); text4.setVisible(false);
        add(label4); label4.setVisible(false); add(text5); text5.setVisible(false);
        add(label5); label5.setVisible(false); add(text6); text6.setVisible(false);
        add(label6); label6.setVisible(false); add(text7); text7.setVisible(false);
        add(label7); label7.setVisible(false); add(text8); text8.setVisible(false);
        add(label8); label8.setVisible(false); add(text9); text9.setVisible(false);
        add(home);
    
    }
    class MyActionListener1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getActionCommand().equals("Enter")) 
            {
                if(showsDataSearched())
                {
                    gpa.setVisible(true); gpab.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(new JFrame(), "Data Not Found");
                }
            }
            else if (e.getActionCommand().equals("EnterGPA")) 
            {
                dataUpgrade(); showSearched();
            }
            else if (e.getActionCommand().equals("Home")) {
                dispose();
            }
        }
    }
    Serialization ser = new Serialization();
    ArrayList<Student> s = ser.objectsIntoArrayList();
    File file = new File("Data.ser");

    public boolean showsDataSearched()
    {
        for (int i = 0; i < s.size(); i++) 
        {
            if(s.get(i).getName().equals(search.getText()))
            {
                JOptionPane.showMessageDialog(new Frame(), "Data Found");
                return true;
            }
        }
        return false;
    }

    public void dataUpgrade()
    {
        int j = 0;
        for (int i = 0; i < s.size(); i++) 
        {
            if(s.get(i).getName().equals(search.getText()))
            {
                double val = Double.parseDouble(gpa.getText());
                s.get(i).setGpa(val); j = 1; 
                break;
            }
        }
        if (j == 1) 
        {
            try 
            {
                ser.deleteFile(file);
            } catch (Exception e) {
                //TODO: handle exception
            }
            for (int i = 0; i < s.size(); i++) {
                ser.dataWriting(s.get(i), true);
            }
        }
    }
    public void  showSearched()
    {
        int j = 0;
        ArrayList<Student> student = ser.objectsIntoArrayList();
        for (int i = 0; i < student.size(); i++) 
        {
            if(student.get(i).getName().equals(search.getText()))
            {
                JOptionPane.showMessageDialog(new Frame(), "Data Found will be Visible on Screen");
                text2.setText(student.get(i).getName()); label1.setVisible(true); text2.setVisible(true);
                text3.setText(student.get(i).getPhone()); label2.setVisible(true); text3.setVisible(true);
                text4.setText(student.get(i).getGender()); label3.setVisible(true); text4.setVisible(true);
                text5.setText(student.get(i).getDept().getName()); label4.setVisible(true); text5.setVisible(true);
                text6.setText(student.get(i).getDept().getLocation());label5.setVisible(true); text6.setVisible(true);
                String str = "";
                text7.setText(str+student.get(i).getGpa());label6.setVisible(true); text7.setVisible(true); str ="";
                text8.setText(str+student.get(i).getSemester());label7.setVisible(true); text8.setVisible(true);
                text9.setText(student.get(i).getSection());label8.setVisible(true); text9.setVisible(true);
                j = 1;
                break;
            }
        }
        if (j == 0) 
        {
            JOptionPane.showMessageDialog(new Frame(), "Data Not Found");
        }
    }
}
