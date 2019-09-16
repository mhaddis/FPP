package lesson7Hmw;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import lesson6Hmw.Rainbow;

public class Metric extends JFrame {
	Metric() {
		super("Metric Conversion Assistant");
		setSize(650, 380);
		setLayout(null);
		JLabel mile = new JLabel("Mile:");
		mile.setBounds(30, 40, 50, 30);
		add(mile);
		JLabel lb = new JLabel("Pound:");
		lb.setBounds(30, 80, 50, 30);
		add(lb);
		JLabel gl = new JLabel("Gallon:");
		gl.setBounds(30, 120, 70, 30);
		add(gl);
		JLabel fr = new JLabel("Fahrenheit:");
		fr.setBounds(30, 160, 70, 30);
		add(fr);
		JLabel km = new JLabel("Kilometer:");
		km.setBounds(350, 40, 70, 30);
		add(km);
		JLabel kg = new JLabel("Kilogram:");
		kg.setBounds(350, 80, 70, 30);
		add(kg);
		JLabel l = new JLabel("Liters:");
		l.setBounds(350, 120, 70, 30);
		add(l);
		JLabel c = new JLabel("Centgrade");
		c.setBounds(350, 160, 70, 30);
		add(c);
		JTextField txtM = new JTextField();
		txtM.setBounds(120, 45, 120, 20);
		add(txtM);
		JTextField txtP = new JTextField();
		txtP.setBounds(120, 90, 120, 20);
		add(txtP);
		JTextField txtG = new JTextField();
		txtG.setBounds(120, 130, 120, 20);
		add(txtG);
		JTextField txtF = new JTextField();
		txtF.setBounds(120, 170, 120, 20);
		add(txtF);
		JTextField txtKm = new JTextField();
		txtKm.setBounds(440, 45, 120, 20);
		add(txtKm);
		JTextField txtKg = new JTextField();
		txtKg.setBounds(440, 90, 120, 20);
		add(txtKg);
		JTextField txtL = new JTextField();
		txtL.setBounds(440, 130, 120, 20);
		add(txtL);
		JTextField txtC = new JTextField();
		txtC.setBounds(440, 170, 120, 20);
		add(txtC);
		/*JPanel panel=new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.add(b);*/
		JButton btn = new JButton("Convert");
		btn.setBounds(260, 230, 80, 45);
		add(btn);
		btn.addActionListener(evt -> {
			
			String sml= txtM.getText();
			String spd= txtP.getText();
			String sga= txtG.getText();
			String sfh= txtF.getText();
			String skg= txtKg.getText();
			String skm= txtKm.getText();
			String sc= txtC.getText();
			String sl= txtL.getText();
			
			
			double dml= Double.parseDouble(txtM.getText());
			double dpd= Double.parseDouble(txtP.getText());
			double dga= Double.parseDouble(txtG.getText());
			double dfh= Double.parseDouble(txtF.getText());
			double dkg= Double.parseDouble(txtKg.getText());
			double dkm= Double.parseDouble(txtKm.getText());
			double dc= Double.parseDouble(txtC.getText());
			double dl= Double.parseDouble(txtL.getText());
			
			

			if (sml != null && !isNumber(sml))
				JOptionPane.showMessageDialog(null, "Error: Mile must be number.");
			else {
				sml.isEmpty();
					dml = 0;
			}
			if (spd != null && !spd.isEmpty() && !isNumber(spd))
				JOptionPane.showMessageDialog(null, "Error: Pound must be number.");
			else {
				spd.isEmpty();
					dpd = 0;
			}
			if (sga != null && !sga.isEmpty() && !isNumber(sga))
				JOptionPane.showMessageDialog(null, "Error: Gallon must be number. Check for your input.  ");
			else {
				sga.isEmpty();
					dga = 0;
			}

			if (sfh != null && !sfh.isEmpty() && !isNumber(sfh))
				JOptionPane.showMessageDialog(null, "Error: Fahrenheit must be number.");
			else {
				sfh.isEmpty();
					dfh = 0;
			}

			if (skm != null && !skm.isEmpty() && !isNumber(skm))
				JOptionPane.showMessageDialog(null, "Error: Kilometer must be number.");
			else {
				skm.isEmpty();
					dkm = 0;
			}
			if (skg != null && !skg.isEmpty() && !isNumber(skg))
				JOptionPane.showMessageDialog(null, "Error: Kilogram must be number.");
				else {
					skg.isEmpty();
						dkg = 0;
				}
			if (sl != null && !sl.isEmpty() && !isNumber(sl))
				JOptionPane.showMessageDialog(null, "Error: Litre must be number.");
			else {
				sl.isEmpty();
					dl = 0;
			}

			if (sc != null && !sc.isEmpty() && !isNumber(sc))
				JOptionPane.showMessageDialog(null, "Error: Centigrade must be number.");
			else {
				sc.isEmpty();
					dc = 0;
			}

			// check for negative value.

			if (dml < 0 || dpd < 0 || dga < 0 || dkm < 0 || dkg < 0 || dl < 0) {
				JOptionPane.showMessageDialog(null,
						"Error: Please Enter Positive number.");

			}

				dml = 0.62 * dkm;
				dkm = 1.6 * dml;
				dpd = 2.2 * dkg;
				dkg = 0.45 * dpd;
				dga = 0.264 * dl;
				dl = 3.785 * dga;
				dfh = (dc * 1.8) + 32;
				dc = (dfh - 32) / 1.8;
				
				txtKm.setText(String.format("%.2f",dkm));
				txtKg.setText(String.format("%.2f",dkg));
				txtL.setText(String.format("%.2f",dl));
				txtC.setText(String.format("%.2f",dc));
				txtP.setText(String.format("%.2f",dpd));
				txtM.setText(String.format("%.2f",dml));
				txtG.setText(String.format("%.2f",dga));
				txtF.setText(String.format("%.2f",dfh));
			});
	}
	

	boolean isNumber(String input) {
		try {
			Double.parseDouble(input);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

	public static void main(String[] ar) {
		Metric rn = new Metric();
		rn.setDefaultCloseOperation(EXIT_ON_CLOSE);
		rn.setVisible(true);
	}
}