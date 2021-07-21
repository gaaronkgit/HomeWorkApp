import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame
{
    public MyWindow()
    {
        setVisible(true);
        setLocation(500,200);
        setSize(500,600);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1,2));

        JButton btn = new JButton("Exit");
        ActionListener listener = new CloseActionListener();
        btn.addActionListener(listener);


        JButton btn1 = new JButton("Btn");

        panel.add(btn);
        panel.add(btn1);
        add(panel, BorderLayout.SOUTH);
    }
}
