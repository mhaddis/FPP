package lesson6Hmw;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StringUtility extends JFrame{
	
	private JLabel input;
	private JLabel output;
	private JButton btnCount;
	private JButton btnReverse;
	private JButton btnRemove;
	JTextField inText;
	JTextField outText;
	
	public StringUtility(){

		super("String Utility");
		setLayout(null);
		setSize(500,300);
		btnCount=new JButton("Count Letters");
		btnCount.setBounds(10,40,180,30);
		btnReverse=new JButton("Reverse Letters");
		btnReverse.setBounds(10,80,180,30);
		btnRemove=new JButton("Remove Duplicates");
		btnRemove.setBounds(10,120,180,30);
		input=new JLabel("input");
		input.setBounds(240,50,80,20);
		output=new JLabel("output");
		output.setBounds(240,100,80,20);
		inText=new JTextField(6);
		inText.setBounds(240,70,100,20);
		outText=new JTextField(6);
		outText.setBounds(240,120,100,20);
		add(btnCount);
		add(btnReverse);
		add(btnRemove);
		add(input);
		add(output);
		add(inText);
		add(outText);
		ButtonClicked evr = new ButtonClicked();
		btnCount.addActionListener(evr);
		btnReverse.addActionListener(evr);
		btnRemove.addActionListener(evr);
	}
	
	

class ButtonClicked implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String inp = inText.getText();
		if (e.getSource() == btnCount) {
			String str = String.format("%d", inp.length());
			outText.setText(str);
		}
		if (e.getSource() == btnReverse) {
			String rev = new StringBuilder(inp).reverse().toString();
			outText.setText(rev);
		}
		if (e.getSource() == btnRemove) {
			StringBuilder rmv = new StringBuilder();
			for (int i = 0; i < inp.length(); i++) {
				String ch = inp.substring(i, i + 1);
				if (rmv.indexOf(ch) == -1)
					rmv.append(ch);
			}
			outText.setText(rmv.toString());
		}
	}

	
}
	public static void main(String[] arg) {
		StringUtility su = new StringUtility();
		su.setDefaultCloseOperation(EXIT_ON_CLOSE);
		su.setSize(300, 150);
		su.setVisible(true);
	}
}