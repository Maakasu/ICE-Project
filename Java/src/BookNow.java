import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookNow implements ActionListener {

    JFrame frame = new JFrame("BookNowPage");
    JLabel chooseDestination = new JLabel("Choose your destination");
    JLabel CphToLarnaca = new JLabel("CPH - Larnaca");


    JLabel pickYourDestination = new JLabel("Choose your destination");
    JButton cphLarnacaButton = new JButton("Copenhagen - Larnaca");

    JButton cphSingaporeButton = new JButton("Copenhagen - Singapore ");

    JButton cphNewYorkButton = new JButton("Copgenhagen - New York City");


    ImageIcon image = new ImageIcon("waterfall1.jpg");

    BookNow() {

        pickYourDestination.setBounds(0, 0, 800, 800);
        pickYourDestination.setFont(new Font(null, Font.PLAIN, 25));
        pickYourDestination.setForeground(Color.black);
        pickYourDestination.setText("Choose your destination");
        pickYourDestination.setHorizontalTextPosition(JLabel.CENTER);
        pickYourDestination.setVerticalTextPosition(JLabel.TOP);


        chooseDestination.setBounds(0, 0, 800, 800);
        chooseDestination.setFont(new Font(null, Font.PLAIN, 25));
        chooseDestination.setForeground(Color.BLACK);

        CphToLarnaca.setBounds(100, 200, 75, 25);


        cphLarnacaButton.setBounds(100, 100, 200, 25);
        cphLarnacaButton.setFocusable(false);
        cphLarnacaButton.addActionListener(this);

        cphSingaporeButton.setBounds(100, 200, 200, 25);
        cphSingaporeButton.setFocusable(false);
        cphSingaporeButton.addActionListener(this);

        cphNewYorkButton.setBounds(100, 300, 200, 25);
        cphNewYorkButton.setFocusable(false);
        cphNewYorkButton.addActionListener(this);


        frame.add(pickYourDestination);
        frame.add(cphLarnacaButton);
        frame.add(cphSingaporeButton);
        frame.add(cphNewYorkButton);
        frame.add(chooseDestination);

        chooseDestination.setIcon(image);

        frame.add(chooseDestination);
        frame.add(CphToLarnaca);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cphLarnacaButton) {
            frame.dispose();
            CphLarnaca cphLar = new CphLarnaca();
        }
    }
}



