package lesson7Hmw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
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
		JButton btn = new JButton("Convert");
		btn.setBounds(260, 230, 80, 45);
		add(btn);
		btn.addActionListener((ActionEvent e) -> {
			double ml = Double.parseDouble(txtM.getText());
			double pd = Double.parseDouble(txtP.getText());
			double ga = Double.parseDouble(txtG.getText());
			double fh = Double.parseDouble(txtF.getText());
			double kl = ml * 1.6;
			double ki = pd * 0.453;
			double lt = ga * 3.78541;
			double ct = (fh - 32) * 1.8;
			txtKm.setText(String.format("%.2f", kl));
			txtKg.setText(String.format("%.2f", ki));
			txtL.setText(String.format("%.2f", lt));
			txtC.setText(String.format("%.2f", ct));
		});
		
	}

	public static void main(String[] ar) {
		Metric rn = new Metric();
		rn.setDefaultCloseOperation(EXIT_ON_CLOSE);
		rn.setVisible(true);
	}
}