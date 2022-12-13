import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {
    JFrame frame = new JFrame("Sebs BigHead Travel");
    JLabel welcomeLabel = new JLabel("Welcome to Sebs Bighead Travel");

    JButton bookButton = new JButton("Book Now");

    JButton yourBookingsButton = new JButton("Your bookings");

    ImageIcon image = new ImageIcon("Changi airport.jpg");

    private BookNow BookNow;


    WelcomePage(String userID) {

        welcomeLabel.setBounds(0, 0, 800, 800);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setForeground(Color.BLACK);
        welcomeLabel.setText(" Hello " + userID + "!" + " Welcome to Hydro Travel");
        welcomeLabel.setHorizontalTextPosition(JLabel.CENTER);
        welcomeLabel.setVerticalTextPosition(JLabel.TOP);


        //welcomeLabel.setIcon(new ImageIcon("C:\\Users\\Marcu\\OneDrive\\Skrivebord\\Marcus Anastasiades\\Changi airport.jpg"));

        bookButton.setBounds(100, 350, 125, 50);//Booking button
        bookButton.setFocusable(false);
        bookButton.addActionListener(this);

        yourBookingsButton.setBounds(100, 450, 125, 50);//your bookings button
        yourBookingsButton.setFocusable(false);
        yourBookingsButton.addActionListener(this);


        welcomeLabel.setIcon(image);
        frame.add(bookButton);
        frame.add(yourBookingsButton);
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(800,800);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.pack();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bookButton) {
            frame.dispose();
            BookNow bookNow = new BookNow();
        } else if (e.getSource() == yourBookingsButton) {
            frame.dispose();
            Bookings bookings = new Bookings();
        }
    }
}
