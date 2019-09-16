package lesson6Hmw;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Rainbow extends JFrame {

	private JButton btnRed;
	private JButton btnOrange;
	private JButton btnYellow;
	private JButton btnGreen;
	private JButton btnBlue;
	private JButton btnIndigo;
	private JButton btnViolet;

	public Rainbow(){
		super("Rainbow Color Frame");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(600, 300);
		//setLayout(null);
		btnRed= new JButton();
		btnRed.setBounds(0,0,60,50);
		btnRed.setBackground(Color.RED);
		btnOrange= new JButton();
		btnOrange.setBounds(60,0,60,50);
		btnOrange.setBackground(Color.ORANGE);
		btnYellow= new JButton();
		btnYellow.setBounds(120,0,60,50);
		btnYellow.setBackground(Color.YELLOW);
		btnGreen= new JButton();
		btnGreen.setBounds(180,0,60,50);
		btnGreen.setBackground(Color.GREEN);
		btnBlue= new JButton();
btnBlue.setBounds(240,0,60,50);
btnBlue.setBackground(Color.BLUE);
btnIndigo= new JButton();
btnIndigo.setBounds(300,0,60,50);
btnIndigo.setBackground(Color.decode("#4B0082"));
btnViolet= new JButton();
btnViolet.setBounds(360,0,60,50);
btnViolet.setBackground(Color.decode("#8A2BE2"));
add(btnRed);
add(btnOrange);
add(btnYellow);
add(btnGreen);
add(btnBlue);
add(btnIndigo);
add(btnViolet);

btnRed.addActionListener( e1 -> {
		JButton btn= (JButton) e1.getSource();
		JOptionPane.showMessageDialog(btn,"Red signifies passion, vitality, enthusiasm and security","Color Meaning", JOptionPane.INFORMATION_MESSAGE);});
btnOrange.addActionListener( e2 -> {
		JButton btn= (JButton) e2.getSource();
		JOptionPane.showMessageDialog(btn,"Orange signifies creativity, practicality, playfulness as well as equilibrium ","Color Meaning", JOptionPane.INFORMATION_MESSAGE);});
btnYellow.addActionListener( e3 -> {
		JButton btn= (JButton) e3.getSource();
		JOptionPane.showMessageDialog(btn, "Yellow signifies clarity of thought, wisdom, orderliness and energy","Color Meaning", JOptionPane.INFORMATION_MESSAGE);});
btnGreen.addActionListener( e3 -> {
		JButton btn= (JButton) e3.getSource();
JOptionPane.showMessageDialog(btn,"Green signifies fertility, growth, balance, health and wealth","Color Meaning", JOptionPane.INFORMATION_MESSAGE);});
btnBlue.addActionListener( e4 -> {
		JButton btn= (JButton) e4.getSource();
		JOptionPane.showMessageDialog(btn,"Blue signifies Spirituality and Divinity ","Color Meaning", JOptionPane.INFORMATION_MESSAGE);});
btnIndigo.addActionListener( e5 -> {
		JButton btn= (JButton) e5.getSource();
		JOptionPane.showMessageDialog(btn,"Indigo signifies spiritual attainment, psychic abilities, self awareness and enhancement of Intuition","Color Meaning", JOptionPane.INFORMATION_MESSAGE);});
btnViolet.addActionListener( e6 -> {
		JButton btn= (JButton) e6.getSource();
		JOptionPane.showMessageDialog(btn,"Violet denotes high spiritual mastery","Color Meaning", JOptionPane.INFORMATION_MESSAGE);});
}
	

	public static void main(String[] ar) {
		Rainbow rn = new Rainbow();
		rn.setDefaultCloseOperation(EXIT_ON_CLOSE);
		rn.setVisible(true);
	}
}