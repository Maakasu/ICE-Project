import javax.swing.*;
import java.awt.*;

public class cphNewYork {


    JFrame frame = new JFrame(" Destination -> New York City");

    JLabel pictureLabel = new JLabel("");

    JLabel jLabel = new JLabel("Adults:");
    JLabel jLabel1 = new JLabel("Children u13:");
    JLabel jLabel2 = new JLabel("Baggage:");


    JSpinner jspinner = new JSpinner();
    JSpinner jSpinner1 = new JSpinner();
    JSpinner jSpinner2 = new JSpinner();
    ImageIcon image = new ImageIcon("NewYork.jpg");

    cphNewYork() {

        pictureLabel.setBounds(0,0,800,800);
        pictureLabel.setIcon(image);

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
        frame.add(pictureLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
