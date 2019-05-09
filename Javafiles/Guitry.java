import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Handler implements ActionListener {
	public void actionPerformed(ActionEvent e)
	{
		JDialog jd =new JDialog(SignIn.jf, "Button Pressed");
		jd.setVisible(true);
		String name;
		if(e.getSource()==SignIn.b1)
		{

		}
		if(e.getActionCommand().equals("Reset"))
		{
			SignIn.t1.setText(null);
			SignIn.pw.setText(null);
		}
		JLabel js=new JLabel("Your form is "+e.getActionCommand()+"ed");
		SignIn.jf.add(js);
		js.setText("Your form is "+e.getActionCommand()+"ed");
		js.setBounds(100, 300, 200, 100);
	}
}

class SignIn {
	static JFrame jf=new JFrame();
	static JTextField t1=new JTextField(10); 		//Size of field  (Size measured with W)
	static JPasswordField pw=new JPasswordField(10);
	static JButton b1=new JButton("Submit");
	static JButton b2=new JButton("Reset");
    
	void myGUI()
	{
		jf.add(t1);
		jf.add(pw);
		jf.add(b1);
		jf.add(b2);

		jf.setVisible(true);
		jf.setSize(400, 500);
		/*Choice ch=new Choice();
		ch.add("Burger");
		ch.add("Coffee");*/

		JComboBox <String> ch=new JComboBox<>();
		ch.addItem("Burger");
		ch.addItem("Coffee");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(ch);
		jf.getContentPane().setBackground(Color.CYAN);
		//x,y,w,h
		jf.setLayout(null);
		pw.setBounds(100, 100, 200, 100);

		Handler h= new Handler();
		b1.addActionListener(h);
		b2.addActionListener(h);

		for(int x=0; x<100; x++)
			{
				t1.setBounds(x,50,200,100);  
				try{
					Thread.sleep(100);
				}
				catch(Exception c)
				{}
			}	
	

		

		pw.setEchoChar('d');
		jf.setLocationRelativeTo(null); 		//Set postion in center relative to screen
	}

	public static void main(String[] args) throws Exception{
		new SignIn().myGUI();
	}
}