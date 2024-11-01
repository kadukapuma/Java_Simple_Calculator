import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main implements ActionListener {

    JButton button1,button2,button3,button4;
    JTextField input1,input2,output;

    JLabel label;


    public void actionPerformed(ActionEvent e) {
        try {


        if (input1.getText().isEmpty() || input2.getText().isEmpty()) {
            output.setText("⚠️Missing values....");
            return;

        }

            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());

            double sum = 0;


            if (e.getSource() == button1 ) {
                sum = num1 + num2;

            }
            if (e.getSource() == button2) {
                sum = num1 - num2;

            }
            if (e.getSource() == button3) {
                sum = num1 * num2;

            }
            if (e.getSource() == button4) {
                if (num2 == 0 ){
                    output.setText("Cannot Divide by 0");
                    return;
                }
                sum = num1 / num2;

            }

            output.setText(Double.toString(sum));

        }catch (NumberFormatException ex){
            output.setText("❌ Invalid input ️");
        }
    }



    public static void main(String[] args) {

        Main main = new Main();


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setSize(400,500);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setLayout(null);

        main.input1 = new JTextField();
        main.input1.setBounds(50,40,280,50);
        main.input1.setFont(new Font("Arial",Font.BOLD,20));
        main.input1.setBackground(Color.white);
        main.input1.setForeground(Color.BLACK);
        main.input1.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(main.input1);

        main.input2 = new JTextField();
        main.input2.setBounds(50,100,280,50);
        main.input2.setFont(new Font("Arial",Font.BOLD,20));
        main.input2.setBackground(Color.white);
        main.input2.setForeground(Color.BLACK);
        main.input2.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(main.input2);

        main.label = new JLabel();
        main.label.setText("Output");
        main.label.setForeground(Color.white);
        main.label.setBounds(50,280,50,50);
        frame.add(main.label);


        main.output = new JTextField();
        main.output.setBounds(50,320,280,50);
        main.output.setFont(new Font("Segoe UI Emoji", Font.BOLD,20));
        main.output.setBackground(Color.white);
        main.output.setForeground(Color.BLACK);
        main.output.setHorizontalAlignment(SwingConstants.CENTER);
        main.output.setEditable(false);
        frame.add(main.output);

//buttons
        main.button1 = new JButton("+");
        main.button1.setBounds(50,180,65,50);
        main.button1.setBackground(Color.blue);
        main.button1.setFont(new Font("Arial", Font.BOLD, 30));
        main.button1.addActionListener(main);
        frame.add(main.button1);

        main.button2 = new JButton("-");
        main.button2.setBounds(122,180,65,50);
        main.button2.setBackground(Color.yellow);
        main.button2.setFont(new Font("Arial", Font.BOLD, 30));
        main.button2.addActionListener(main);
        frame.add(main.button2);

        main.button3 = new JButton("*");
        main.button3.setBounds(192,180,65,50);
        main.button3.setBackground(Color.red);
        main.button3.setFont(new Font("Arial", Font.BOLD, 30));
        main.button3.addActionListener(main);
        frame.add(main.button3);

        main.button4 = new JButton("/");
        main.button4.setBounds(262,180,65,50);
        main.button4.setBackground(Color.green);
        main.button4.setFont(new Font("Arial", Font.BOLD, 30));
        main.button4.addActionListener(main);
        frame.add(main.button4);

        frame.setVisible(true);
    }
}