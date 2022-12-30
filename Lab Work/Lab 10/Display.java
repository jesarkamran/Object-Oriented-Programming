import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
public class Display extends JFrame
{
   JButton show = new JButton("Show Data of All");
   JButton home = new JButton("Home");
    Display()
    {
        setSize(400,400); setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); setLayout(new GridLayout(2,0));
        MyActionListener act = new MyActionListener();
        show.addActionListener(act);
        home.addActionListener(act);
        add(show); add(home);
    }

    public class MyActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if (e.getActionCommand().equals("Show Data of All")) 
            {
                Serialization ser = new Serialization();
                ArrayList<Student> list = ser.objectsIntoArrayList();
                String str = "Display of All Data\n";
                for (int i = 0; i < list.size(); i++) 
                {
                    str += list.get(i).toString()+"\n";
                }
                JOptionPane.showMessageDialog(new JFrame(),str);
            }
            else if (e.getActionCommand().equals("Home"))
            {
                dispose();
            }
        }
    }
}
