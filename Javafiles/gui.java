import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Handler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == SignIn.b1)
		{
			JDialog jd = new JDialog(SignIn.jf,"Button Pressed");
			jd.setSize(200,0);
			jd.setLocationRelativeTo(SignIn.jf);
			jd.setVisible(true);
		}
		else if(e.getActionCommand().equals("Reset"))
		{
			SignIn.t1.setText(null);
			SignIn.p1.setText(null);
		} 
	}
}

class SignIn{
	static JFrame jf = new JFrame();
	// jfareme
	static JTextField t1 = new JTextField(20);
	// jtext field
	static JPasswordField p1 = new JPasswordField(20);
	// password field
	static JButton b1 = new JButton("Submit");
	static JButton b2 = new JButton("Reset");
	// buttons

	void myGUI()
	{
		jf.add(t1);
		jf.add(p1);
		jf.add(b1);
		jf.add(b2);
		jf.setSize(400,300);
		jf.setLayout(null); 
		p1.setEchoChar('*');
		// password output in field
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*Choice ch = new Choice();
		ch.add("a");
		ch.add("b");
		ch.add("c");
*/
		JComboBox ch = new JComboBox();
		ch.addItem("A");
		ch.addItem("B");
		ch.addItem("C");
		ch.addItem("D");
		//jf.add(ch);
		//(x,y,w,h)
		t1.setBounds(100,25,200,25);
		p1.setBounds(100,60,200,25);
		b1.setBounds(100,100,100,50);
		b2.setBounds(200,100,100,50);

		jf.getContentPane().setBackground(Color.BLUE);
		Handler h = new Handler();
		b1.addActionListener(h);
		b2.addActionListener(h);

		jf.setVisible(true);
	}
	// objects added in frame
	public static void main(String[] args) {
		new SignIn().myGUI();
	}
}
