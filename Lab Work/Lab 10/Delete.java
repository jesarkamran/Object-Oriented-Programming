import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.File;
public class Delete extends JFrame
{
    JTextField search = new JTextField("Enter Name to Delete ");

    Delete()
    {
        setSize(400,400); setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); setLayout(new GridLayout(3,0));
        JButton enter = new JButton("Enter");
        JButton home = new JButton("Home");

        MyActionListener1 act = new MyActionListener1();
        enter.addActionListener(act);
        home.addActionListener(act);

        add(search); add(enter);
        
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
                    dataDeletion(); 
                    if (!showsDataSearched()) 
                    {
                        JOptionPane.showMessageDialog(new JFrame(), "Data Deleted");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(new JFrame(), "Data Deletion Failed");
                }
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
                return true;
            }
        }
        return false;
    }

    public void dataDeletion()
    {
        int j = 0;
        for (int i = 0; i < s.size(); i++) 
        {
            if(s.get(i).getName().equals(search.getText()))
            {
                s.remove(i); j = 1;
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
}
