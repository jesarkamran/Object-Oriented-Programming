import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class AssGUI extends JFrame
{
    AssGUI() 
    {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); setLayout(new GridLayout(6,0));

        JButton button1 = new JButton("Add");
        JButton button2 = new JButton("Search");
        JButton button3 = new JButton("Update");
        JButton button4 = new JButton("Delete");
        JButton button5 = new JButton("Display");
        JButton button6 = new JButton("Exit");
        MyActionListener1 action = new MyActionListener1();
        button1.addActionListener(action);
        button2.addActionListener(action);
        button3.addActionListener(action);
        button4.addActionListener(action);
        button5.addActionListener(action);
        button6.addActionListener(action);
        add(button1); add(button2);
        add(button3); add(button4);
        add(button5); add(button6);
    }
    class MyActionListener1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            // System.exit(0);
            if (e.getActionCommand().equals("Add")) {
                new Activity2();
            }
            else if (e.getActionCommand().equals("Update")) 
            {
                new Update();
            }
            else if (e.getActionCommand().equals("Search")) {
                new Search();
            }
            else if (e.getActionCommand().equals("Delete")) {
                new Delete();
            }
            else if (e.getActionCommand().equals("Display")) {
                new Display();
            }
            else if (e.getActionCommand().equals("Exit")) {
                System.exit(0);
            }
        }
    }
}
