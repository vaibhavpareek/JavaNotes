import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Handle implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == FileManipulator.b1)
        {
 			JLabel jl = new JLabel("Search Engine");    
    		JFrame jf1 = new JFrame("Search Engine");
    	    JTextField jt = new JTextField();
    		jt.setBackground(Color.CYAN);
    		jf1.setContentPane(new JLabel(new ImageIcon("/home/vaibhav/Pictures/t.jpeg")));
    		jt.setBounds(100,70,600,50);
        	jf1.setSize(800,800);
    		jf1.setLayout(null);
    		jf1.add(jt);
    		jf1.setLocationRelativeTo(null);
    		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		FileManipulator.jf.setVisible(false);
    		jf1.setVisible(true);
	          
        }
        else if(e.getSource() == FileManipulator.b2)
        {
            JDialog jd = new JDialog(FileManipulator.jf,"System Cleaner");
            jd.setSize(800,800);
            jd.setLocationRelativeTo(null);
            jd.setVisible(true);
        }
        else if(e.getSource() == FileManipulator.b3)
        {
            JDialog jd = new JDialog(FileManipulator.jf,"File Organizer");
            jd.setSize(800,800);
            jd.setLocationRelativeTo(null);
            jd.setVisible(true);
        }
    }
}
class FileManipulator
{
	static JLabel jl = new JLabel("SAB KUCH HOGA");    
    static JFrame jf = new JFrame();
	static JButton b1 = new JButton("Search Engine");
	static JButton b2 = new JButton("System Cleaner");
	static JButton b3 = new JButton("File Organizer");
    void myGui()
    {
    	jf.add(jl);
    	jf.add(b1);
    	jf.add(b2);
        jf.add(b3);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //x,w,y,h
        jl.setBounds(130,50,200,50);
        jl.setSize(250,50);
        b1.setBounds(100,120,200,50);
        b2.setBounds(100,190,200,50);
        b3.setBounds(100,260,200,50);
        jf.getContentPane().setBackground(Color.BLUE);
        jf.setVisible(true);   
        Handle h = new Handle();
        b1.addActionListener(h);
        b2.addActionListener(h);
        b3.addActionListener(h);
        
    }

	public static void main(String []vp)
	{
		new FileManipulator().myGui();
	}
}