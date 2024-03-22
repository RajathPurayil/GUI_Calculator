
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] FunctionsButtons = new JButton[8];
    JButton[] addButton, subButton, mulBuutons, divButtions, clrJButton;
    JPanel panel;
    Font myfont = new Font("Ink  Free,", Font.BOLD, 30);
    double num1 = 0, num2 = 0, result = 0;
    char operators;

 Calculator () {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textfield.setFont(myfont);



        frame.add(textfield);
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

