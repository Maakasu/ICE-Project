import javax.swing.*;
import java.awt.*;

public class Bookings {

    JFrame frame = new JFrame("YourBookings");
    JLabel yourDestinations = new JLabel("Your Bookings:");

    ImageIcon image = new ImageIcon("Plane-in-sky.jpg");
    Bookings(){


        yourDestinations.setBounds(0,0,800,800);
        yourDestinations.setFont(new Font(null,Font.PLAIN,25));
        yourDestinations.setForeground(Color.BLACK);
        yourDestinations.setText("Here are your bookings");
        yourDestinations.setHorizontalTextPosition(JLabel.CENTER);
        yourDestinations.setVerticalTextPosition(JLabel.TOP);



        yourDestinations.setIcon(image);
        frame.add(yourDestinations);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
