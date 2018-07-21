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
//	JButton btn =new JButton("求平方");
	JLabel out = new JLabel("计算结果1");
//	JLabel out2 = new JLabel("计算结果2");
	JButton btn2 = new JButton("求立方");
	
	public AppFrame() {
		setLayout(new FlowLayout());
		getContentPane().add(in);
//		getContentPane().add(btn);
		getContentPane().add(btn2);
		getContentPane().add(out);
//		getContentPane().add(out2);
//		btn.addActionListener(new BtnActionAdapter());
		btn2.addActionListener( e->	{
			String s = in.getText();
			double d = Double.parseDouble(s);
			double sq = d*d*d;
			out.setText(d+ "的立方是："+sq);
		}); //used in java8++
		setSize(400,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
/*	class BtnActionAdapter implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String s = in.getText();
			double d = Double.parseDouble(s);
			double sq = d * d;
			out.setText(d+ "的平方是："+sq);
		} //old way
	}*/
}