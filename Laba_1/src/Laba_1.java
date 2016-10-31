import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent*;
import java.awt.event.ActionListener*;




public class Lab2 {
    public static void main(String[]args){
        JFrame frame = new JFrame("second");
        JButton btn1 = new JButton("connect");
        JButton btn2 = new JButton("format");
        JButton btn3 = new JButton("delete");
        JButton btn4 = new JButton("record");
        JPanel panel = new JPanel();
        Usbcard usbcard = new Usbcard();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.EAST);
        frame.add(btn3, BorderLayout.CENTER);
        frame.add(btn4, BorderLayout.WEST);

    }
}
