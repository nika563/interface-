package Vector;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Vector extends JFrame{
    private JButton button = new JButton("AAAAAAAAAAAA");
    private JTextField input = new JTextField("input", 5);
    private JLabel label = new JLabel("input: ");
    private JRadioButton radio1 = new JRadioButton("female");
    private JRadioButton radio2 = new JRadioButton("male");
    private JCheckBox box = new JCheckBox("check", false);

    public Vector(){
        super("Hello world");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contain = this.getContentPane();
        contain.setLayout(new GridLayout(3,2,2,2));
        contain.add(label);
        contain.add(input);
        //group
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        contain.add(radio1);
        radio1.setSelected(true);
        contain.add(radio2);

        contain.add(box);

        button.addActionListener(new ButtonEvent());
        contain.add(button);
    }
    class ButtonEvent implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String message = "";
            message += "Hi!!!!!!!!! " + input.getText() + "\n";
            message += (radio1.isSelected() ? "true": "false") + "\n";
            message += "Check " + (box.isSelected() ? "TRUE": "FALSE") + "\n";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
