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
//	JButton btn =new JButton("��ƽ��");
	JLabel out = new JLabel("������1");
//	JLabel out2 = new JLabel("������2");
	JButton btn2 = new JButton("������");
	
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
			out.setText(d+ "�������ǣ�"+sq);
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
			out.setText(d+ "��ƽ���ǣ�"+sq);
		} //old way
	}*/
}