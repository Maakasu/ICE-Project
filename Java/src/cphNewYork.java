import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class cphNewYork {


    JFrame frame = new JFrame("cphNewYork");

    JLabel pictureLabel = new JLabel("");

    JLabel price = new JLabel("Total Price: ???kr.");

    JLabel jLabel = new JLabel("Adults:");
    JLabel jLabel1 = new JLabel("Children u13:");
    JLabel jLabel2 = new JLabel("Baggage:");

    JButton buyButton = new JButton("Buy");


    JSpinner jspinner = new JSpinner();
    JSpinner jSpinner1 = new JSpinner();
    JSpinner jSpinner2 = new JSpinner();
    ImageIcon image = new ImageIcon("NewYork.jpg");

    cphNewYork() {

        jspinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                calculatePrice((Integer) jspinner.getValue(), (Integer) jSpinner1.getValue(), (Integer) jSpinner2.getValue());
            }
        });
        jSpinner1.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                calculatePrice((Integer) jspinner.getValue(), (Integer) jSpinner1.getValue(), (Integer) jSpinner2.getValue());
            }
        });
        jSpinner2.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                calculatePrice((Integer) jspinner.getValue(), (Integer) jSpinner1.getValue(), (Integer) jSpinner2.getValue());
            }
        });

        pictureLabel.setBounds(0, 0, 800, 800);
        pictureLabel.setIcon(image);

        jLabel.setBounds(50, 200, 75, 25);
        jLabel1.setBounds(15, 250, 75, 25);
        jLabel2.setBounds(35, 300, 75, 25);

        jspinner.setBounds(100, 200, 75, 25);
        jSpinner1.setBounds(100, 250, 75, 25);
        jSpinner2.setBounds(100, 300, 75, 25);
        buyButton.setBounds(500, 325, 150, 25);
        price.setBounds(175, 325, 200, 25);

        frame.add(jLabel);
        frame.add(jspinner);
        frame.add(jLabel1);
        frame.add(jSpinner1);
        frame.add(jLabel2);
        frame.add(jSpinner2);
        frame.add(price);
        frame.add(buyButton);

        frame.add(pictureLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void calculatePrice(int Adult,int children, int baggage) {
        double cost = Adult * 3000 + children * 1000 + baggage * 700;
        price.setText("Price: " + cost + " kr.");
    }




        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == buyButton) {
                //price
            }
        }
    }

