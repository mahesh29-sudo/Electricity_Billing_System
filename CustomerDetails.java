import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CustomerDetails extends JFrame implements ActionListener {

	JTable t1;
	JButton b1;
	String[] x = {"Emp Name","Meter No","Address","State","City","Email","Phone"};
	String[][] y = new String [20][8];
	int i=0, j=0;
	
	CustomerDetails(){
		super("Customer Details");
		setSize(1200,650);
		setLocation(200,300);
		
		try {
			Conn c1 = new Conn();
			String s1 = "select * from emp";
			ResultSet rs = c1.s.executeQuery(s1);
			
			while(rs.next()) {
				 y[i][j++]=rs.getString("name");
	                y[i][j++]=rs.getString("meter_number");
	                y[i][j++]=rs.getString("address");
	                y[i][j++]=rs.getString("state");
	                y[i][j++]=rs.getString("city");
	                y[i][j++]=rs.getString("email");
	                y[i][j++]=rs.getString("phone");
	                i++;
	                j=0;
			}
			t1 = new JTable(y,x);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		b1 = new JButton("Print");
		add(b1,"South");
		JScrollPane sp = new JScrollPane(t1);
		add(sp);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
        try{
            t1.print();
        }catch(Exception e){}
    }

    public static void main(String[] args){
        new CustomerDetails().setVisible(true);
    }
	
	
}
