package Assm;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame {

    JPanel container = new JPanel();
    JLabel cmdText = new JLabel("command: ");
    JTextField cmdField = new JTextField(20);
    JTextArea lineArea = new JTextArea(100,50);
    JTextArea printArea = new JTextArea(100,50);

    JTextArea registerPrint = new JTextArea(100, 50);

    public void append(String CmdInput) {
        Parser ps = new Parser();
        ps.assmparser(CmdInput, lineArea, printArea);
        cmdField.setText("");
//        lineArea.append("line " + i++ + " > "+ print + "\n");
        setVisible(true);
    }

    public void start() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("assembler");
        setSize(screenSize.width, screenSize.height);
        container.add(cmdText);
        container.add(cmdField);
        setLayout(new BorderLayout());
        add(printArea, BorderLayout.EAST);
        add(lineArea, BorderLayout.WEST);
        add(container, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        cmdField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CmdInput = cmdField.getText();
                append(CmdInput);
                setVisible(true);
            }
        });

    }

}