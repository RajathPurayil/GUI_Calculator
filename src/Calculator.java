
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.Integer.parseInt;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textfield= new JTextField();
    JButton[] numberButtons = new JButton[10];
    JPanel panel= new JPanel();

    JButton[] FunctionsButtons = new JButton[9];
    JButton addButton,decButton,DelButtion,equButton,subButton, mulButons, divButtions, clrJButton,neggButton;


    Font myfont = new Font("Ink  Free,", Font.BOLD, 30);
    double num1 = 0, num2 = 0, result = 0;
    String operators;

       Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setVisible(true);

        textfield = new JTextField();
        textfield.setBounds(50,25,300,50);


        textfield.setFont(myfont);

        frame.add(textfield);
        frame.setVisible(true);
        textfield.setEditable(false);
        textfield.setVisible(true);
           panel.setVisible(true);
        frame.add(decButton);
      //  frame.add(clrJButton);

        addButton = new JButton("+");



     subButton = new JButton("-");

     mulButons= new JButton("*");
     divButtions = new JButton("/");
     equButton = new JButton("=");
     clrJButton= new JButton("Clear");
     DelButtion= new JButton("Delete");
     decButton = new JButton("Decimal");
      neggButton = new JButton("(-)");
      frame.add(textfield);

     FunctionsButtons[0]= addButton;
     FunctionsButtons[1]= subButton;
     FunctionsButtons[3]= mulButons;
     FunctionsButtons[4]= divButtions;
     FunctionsButtons[5]=  decButton;
     FunctionsButtons[6]=  equButton;
     FunctionsButtons[0]= clrJButton;
     FunctionsButtons[0]=  DelButtion;


     for(int i = 0;i<9;i++) {

         FunctionsButtons[i].addActionListener(this);
         FunctionsButtons[i].setFont(myfont);
         FunctionsButtons[i].setFocusable(false);

     for (i = 0; i<10; i++)
     {

         numberButtons[i]= new JButton(String.valueOf(i));

     }

     DelButtion.setBounds(50,430,145,50);
     clrJButton.setBounds(205,430,145,50);
     neggButton.setBounds(5,430,100,50);
     frame.add(clrJButton);


     panel.setBounds(50,100,300,300);
     panel.setLayout(new GridLayout(4,4,10,10));


     panel.add(numberButtons[1]);
     panel.add(numberButtons[2]);
     panel.add(numberButtons[3]);
     panel.add(addButton);
     panel.add(neggButton);


         panel.add(numberButtons[4]);
         panel.add(numberButtons[5]);
         panel.add(numberButtons[6]);

         panel.add(subButton);
         panel.add(numberButtons[7]);
         panel.add(numberButtons[8]);
         panel.add(numberButtons[9]);
        panel.add(mulButons);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButtions);


     }



 }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
     for (int i =0;i<10;i++){

         if (e.getSource() == numberButtons[i]) {

             textfield.setText(textfield.getText().concat(String.valueOf(i)));
         }

         if(e.getSource()==decButton)
         {

             textfield.setText(textfield.getText().concat(String.valueOf(".")));
         }
         if(e.getSource()==addButton)
         {
             num1=Double.parseDouble(textfield.getText());
             operators ="+";
             textfield.setText("");}

         if (e.getSource()==subButton){
             num1=Double.parseDouble(textfield.getText());
             operators ="-";
             textfield.setText("");}

           //  textfield.setText(textfield.getText().concat(String.valueOf(".")));
         if (e.getSource()==mulButons){
         num1=Double.parseDouble(textfield.getText());
         operators ="*";
         textfield.setText("");
         }

         if (e.getSource()==divButtions)
         {
             num1=Double.parseDouble(textfield.getText());
             operators ="/";
             textfield.setText("");}

         }

     if (e.getSource()==equButton)
     {

         num2=Double.parseDouble(textfield.getText());
         operators ="=";
         textfield.setText("");


     switch (operators)
     {
         case "+" :

             result=num1+num2;
             break;

         case "-":

             result=num1-num2;
             break;

         case"*":

             result= num1+num2;
             break;

         case"/":

             result=num1/num2;
             break;
     }
     }
     textfield.setText(String.valueOf(result));

     num1=result;

     if (e.getSource()==clrJButton)
     {

textfield.setText("");

     }
        if (e.getSource() == DelButtion) {

            String string = textfield.getText();

            textfield.setText("");

            for (int i =0;i<string.length()-1;i++)
            {

                textfield.setText(textfield.getText()+string.charAt(i));
            }

            if (e.getSource()==neggButton)
            {

                double temp = Double.parseDouble(textfield.getText());
                temp*=-1;

                textfield.setText(String.valueOf(temp));
            }
        }

}
     }










