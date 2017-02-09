import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class panel extends JFrame {
	private JTextField txtHelloWorld;

	public panel() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(400, 600);
		getContentPane().setLayout(null);
		
		txtHelloWorld = new JTextField();
		txtHelloWorld.setEditable(false);
		txtHelloWorld.setText("HELLO WORLD");
		txtHelloWorld.setBounds(141, 182, 97, 32);
		getContentPane().add(txtHelloWorld);
		txtHelloWorld.setColumns(10);
		
		
	}
}
