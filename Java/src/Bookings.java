import javax.swing.*;
import java.awt.*;

public class Bookings {

    JFrame frame = new JFrame("YourBookings");
    JLabel yourDestination = new JLabel("Your Bookings:");

    ImageIcon image = new ImageIcon("Plane-in-sky.jpg");
    Bookings(){


        yourDestination.setBounds(0,0,800,800);
        yourDestination.setFont(new Font(null,Font.PLAIN,25));
        yourDestination.setForeground(Color.BLACK);




        yourDestination.setIcon(image);
        frame.add(yourDestination);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
