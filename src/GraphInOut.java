import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GraphInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppFrame();
	}
}

class AppFrame extends JFrame{
	JTextField in = new JTextField(10);
	JButton btn =new JButton("求平方");
	JLabel out = new JLabel("计算结果");
	
	public AppFrame() {
		setLayout(new FlowLayout());
		getContentPane().add(in);
		getContentPane().add(btn);
		getContentPane().add(out);
		btn.addActionListener(new BtnActionAdapter());
		setSize(400,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	class BtnActionAdapter implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String s = in.getText();
			double d = Double.parseDouble(s);
			double sq = d * d;
			out.setText(d+ "的平方是："+sq);
		}
	}
}