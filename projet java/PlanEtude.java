import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public  class PlanEtude extends JFrame implements ActionListener
{private static final long serialVersionUID = 1L;
JLabel t,t1,l1,l,img,img1, img7;
ImageIcon image,image1,image2;
JButton ret,su,pr;

String I[]= {"plan0.PNG","plan1.PNG","plan2.PNG","plan3.PNG","plan4.PNG","plan5.PNG","plan6.PNG",
		"plan7.PNG","plan8.PNG","plan9.PNG"};
int i;
JPanel c;




public PlanEtude(String s)
{super(s);
this.setLocation(300, 50);
this.setSize(710, 630);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setLayout(null);
c=(JPanel)this.getContentPane();
 img7 = new JLabel();
 img7.setIcon(new ImageIcon("glare_shine_background_spot_69090_1366x768.jpg"));
 img7.setBounds(0, 0, 700, 700);




l1=new JLabel(" ISIMMBOOK");	
l1.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,40));
l1.setForeground(new Color(225,102,178));
l1.setBounds(210, 35, 400, 30);


c.add(l1);



image2=new ImageIcon ("plan0.PNG");

l=new JLabel(image2);
l.setBounds(150, 100, 400,400);


	
su=new JButton(">>",new ImageIcon("icons8-retour-501.png"));
su.setBackground(new Color(51,0,25));
su.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,15));
su.setForeground(new Color(225,102,102));
su.setBounds(350, 450, 120, 50);
su.addActionListener(this);
pr=new JButton("<<",new ImageIcon("icons8-retour-50.png"));
pr.setBackground(new Color(51,0,25));
pr.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,15));
pr.setForeground(new Color(225,102,102));
pr.setBounds(210, 450, 120, 50);
pr.addActionListener(this);




ret=new JButton("RETOUR",new ImageIcon("icons8-retour-50.png"));
ret.setBackground(new Color(51,0,25));
ret.setFont(new Font("TimesRoman",Font.BOLD+Font.ITALIC,15));
ret.setForeground(new Color(225,102,102));
ret.setBounds(260, 520, 150, 50);
c.add(ret);
c.add(su);
c.add(pr);
su.addActionListener(this);
pr.addActionListener(this);
ret.addActionListener(this);
c.add(l);
c.add(img7);
	
this.setVisible(true);
}
	

	public static void main(String []args)
	{
		PlanEtude ds = new PlanEtude("Plan Etude");
	}
public void actionPerformed(ActionEvent e) {
		if (e.getSource()==ret)
		{accueil_etu interface1=new accueil_etu("IsimmBook");
			interface1.setVisible(true);
			dispose();
		
		}
		if (e.getSource()==su)
		
		{if(i==I.length-1)
			i=0;
		else i=i+1;
		l.setIcon(new ImageIcon(I[i]));}
		
		if(e.getSource()==pr)
		{if(i==0)
			i=I.length-1;
		else i=i-1;
		l.setIcon(new ImageIcon(I[i]));
			
			
		}
			
			
			
			
			
}
}
