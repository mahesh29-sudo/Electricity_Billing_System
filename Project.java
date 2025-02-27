import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Project extends JFrame implements ActionListener {

	public Project() {

		super("Electricity Billing System");
		setSize(1500,800);
		
		/* Adding background image */
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("Images/main.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1420, 720,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Customer");
        JMenuItem m2 = new JMenuItem("Customer Details");
        JMenuItem m3 = new JMenuItem("Deposit Details");
        master.setForeground(Color.BLUE);
        
        m1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("Images/icon1.jpg"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('D');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        m2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("Images/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('M');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
        
        m3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("Images/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m3.setIcon(new ImageIcon(image3));
        m3.setMnemonic('N');
        m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        m3.setBackground(Color.WHITE);

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        
        
        
        /* Second Column */
        JMenu user = new JMenu("User");
        JMenuItem u1 = new JMenuItem("Pay Bill");
        JMenuItem u2 = new JMenuItem("Calculate Bill");
        JMenuItem u3 = new JMenuItem("Last Bill");
        user.setForeground(Color.RED);
        
        u1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("Images/icon4.png"));
        Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
        u1.setBackground(Color.WHITE);
        
        u2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("Images/icon5.png"));
        Image image5 = icon5.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('B');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
        
        u3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("Images/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        u3.setIcon(new ImageIcon(image6));
        u3.setMnemonic('L');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        u3.setBackground(Color.WHITE);

        u1.addActionListener(this);
        u2.addActionListener(this);
        u3.addActionListener(this);
        
        
        JMenu report = new JMenu("Report");
        JMenuItem r1 = new JMenuItem("Generate Bill");
        report.setForeground(Color.BLUE);
        
        r1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("Images/icon7.png"));
        Image image7 = icon7.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('R');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);

        r1.addActionListener(this);
        
        
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED);
        
        ut1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("Images/icon12.png"));
        Image image8 = icon8.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
        
        ut2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("Images/icon9.png"));
        Image image9 = icon9.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);
        
        ut3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("Images/icon10.png"));
        Image image10 = icon10.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);


        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
        
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLUE);
        
        ex.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("Images/icon11.png"));
        Image image11 = icon11.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);
        
        master.add(m1);
        master.add(m2);
        
        user.add(u1);
        user.add(u2);
        user.add(u3);

        report.add(r1);

        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);

        exit.add(ex);

        mb.add(master);
        mb.add(user);
        mb.add(report);
        mb.add(utility);
        mb.add(exit);
        
        setJMenuBar(mb);
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String msg =e.getActionCommand();
		
		if(msg.equals("Customer Details")){
            new CustomerDetails().setVisible(true);

        }else if(msg.equals("New Customer")){
            new NewCustomer().setVisible(true);

        }else if(msg.equals("Calculate Bill")){
            new Calculate_Bill().setVisible(true);

        }else if(msg.equals("Pay Bill")){
            new PayBill().setVisible(true);

        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e3){ }
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e1){ }
        }else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
            }catch(Exception e2){ }
        }else if(msg.equals("Exit")){
            System.exit(0);
        }else if(msg.equals("Generate Bill")){
            new GenerateBill().setVisible(true);

        }else if(msg.equals("Last Bill")){
            new LastBill().setVisible(true);

        }
    }

    public static void main(String[] args){
        new Project().setVisible(true);
    }

	}
