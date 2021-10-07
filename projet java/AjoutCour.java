import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class AjoutCour extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JPanel c;
	JLabel l1, l2, l3, l7, l8, img7;
	JButton b1, b2, b3;
	JTextField tf2, tf3, tf4, tf5, tf6, tf8;
	String branche[] = { "Licence Fonda info ", "Licence App info", "Licence Fonda Math", "Licence Fonda STIC",
			"Licence App STIC", "Mastère recherche info ", "Mastère recherche Micro", "Mastère Pro GL", "Ing Micro" };
	JComboBox Branche, niveau;
	String[] Niveau = { "Niveau" };

	public AjoutCour(String s) {
		super(s);
		this.setLocation(300, 50);
		this.setSize(710, 630);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		c = (JPanel) this.getContentPane();
		img7 = new JLabel();
		img7.setIcon(new ImageIcon("glare_shine_background_spot_69090_1366x768.jpg"));
		img7.setBounds(0, 0, 700, 700);

		l1 = new JLabel(" ISIMMBOOK");
		l1.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 40));
		l1.setForeground(new Color(225, 102, 178));
		l1.setBounds(210, 35, 400, 30);

		l2 = new JLabel("Cour: ");
		tf2 = new JTextField();
		l2.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 20));
		l2.setForeground(new Color(0, 0, 51));
		l2.setBounds(70, 200, 100, 20);
		tf2.setBounds(140, 200, 100, 20);

		l3 = new JLabel("Matière: ");
		tf3 = new JTextField();
		l3.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 20));
		l3.setForeground(new Color(0, 0, 51));
		l3.setBounds(60, 250, 150, 20);
		tf3.setBounds(140, 250, 100, 20);

		l7 = new JLabel("Branche : ");
		l7.setBounds(400, 200, 100, 20);
		l7.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18));
		l7.setForeground(new Color(0, 0, 51));
		Branche = new JComboBox(branche);
		Branche.setBounds(490, 195, 200, 30);
		Branche.addActionListener(this);
		l8 = new JLabel("Niveau  : ");
		l8.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18));
		l8.setForeground(new Color(0, 0, 51));
		l8.setBounds(400, 250, 100, 25);
		c.add(l8);
		niveau = new JComboBox();
		for (String i : Niveau) {
			niveau.addItem(i);
		}
		niveau.setBounds(490, 250, 170, 25);
		c.add(niveau);

		b1 = new JButton("Ajouter");
		b1.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 20));
		b1.setBackground(new Color(102, 0, 51));
		b1.setForeground(new Color(23, 90, 145));
		b1.setBounds(450, 500, 150, 40);

		b2 = new JButton("Annuler");
		b2.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 20));
		b2.setBackground(new Color(102, 0, 51));
		b2.setForeground(new Color(23, 90, 145));
		b2.setBounds(270, 500, 150, 40);

		b3 = new JButton("Retour");
		b3.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 20));
		b3.setBackground(new Color(102, 0, 51));
		b3.setForeground(new Color(23, 90, 145));
		b3.setBounds(80, 500, 150, 40);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		c.add(l1);
		c.add(l2);
		c.add(tf2);
		c.add(l3);
		c.add(tf3);

		c.add(l7);
		c.add(Branche);
		c.add(b1);
		c.add(b2);
		c.add(b3);

		c.add(img7);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		AjoutCour e = new AjoutCour("IsimmBook");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == Branche) {
			if (Branche.getSelectedIndex() == 0) {
				niveau.removeAllItems();
				String[] Niveau = { "1", "2", "3" };
				for (String i : Niveau) {
					niveau.addItem(i);
				}
			}
			if (Branche.getSelectedIndex() == 1) {
				niveau.removeAllItems();
				String[] Niveau = { "1", "2", "3" };
				for (String i : Niveau) {
					niveau.addItem(i);
				}
			}
			if (Branche.getSelectedIndex() == 2) {

				niveau.removeAllItems();

				String[] Niveau = { "1", "2", "3" };

				for (String i : Niveau) {
					niveau.addItem(i);
				}
			}

			if (Branche.getSelectedIndex() == 3) {

				niveau.removeAllItems();

				String[] Niveau = { "1", "2", "3" };

				for (String i : Niveau) {
					niveau.addItem(i);
				}
			}
			if (Branche.getSelectedIndex() == 4) {

				niveau.removeAllItems();

				String[] Niveau = { "1", "2", "3" };

				for (String i : Niveau) {
					niveau.addItem(i);
				}
			}
			if (Branche.getSelectedIndex() == 5) {

				niveau.removeAllItems();

				String[] Niveau = { "1", "2" };

				for (String i : Niveau) {
					niveau.addItem(i);
				}
			}
			if (Branche.getSelectedIndex() == 6) {

				niveau.removeAllItems();

				String[] Niveau = { "1", "2" };

				for (String i : Niveau) {
					niveau.addItem(i);
				}
			}

			if (Branche.getSelectedIndex() == 7) {

				niveau.removeAllItems();

				String[] Niveau = { "1", "2" };

				for (String i : Niveau) {
					niveau.addItem(i);
				}
			}

			if (Branche.getSelectedIndex() == 8) {

				niveau.removeAllItems();

				String[] Niveau = { "1", "2", "3" };

				for (String i : Niveau) {
					niveau.addItem(i);
				}
			}
		}
		if (e.getSource() == b3) {
			GestionCours interface1 = new GestionCours("IsimmBook");
			interface1.setVisible(true);
			dispose();

		}
		if (e.getSource() == b2) {
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
			tf6.setText("");
			Branche.setSelectedIndex(0);
			niveau.setSelectedItem(0);

		}

		// **************************************
		System.out.println(tf2.getText() + " "	+tf3.getText() + " "+ branche[Branche.getSelectedIndex()]);

		if (e.getSource() == b1) {
			Connexion c = new Connexion();
			String ajoutCour = "INSERT INTO cour (cour, matiere, branche) VALUES (?, ?, ?)";

			try {
				PreparedStatement statement = (PreparedStatement) c.con.prepareStatement(ajoutCour);
				statement.setString(1, tf2.getText());
				statement.setString(2, tf3.getText());
				statement.setString(3, branche[Branche.getSelectedIndex()]);

				statement.executeUpdate();
				System.out.println("A new course was inserted successfully!");

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("sql exception!!");
				e1.printStackTrace();
			}

		}

		// ***************************************

		// TODO Auto-generated method stub
	}
}
