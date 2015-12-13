import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Manager extends JFrame {
	public JTextArea textarea = new JTextArea();
	public static JTextArea textArea2 = new JTextArea();
	public class Team{
		public int num_players;
		public String name;
		public Team(int num_players,String name ){
			this.num_players = num_players;
			this.name=name;
		}
	}
	public Manager() {
		getContentPane().setBackground(Color.GREEN);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Soccer Team Manager");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 434, 31);
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getContentPane().add(label);
		
		
		textarea.setBounds(75, 62, 298, 153);
		getContentPane().add(textarea);
		
		JButton btnClickHereTo = new JButton("Click Here to View Soccer Strategies");
		btnClickHereTo.setBounds(10, 226, 255, 37);
		getContentPane().add(btnClickHereTo);
		btnClickHereTo.addActionListener(new Action());
		
		
		textArea2.setBounds(275, 226, 262, 108);
		getContentPane().add(textArea2);
		
	
	}
	static class Action implements ActionListener{
		public void actionPerformed (ActionEvent e){
			textArea2.append("This is a quick reference to building the best team possible \n");
			textArea2.append("Make sure you try to find a balance in your team and have multiple players in each position");
		}
	}
	public static void main(String[] args) {
		
}
}