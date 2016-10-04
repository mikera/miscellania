package mikera.misc;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class AWTTest extends Applet {

	public AWTTest() {
		Button b=new Button("Hello!!");
		add(b);
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello!!!");
			}
		});
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("Test AWT Applet");
		f.add(new AWTTest());
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		
		f.setVisible(true);
		f.validate();
	}

}
