import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class Search extends JFrame
{
    JLabel label1 = new JLabel("Name");
    JLabel label2 = new JLabel("Phone");
    JLabel label3 = new JLabel("Gender");
    JLabel label4 = new JLabel("Dept Name");
    JLabel label5 = new JLabel("Dept Location");
    JLabel label6 = new JLabel("GPA");
    JLabel label7 = new JLabel("Semester");
    JLabel label8 = new JLabel("Section");
    
    JTextField text1 = new JTextField("Enter Name to Search");
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
    
    Search()
    {
        setSize(400,400); setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); setLayout(new GridLayout(10,2));

        JButton search = new JButton("Enter");
        JButton home = new JButton("Home");
        MyActionListener1 act1 = new MyActionListener1();
        
        search.addActionListener(act1);
        home.addActionListener(act1);
        add(text1); add(search);
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
            if (e.getActionCommand().equals("Enter")) {
                showsDataSearched();
            }
            else if (e.getActionCommand().equals("Home")) {
                dispose();
            }
        }
    }
    
    public void showsDataSearched()
    {
        Serialization ser = new Serialization();
        ArrayList<Student> s = ser.objectsIntoArrayList();
        int j = 0;
        for (int i = 0; i < s.size(); i++) 
        {
            if(s.get(i).getName().equals(text1.getText()))
            {
                JOptionPane.showMessageDialog(new JFrame(), "Data Found will be Visible on Screen");
                text2.setText(s.get(i).getName()); label1.setVisible(true); text2.setVisible(true);
                text3.setText(s.get(i).getPhone()); label2.setVisible(true); text3.setVisible(true);
                text4.setText(s.get(i).getGender()); label3.setVisible(true); text4.setVisible(true);
                text5.setText(s.get(i).getDept().getName()); label4.setVisible(true); text5.setVisible(true);
                text6.setText(s.get(i).getDept().getLocation());label5.setVisible(true); text6.setVisible(true);
                String str = "";
                text7.setText(str+s.get(i).getGpa());label6.setVisible(true); text7.setVisible(true); str ="";
                text8.setText(str+s.get(i).getSemester());label7.setVisible(true); text8.setVisible(true);
                text9.setText(s.get(i).getSection());label8.setVisible(true); text9.setVisible(true);
                j = 1;
                break;
            }
        }
        if (j == 0) {
            JOptionPane.showMessageDialog(new Frame(), "Data Not Found");
        }
    }
}
