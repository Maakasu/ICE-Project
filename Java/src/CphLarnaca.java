import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class CphLarnaca {

    JFrame frame = new JFrame("bitches");

    JLabel pictureLabel = new JLabel("");

    JLabel jLabel = new JLabel("Adults:");
    JLabel jLabel1 = new JLabel("Children u13:");

    JLabel jLabel2 = new JLabel("Baggage:");

    JLabel price = new JLabel("Total Price: ???kr.");
    JSpinner jspinner = new JSpinner();
    JSpinner jSpinner1 = new JSpinner();

    JSpinner jSpinner2 = new JSpinner();

    ImageIcon image = new ImageIcon("nissiBeach.jpg");


    CphLarnaca() {
        jspinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                calculatePrice((Integer) jspinner.getValue(), (Integer)jSpinner1.getValue(), (Integer)jSpinner2.getValue());
            }
        });
        jSpinner1.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                calculatePrice((Integer) jspinner.getValue(), (Integer)jSpinner1.getValue(), (Integer)jSpinner2.getValue());
            }
        });
        jSpinner2.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                calculatePrice((Integer) jspinner.getValue(), (Integer)jSpinner1.getValue(), (Integer)jSpinner2.getValue());
            }
        });


        pictureLabel.setBounds(0,0,800,800);
        pictureLabel.setIcon(image);

        jLabel.setBounds(50,200,300,25);
        jLabel1.setBounds(15,250,300,25);
        jLabel2.setBounds(35,300,300,25);

        jspinner.setBounds(100,200,75,25);
        jSpinner1.setBounds(100,250,75,25);
        jSpinner2.setBounds(100,300,75,25);

        price.setBounds(175,325,150,25);



        frame.add(jLabel);
        frame.add(jspinner);
        frame.add(jLabel1);
        frame.add(jSpinner1);
        frame.add(jLabel2);
        frame.add(jSpinner2);
        frame.add(price);

        frame.add(pictureLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    private void calculatePrice(int Adult,int children, int baggage){
        double cost = Adult * 3000 + children * 1000 + baggage * 700;
        price.setText("Price: " + cost + " kr.");

    }
}
