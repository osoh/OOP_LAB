import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class usbcard{
    int Total_memory;
    int Used_memory;
    int Free_memory;
    int amount_of_files;
    boolean connected;

    @Override
    public String toString() {
        return "usbcard{" +
                "Total_memory:  " + Total_memory +
                ", Used_memory: " + Used_memory +
                ", Free_memory: " + Free_memory +
                ", amount_of_files: " + amount_of_files +
                ", connected: " + connected +
                '}';
    }

    void connect (int tm, int um, int fm, int a){
        Total_memory = tm;
        Used_memory = um;
        Free_memory = fm;
        amount_of_files = a;
        connected = true;
    }

    void record (){
        if(connected) {
                if (Free_memory == 0) {
                    System.out.println("not enough memory");
                } else {
                    Free_memory = Free_memory - 128;
                    Used_memory = Used_memory + 128;
                    amount_of_files = amount_of_files + 1;
                }
        }
        else {
            System.out.println("Please connect usb-card");
        }
    }

    void delete (){
        if (connected){
                if (amount_of_files == 0) {
                    System.out.println("All files are deleted");
                } else {
                    Free_memory = Free_memory + 128;
                    Used_memory = Used_memory - 128;
                    amount_of_files = amount_of_files - 1;
                }
        }
        else {
            System.out.println("Please connect usb-card");
        }
    }

    void format (){
        if (connected){
                if (amount_of_files <= 0) {
                    System.out.println("Formatting finished");
                } else {
                    Free_memory = 1024;
                    Used_memory = 0;
                    amount_of_files = 0;
                }
        }
        else {
            System.out.println("Please connect usb-card");
        }
    }
}

public class Main {

    public static void main(String[]args){
        JFrame frame = new JFrame("USB-card");
        JButton btn1 = new JButton("connect");
        JButton btn2 = new JButton("format");
        JButton btn3 = new JButton("delete");
        JButton btn4 = new JButton("record");
        JPanel panel = new JPanel();
        usbcard USBcard = new usbcard();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.add(btn1, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(1,3));
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                USBcard.connect(1024, 0, 1024, 0);
                System.out.println(USBcard);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                USBcard.format();
                System.out.println(USBcard);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                USBcard.delete();
                System.out.println(USBcard);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                USBcard.record();
                System.out.println(USBcard);
            }
        });
    }
}
