
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;




	//  w ww.  j av  a2  s .  co m
	public class ddd {
		public static void main(String[] args) {
			//2 input mesca so sirkou x
			JTextField xField = new JTextField(5);
			JTextField yField = new JTextField(5);
			//vytvori okno
			JPanel myPanel = new JPanel();
			//nazov a input okno pre x
			myPanel.add(new JLabel("x:"));
			myPanel.add(xField);
			//Oddelene o vzdialenost
			myPanel.add(Box.createHorizontalStrut(20)); // a spacer
			//nazov a input okno pre y
			myPanel.add(new JLabel("y:"));
			myPanel.add(yField);

			int result = JOptionPane.showConfirmDialog(null, myPanel,
					"Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.OK_OPTION) {
				System.out.println("x value: " + xField.getText());
				System.out.println("y value: " + yField.getText());
			}
}
		}
