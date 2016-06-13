import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class WordScramble implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton add;
	JButton view;
	JButton play;
	String thing ="";
	String staff;
	ArrayList<String> words = new ArrayList<>();
	public static void main(String[] args) {
		WordScramble WS = new WordScramble();
	}
	WordScramble() {
		window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		add = new JButton("Add");
		add.addActionListener(this);
		panel.add(add);

		view = new JButton("View");
		view.addActionListener(this);
		panel.add(view);

		play = new JButton("Play");
		play.addActionListener(this);
		panel.add(play);

		window.add(panel);
		window.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			System.out.println("add");
			String word = JOptionPane.showInputDialog("Enter Word");
			words.add(word);
			thing="";
			for (int i = 0; i < words.size(); i++) {
				thing += i+1 +"";
				thing += ") ";
				thing += words.get(i);
				thing += "  ";
			}

		} else if (e.getSource() == view) {
			System.out.println("view");
			JOptionPane.showMessageDialog(null, thing);
		} else if (e.getSource() == play) {
			System.out.println("play");
			String x = "";
			char[] y;
			ArrayList<Integer> nums = new ArrayList<>();
			int random = new Random().nextInt(words.size()-1);
			x = words.get(random);
			y = x.toCharArray();
			for (int i = 0; i < y.length; i++) {
				int ran = new Random().nextInt(y.length-1);
				int ram = new Random().nextInt(y.length-1);
				if (ran != ram) {
					char one = y[ran];
					char two = y[ram];
					y[ran] = two;
					y[ram] = one;
				} else {
					i--;
				}
			}
			staff = new String (y);
			String r = JOptionPane.showInputDialog(staff);
			if (r.equals(x)) {
				JOptionPane.showMessageDialog(null, "Yay you won now go home");
			}
		}
	}
}
