import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

public class Menu extends JFrame implements ActionListener {
	 
	// the clickable button
    JButton button1 = new JButton("Play");
    JButton button2 = new JButton("Scores");
    JButton button3 = new JButton("Quit");

	public Menu() {
		
		JFrame frame = new JFrame();
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(150, 150, 150, 150));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Circleworks");
        frame.pack();
        frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent E) {
		if(E.getSource() == button1) {
			//start the game
            MainGame.Initialize();
		}
		
		if(E.getSource() == button2) {
			JFrame score = new JFrame();
            JPanel panel = new JPanel();
            JLabel high = new JLabel();
            JLabel last = new JLabel();

            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            panel.setLayout(new GridLayout(0, 1));

            try {
                Scores.ScoreReader();
            } catch (FileNotFoundException e) {}
            high.setText("High Score: "+Scores.HighScore());
            last.setText("Last Score: "+Scores.LastScore());

            score.add(panel);

            panel.add(high);
            panel.add(last);

            
            score.pack();
            score.setTitle("Score");
            score.setVisible(true);
            score.setSize(300,300);

		}
		
		if (E.getSource() == button3) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Menu();
	}
}