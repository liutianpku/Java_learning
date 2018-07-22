import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AppAppletInOut extends JApplet{
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		AppAppletInOut app = new AppAppletInOut() ;
		app.init();
		frame.getContentPane().add(app);
		frame.setSize(400,100);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
	JTextField in = new JTextField(10);
	JButton btn = new JButton("求平方");
	JLabel out = new JLabel("用于显示结果");
	
	public void init() {
		setLayout(new FlowLayout());
		add(in); 
		add(btn);
		add(out);
		btn.addActionListener(e -> {
			String s = in.getText();
			double d = Double.parseDouble( s );
			double sq = Math.sqrt(d);
			out.setText( d + "的平方根是：" + sq );
		});
	}
}
