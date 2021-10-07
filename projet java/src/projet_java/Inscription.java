package projet_java;

import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;


public class Inscription extends JFrame implements ActionListener{
	
	
	private static final long serialVersionUID = 1L;
	
	JPanel p;
	JLabel esp,nom,prenom,email,age,adress,cin,tel,sexe,pwd,img,img1, img2, img3,img4,img5,img6,img7,img8,img9,img10;
	JTextField t1,t3,t4,t5,t6,t7,t8,t9; 
	JPasswordField t2;
	Icon image , image1 ,image2,image3 ,image4,image5,image6,image7,image8,image9,image10;
	JButton ret,val;
	String s2;
	
		public Inscription (String s)
		{super(s);
		
		p=(JPanel)this.getContentPane();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		   this.setBackground(new Color(251, 196, 189));
		   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);
			p=(JPanel)this.getContentPane();
			
			
			
			img=new JLabel();
			image = new ImageIcon( "icons8-�l�ves-50.png" );
		    img.setIcon( image );
		    img.setBounds(800, 80, 100, 100);
		    esp=new JLabel(" Espace d'inscription");
		    esp.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,40));
		    esp.setForeground(new Color(225,102,102));
		    esp.setBounds(600, 50, 400, 50);

		  
		    p.add(esp);
		    p.add(img);
		  
		 
		    //nom
		    
		    nom=new JLabel("nom :");
		    nom.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		    nom.setForeground(new Color(225,102,102));
		    nom.setBounds(550,200,100,100);
		    img4=new JLabel();
			image3 = new ImageIcon( "icons8-contact-d'affaires-50.png" );
		    img4.setIcon( image3 );
		    img4.setBounds(500, 200, 100, 100);
		    p.add(img4);
		    p.add(nom);
		    t3=new JTextField(3);
		    t3.setMaximumSize(new Dimension(Integer.MAX_VALUE, t3.getPreferredSize().height));
		    t3.setMaximumSize(new Dimension(Integer.MAX_VALUE, t3.getPreferredSize().width));
		    t3.setBounds(720, 235, 300, 40);
		    p.add(t3);
		    
		    //prenom
		    
		    prenom=new JLabel("prenom :");
		    prenom.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		    prenom.setForeground(new Color(225,102,102));
		    prenom.setBounds(550,260,100,100);
		    img5=new JLabel();
			image4 = new ImageIcon( "icons8-contact-d'affaires-50.png" );
		    img5.setIcon( image4 );
		    img5.setBounds(500, 260, 100, 100);
		    p.add(img5);
		    p.add(prenom);
		    t4=new JTextField(3);
		    t4.setMaximumSize(new Dimension(Integer.MAX_VALUE, t4.getPreferredSize().height));
		    t4.setMaximumSize(new Dimension(Integer.MAX_VALUE, t4.getPreferredSize().width));
		    t4.setBounds(720,280, 300, 40);
		    p.add(t4);
		    
             //age
		    
		    age=new JLabel("age :");
		    age.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		    age.setForeground(new Color(225,102,102));
		    age.setBounds(550,310,100,100);
		    img7=new JLabel();
			image6 = new ImageIcon( "icons8-contact-d'affaires-50.png" );
		    img7.setIcon( image6 );
		    img7.setBounds(500, 310, 100, 100);
		    p.add(img7);
		    p.add(age);
		    t6=new JTextField(3);
		    t6.setMaximumSize(new Dimension(Integer.MAX_VALUE, t6.getPreferredSize().height));
		    t6.setMaximumSize(new Dimension(Integer.MAX_VALUE, t6.getPreferredSize().width));
		    t6.setBounds(720,325, 300, 40);
		    p.add(t6);
		    
		    //email
		    
		    email=new JLabel("email :");
		    email.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		    email.setForeground(new Color(225,102,102));
		    email.setBounds(550,360,100,100);
		    img6=new JLabel();
			image5 = new ImageIcon( "icons8-contact-d'affaires-50.png" );
		    img6.setIcon( image5 );
		    img6.setBounds(500, 360, 100, 100);
		    p.add(img6);
		    p.add(email);
		    t5=new JTextField(3);
		    t5.setMaximumSize(new Dimension(Integer.MAX_VALUE, t5.getPreferredSize().height));
		    t5.setMaximumSize(new Dimension(Integer.MAX_VALUE, t5.getPreferredSize().width));
		    t5.setBounds(720,395, 300, 40);
		    p.add(t5);
		    
		    
		  //password
		    pwd=new JLabel("password:");
		    pwd.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		    pwd.setForeground(new Color(225,102,102));
		    pwd.setBounds(550,400,100,100);
		    img2=new JLabel();
			image2 = new ImageIcon( "icons8-ouvrir-50.png" );
		    img2.setIcon( image2);
		    img2.setBounds(500, 400, 100, 100);
		    p.add(img2);
		    p.add(pwd);
		 
		    t2=new JPasswordField(1);
		    t2.setMaximumSize(new Dimension(Integer.MAX_VALUE, t2.getPreferredSize().height));
		    t2.setMaximumSize(new Dimension(Integer.MAX_VALUE, t2.getPreferredSize().width));
		    t2.setBounds(720, 445, 300, 40);
		    p.add(t2);
		    

		    //adress
		    adress=new JLabel(" adress :");
		    adress.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		    adress.setForeground(new Color(225,102,102));
		    adress.setBounds(550,440,100,100);
		    img8=new JLabel();
			image7 = new ImageIcon( "icons8-contact-d'affaires-50.png" );
		    img8.setIcon( image7 );
		    img8.setBounds(500, 440, 100, 100);
		    p.add(img8);
		    p.add(adress);
		    t7=new JTextField(3);
		    t7.setMaximumSize(new Dimension(Integer.MAX_VALUE, t7.getPreferredSize().height));
		    t7.setMaximumSize(new Dimension(Integer.MAX_VALUE, t7.getPreferredSize().width));
		    t7.setBounds(720,495, 300, 40);
		    p.add(t7);
		    
		    
		  
		 //cin
		    cin=new JLabel("CIN :");
		    cin.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		    cin.setForeground(new Color(225,102,102));
		    cin.setBounds(550,480,100,100);
		    img1=new JLabel();
			image1 = new ImageIcon( "icons8-contact-d'affaires-50.png" );
		    img1.setIcon( image1 );
		    img1.setBounds(500, 480, 100, 100);
		    p.add(img1);
		    p.add(cin);
		    t1=new JTextField(2);
		    t1.setMaximumSize(new Dimension(Integer.MAX_VALUE, t1.getPreferredSize().height));
		    t1.setMaximumSize(new Dimension(Integer.MAX_VALUE, t1.getPreferredSize().width));
		    t1.setBounds(720, 540, 300, 40);
		    p.add(t1);
		
		     
		  //tel
		    tel=new JLabel(" num telephone :");
		    tel.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		    tel.setForeground(new Color(225,102,102));
		    tel.setBounds(550,520,100,100);
		    img9=new JLabel();
			image8 = new ImageIcon( "icons8-contact-d'affaires-50.png" );
		    img9.setIcon( image8 );
		    img9.setBounds(500, 520, 100, 100);
		    p.add(img9);
		    p.add(tel);
		    t8=new JTextField(3);
		    t8.setMaximumSize(new Dimension(Integer.MAX_VALUE, t8.getPreferredSize().height));
		    t8.setMaximumSize(new Dimension(Integer.MAX_VALUE, t8.getPreferredSize().width));
		    t8.setBounds(720,585, 300, 40);
		    p.add(t8);
		    
		    
		  //sexe
		    sexe=new JLabel("donner sexe :");
		    sexe.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
		    sexe.setForeground(new Color(225,102,102));
		    sexe.setBounds(550,560,100,100);
		    img10=new JLabel();
			image9 = new ImageIcon( "icons8-contact-d'affaires-50.png" );
		    img10.setIcon( image9 );
		    img10.setBounds(500, 560, 100, 100);
		    p.add(img10);
		    p.add(sexe);
		    t9=new JTextField(3);
		    t9.setMaximumSize(new Dimension(Integer.MAX_VALUE, t9.getPreferredSize().height));
		    t9.setMaximumSize(new Dimension(Integer.MAX_VALUE, t9.getPreferredSize().width));
		    t9.setBounds(720,630, 300, 40);
		    p.add(t9);
		    
		    
		    ret=new JButton("RETOUR",new ImageIcon("icons8-retour-50.png"));
		    ret.setBackground(new Color(51,0,25));
		    ret.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,15));
		    ret.setForeground(new Color(225,102,102));
		    ret.setBounds(400, 700, 150, 50);
		    ret.addActionListener(new ActionListener(){
		    	public void  actionPerformed(ActionEvent arg0){
		    		 Aceuille e =new Aceuille("aceiulle");
		               
		               Aceuille.main(null);
		    		
		    	}
		    });
		    val=new JButton("VALIDER",new ImageIcon("icons8-pouce-en-l'air-50 - Copie - Copie - Copie.png"));
		    val.setBackground(new Color(51,0,25));
		    val.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,13));
		    val.setForeground(new Color(225,102,102));
		    val.setBounds(1180, 700, 150, 50);
		    val.addActionListener(new ActionListener(){
		     	public void  actionPerformed(ActionEvent e){	
		    		 if ((t1.getText()).equals("") ||(t2.getText()).equals("")||(t3.getText()).equals("") ||(t4.getText()).equals("")||(t5.getText()).equals("") ||(t6.getText()).equals("")||(t7.getText()).equals("") ||(t8.getText()).equals("")||(t9.getText()).equals(""))
		            {
						 if ((t1.getText()).equals("") &&(t2.getText()).equals("")&&(t3.getText()).equals("") &&(t4.getText()).equals("")&&(t5.getText()).equals("") &&(t6.getText()).equals("")&&(t7.getText()).equals("") &&(t8.getText()).equals("")&&(t9.getText()).equals(""))

						 
							 s2= "Entrer vos cordonn�es avant de se connecter";
						 
		               else if ((t1.getText()).equals(""))
		                  s2="CIN manque";
		               else if ((t2.getText()).equals(""))
		                  s2="MOT_DE_PASSE manque";
		               else if ((t3.getText()).equals(""))
			                  s2="votre nom est manque";
		               else if ((t4.getText()).equals(""))
			                  s2="votre prenom manque";
		               else if ((t5.getText()).equals(""))
			                  s2="email manque";
		               else if ((t6.getText()).equals(""))
			                  s2="age manque";
		               else if ((t7.getText()).equals(""))
			                  s2="adress manqu�";
		               else if ((t8.getText()).equals(""))
			                  s2="telephone manqu�";
		               else 
		            	   s2="votre sexe est manquer";
		                  JOptionPane.showMessageDialog (null,s2,"Verification", JOptionPane. ERROR_MESSAGE) ; 
		                  t1.setText("");
		                 t2.setText("");
		              }
					else  
					{
						System.out.println(t3.getText() + " " + t4.getText() + " " + t5.getText() + " " + t6.getText() + " "
								+ t7.getText() + " " + t1.getText()+ " " +t8.getText()+ " " + t9.getText()+" "+ t2.getText());
						
						if (e.getSource() == val) {
							ConnectionBD c = new ConnectionBD();
							String ajoutStag = "INSERT INTO stagiere (nom, prenom, email,age,adress,cin,telephone,sexe,password) VALUES (?, ?, ?, ?, ?, ?,?, ?, ?)";

							try {
								PreparedStatement statement = (PreparedStatement) c.con.prepareStatement(ajoutStag);
								statement.setString(1, t3.getText());
								statement.setString(2,t4.getText());
								statement.setString(3,t5.getText());
								statement.setInt(4, Integer.parseInt( t6.getText()));
								statement.setString(5,t7.getText());
								statement.setInt(6,  Integer.parseInt( t1.getText()));
								statement.setInt(7,  Integer.parseInt( t8.getText()));
								statement.setString(8,t9.getText());
								statement.setString(9,t2.getText());
								//statement.setString(7,  tf5.getText());

								statement.executeUpdate();
								System.out.println("le admin est inscris avec suce�!");

							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								System.out.println("sql exception!!");
								e1.printStackTrace();
							}
		
					
		             Stage e1 =new Stage("stage");
		               
		               Stage.main(null);
							
						
					}	
		    		
		    	
					}}

		    });
		    		
		    		
		    p.add(ret);
		    p.add(val);
		    
		    this.setVisible(true); 
		   

		}
		
		public void Connect(String req){
			 Connection cn1;
    		Statement stm;
		
			try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver reussi");
			
				 cn1= DriverManager.getConnection("jdbc:mysql://localhost/stage","root","");
			
				System.out.println("connexion reussite");
				Statement stat=cn1.createStatement();
				stat.execute(req);
				JOptionPane.showMessageDialog(null,"query excute");
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		}

		public static void main (String []args){
			Inscription fen=new Inscription("inscription");
			fen.setVisible(true);
			fen.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

}
