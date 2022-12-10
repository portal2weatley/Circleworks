import javax.swing.*;


public class MainGame {
	static int counter;
	static JLabel points;

	public static void Initialize() {
		JFrame frame = new JFrame("Circleworks");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Pane primary = new Pane();
     	frame.add(primary);
     	frame.pack();
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
		
		new Listener(frame,primary);

		points = new JLabel();
		counter = 0;
		points.setText("Points: "+counter);
		primary.add(points);
	}
	public static void addPoints() {
		counter++;
		points.setText("Points: "+counter);
	}
	public static int getCounter() {
		return counter;
	}
}
