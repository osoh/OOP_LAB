import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Laba_1 {
    public static void main(String[]args){
        JFrame frame = new JFrame("first");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JButton btn = new JButton("Result");
        JTextField str1 = new JTextField();
        JTextField str2 = new JTextField();
        JTextField res = new JTextField();
        GridLayout gbl = new GridLayout(4,0);
        frame.setLayout(gbl);
        frame.getContentPane().add(str1);
        frame.getContentPane().add(str2);
        frame.getContentPane().add(btn);
        frame.getContentPane().add(res);
        frame.setSize(400,400);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String a;
                String b;
                a = str1.getText();
                b = str2.getText();
                for (int i = 0; i < b.length(); i++) {
                    a = a.replaceAll(b.charAt(i) + "", "");
                    res.setText(a);
                }
            }
        });
    }
}
