import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome to Sebs Bighead Travel");


    WelcomePage(String userID){

        welcomeLabel.setBounds(0,0,600,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setForeground(Color.BLUE);
        welcomeLabel.setText(" Hello " + userID +"!" +  " Welcome to Sebs BigHead Travel");

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
