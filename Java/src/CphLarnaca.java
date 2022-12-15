import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;

public class CphLarnaca {

    JFrame frame = new JFrame("cphLanarca");

    JLabel pictureLabel = new JLabel("");

    JLabel adultText = new JLabel("Adults:");
    JLabel childrenText = new JLabel("Children u13:");

    JLabel baggageText = new JLabel("Baggage:");

    JButton buyButton = new JButton("Buy");

    JLabel price = new JLabel("Total Price: ???kr.");
    JSpinner adultSpinner = new JSpinner();
    JSpinner childrenSpinner = new JSpinner();

    JSpinner baggageSpinner = new JSpinner();

    ImageIcon image = new ImageIcon("nissiBeach.jpg");


    CphLarnaca() {
        adultSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                calculatePrice((Integer) adultSpinner.getValue(), (Integer) childrenSpinner.getValue(), (Integer) baggageSpinner.getValue());
            }
        });
        childrenSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                calculatePrice((Integer) adultSpinner.getValue(), (Integer) childrenSpinner.getValue(), (Integer) baggageSpinner.getValue());
            }
        });
        baggageSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                calculatePrice((Integer) adultSpinner.getValue(), (Integer) childrenSpinner.getValue(), (Integer) baggageSpinner.getValue());
            }
        });


        pictureLabel.setBounds(0, 0, 800, 800);
        pictureLabel.setIcon(image);

        adultText.setBounds(50, 200, 300, 25);
        childrenText.setBounds(15, 250, 300, 25);
        baggageText.setBounds(35, 300, 300, 25);


        adultSpinner.setBounds(100, 200, 75, 25);
        childrenSpinner.setBounds(100, 250, 75, 25);
        baggageSpinner.setBounds(100, 300, 75, 25);

        price.setBounds(175, 325, 150, 25);

        buyButton.setBounds(500, 325, 150, 25);


        frame.add(adultText);
        frame.add(adultSpinner);
        frame.add(childrenText);
        frame.add(childrenSpinner);
        frame.add(baggageText);
        frame.add(baggageSpinner);
        frame.add(price);
        frame.add(buyButton);

        frame.add(pictureLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void calculatePrice(int Adult, int children, int baggage) {
        double cost = Adult * 3000 + children * 1000 + baggage * 700;
        price.setText("Total price: " + cost + " kr.");

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buyButton) {
            //price
        }
    }
}