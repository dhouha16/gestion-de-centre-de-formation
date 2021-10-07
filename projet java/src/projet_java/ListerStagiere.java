package projet_java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class ListerStagiere extends JFrame{
private static final long serialVersionUID = 1L;
	
	JPanel c;
	JLabel l1,l2,img7;
	ImageIcon image6;
	String s;
	static JTable nom,prenom,age,email,cin,sexe;
	static JTextField tnom,tprenom,tage,temail,tcin,tsexe;
	static Object []columnName={"nom","prenom","email","age","cin"};
	static Object dataBaseResults [][];
	
	//ResultSetMetaData meta;
	static DefaultTableModel dTableModel =new DefaultTableModel(dataBaseResults ,columnName){
		public Class getColumnClass(int columnName){
			Class returnValue;
		
			if ((columnName>=0)&&(columnName<getColumnCount())){
				returnValue=getValueAt(0,columnName).getClass();
			}else{
				returnValue=Object.class;
		}
		 return returnValue;
		}
	};
	static JTable table= new JTable(dTableModel);
	
	
	public ListerStagiere()
	{
		this.setLocation(300, 50);
		this.setSize(710, 630);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		c=(JPanel)this.getContentPane();
		 img7 = new JLabel();
		 img7.setIcon(new ImageIcon("glare_shine_background_spot_69090_1366x768.jpg"));
		 img7.setBounds(0, 0, 700, 700);
		 
		 
		l1=new JLabel("Gestion satgiere");	
		l1.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,40));
	    l1.setForeground(new Color(225,102,178));
		l1.setBounds(210, 35, 400, 30);

		
	    l2=new JLabel("      Espace admin");
	    l2.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,40));
	    l2.setForeground(new Color(225,102,178));
		l2.setBounds(140, 70, 400, 50);
		c.add(l1);
		c.add(l2);
		c.add(img7);
	}

	
	public static void main(String [] args ) throws ClassNotFoundException, SQLException{
		JFrame st=new JFrame();
		st.setVisible(true);
		st.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Connection con=null;

		try
		{ Class.forName("com.mysql.jdbc.Driver");
		con =DriverManager.getConnection("jdbc:mysql://localhost/stage","root","");
		Statement stm =con.createStatement();		
		String req = "SELECT nom,prenom,email,age,cin FROM stagiere";
		
	      
	       ResultSet rows = stm.executeQuery(req);
	       
	       
	       Object[] tempRow;
	       while(rows.next()){
	      	 tempRow=new Object[]{rows.getString("nom"), rows.getString("prenom"), rows.getString("email"),rows.getString("age"),rows.getInt("cin")};	
	      	dTableModel.addRow(tempRow);
	      	table.setModel(dTableModel);
	      	System.out.println("le stagiere"+tempRow);
	       }
	       }
		catch(SQLException sqle)
		{ 
			sqle.printStackTrace();} 
		
		catch(ClassNotFoundException cnx)
		{
			cnx.printStackTrace();
			} 

		
 
    table.setFont(new Font("serif", Font.PLAIN,26));
  	table.setRowHeight(table.getRowHeight()+16);
  	table.setAutoCreateRowSorter(true);
  	JScrollPane scroll=new JScrollPane(table);
  	st.add(scroll, BorderLayout.CENTER);
  	st.setLocation(300, 50);
	st.setSize(710, 630);
	

	}
}

	

