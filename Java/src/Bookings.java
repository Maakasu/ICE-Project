import javax.swing.*;
import java.awt.*;

public class Bookings {

    JFrame frame = new JFrame("BookNowPage");
    JLabel chooseDestination = new JLabel("Your Bookings:");

    ImageIcon image = new ImageIcon("Plane-in-sky.jpg");
    Bookings(){


        chooseDestination.setBounds(0,0,800,800);
        chooseDestination.setFont(new Font(null,Font.PLAIN,25));
        chooseDestination.setForeground(Color.BLACK);




        chooseDestination.setIcon(image);
        frame.add(chooseDestination);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
