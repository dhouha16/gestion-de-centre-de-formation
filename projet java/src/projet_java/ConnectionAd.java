package projet_java;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.sql.*;
public class ConnectionAd extends JFrame{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		JPanel p;
		JLabel esp,cin,numid,img,img1, img2, img3;
		JTextField t1;
		JPasswordField t2;
		Icon image , image1 ,image2;
		JButton ret,val;
		String s2;
		
		
		
		
		 public ConnectionAd (String s)
		{super(s);
		this.setLocation(300, 50);
		this.setSize(710, 630);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		p=(JPanel)this.getContentPane();
		img3 = new JLabel();
		img3.setIcon(new ImageIcon("schitter-uitstekende-lichtenachtergrond-licht-zilver-goud-purple-en-zwarte-defocused-55469445.jpg"));
		img3.setBounds(0, 0, 700, 700);
		
		
		
		img=new JLabel();
		image = new ImageIcon( "icons8-élèves-50.png" );
	    img.setIcon( image );
	    img.setBounds(320, 80, 100, 100);
	    esp=new JLabel(" Espace Administrateur");
	    esp.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,40));
	    esp.setForeground(new Color(225,102,102));
	    esp.setBounds(150, 50, 400, 50);

	  
	    p.add(esp);
	    p.add(img);
	  
	    
	    

	 
	 
	    cin=new JLabel("CIN :");
	    cin.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
	    cin.setForeground(new Color(225,102,102));
	    cin.setBounds(200,200,100,100);
	    img1=new JLabel();
		image1 = new ImageIcon( "icons8-contact-d'affaires-50.png" );
	    img1.setIcon( image1 );
	    img1.setBounds(150, 200, 100, 100);
	    p.add(img1);
	    p.add(cin);
	    t1=new JTextField(2);
	    t1.setMaximumSize(new Dimension(Integer.MAX_VALUE, t1.getPreferredSize().height));
	    t1.setMaximumSize(new Dimension(Integer.MAX_VALUE, t1.getPreferredSize().width));
	    t1.setBounds(250, 232, 300, 40);
	    p.add(t1);
	 
	    numid=new JLabel("MDP:");
	    numid.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,20));
	    numid.setForeground(new Color(225,102,102));
	    numid.setBounds(200,300,100,100);
	    img2=new JLabel();
		image2 = new ImageIcon( "icons8-ouvrir-50.png" );
	    img2.setIcon( image2);
	    img2.setBounds(150, 300, 100, 100);
	    p.add(img2);
	    p.add(numid);
	 
	    t2=new JPasswordField(1);
	    t2.setMaximumSize(new Dimension(Integer.MAX_VALUE, t2.getPreferredSize().height));
	    t2.setMaximumSize(new Dimension(Integer.MAX_VALUE, t2.getPreferredSize().width));
	    t2.setBounds(253, 330, 300, 40);
	    p.add(t2);
	     
	    
	    
	    ret=new JButton("RETOUR",new ImageIcon("icons8-retour-50.png"));
	    ret.setBackground(new Color(51,0,25));
	    ret.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,15));
	    ret.setForeground(new Color(225,102,102));
	    ret.setBounds(100, 500, 150, 50);
	    val=new JButton("VALIDER",new ImageIcon("icons8-pouce-en-l'air-50 - Copie - Copie - Copie.png"));
	    val.setBackground(new Color(51,0,25));
	    val.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,13));
	    val.setForeground(new Color(225,102,102));
	    val.setBounds(500, 500, 150, 50);
	    val.addActionListener(new ActionListener(){
		    public void  actionPerformed(ActionEvent arg0){
		    	{ if ((t1.getText()).equals("") ||(t2.getText()).equals(""))
	            {
	                if((t1.getText()).equals("") && (t2.getText()).equals("") )
	                  s2= "Entrer vos cordonnées avant de se connecter";
	               else if ((t1.getText()).equals(""))
	                  s2="CIN manque";
	               else
	                  s2="MOT_DE_PASSE manque";
	                  
	                  JOptionPane.showMessageDialog (null,s2,"Verification", JOptionPane. ERROR_MESSAGE) ; 
	                  t1.setText("");
	                 t2.setText("");
	              }
				else  {
					int x = Integer.parseInt(t1.getText());
					
					 Admin e1 =new Admin(x,t2.getText()); 
	                 if (e1.exist_admin()==true)
	                 { t1.setText("");t2.setText("");
	                
		             	GestionStage e2 =new GestionStage();
			               
						GestionStage.main(null);
		    	
	                 }
	                 else 
	                 { JOptionPane.showMessageDialog (null,"VERIFIER VOS CORDONNEES","CONNEXION ECHOUEE", JOptionPane. ERROR_MESSAGE) ; 
	                    t1.setText("");
	                    t2.setText("");
	                 }
				}
	    		
		    	}
		    	}
					
	    });
					
	   
	    
	    p.add(ret);
	    p.add(val);
	    p.add(img3);
	    this.setVisible(true);	
		}
		    	
		public static void main(String [] args){
			ConnectionAd ad=new ConnectionAd("espace admin");
			ad.setVisible(true);
		}

		 
		 
							
					
					
					
					
			
}
