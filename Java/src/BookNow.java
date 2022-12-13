import javax.swing.*;
import java.awt.*;

public class BookNow {

    JFrame frame = new JFrame("BookNowPage");
    JLabel chooseDestination = new JLabel("Choose your destination");
    JLabel CphToLarnaca = new JLabel("CPH - Larnaca");



    ImageIcon image = new ImageIcon("waterfall1.jpg");
    BookNow(){


        chooseDestination.setBounds(0,0,800,800);
        chooseDestination.setFont(new Font(null,Font.PLAIN,25));
        chooseDestination.setForeground(Color.BLACK);
        chooseDestination.setText("Choose your destination");

        CphToLarnaca.setBounds(100,200,75,25);





        chooseDestination.setIcon(image);
        frame.add(chooseDestination);
        frame.add(CphToLarnaca);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}


