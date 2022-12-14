import javax.swing.*;
import java.awt.*;

public class CphLarnaca {

    JFrame frame = new JFrame("bitches");



    JLabel jLabel = new JLabel("Adults:");
    JLabel jLabel1 = new JLabel("Children u13:");

    JLabel jLabel2 = new JLabel("Baggage:");


    JSpinner jspinner = new JSpinner();
    JSpinner jSpinner1 = new JSpinner();

    JSpinner jSpinner2 = new JSpinner();

    ImageIcon image = new ImageIcon("img.png");


    CphLarnaca() {







        jLabel.setBounds(50,200,75,25);
        jLabel1.setBounds(15,250,75,25);
        jLabel2.setBounds(35,300,75,25);

        jspinner.setBounds(100,200,75,25);
        jSpinner1.setBounds(100,250,75,25);
        jSpinner2.setBounds(100,300,75,25);

        frame.add(jLabel);
        frame.add(jspinner);
        frame.add(jLabel1);
        frame.add(jSpinner1);
        frame.add(jLabel2);
        frame.add(jSpinner2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
