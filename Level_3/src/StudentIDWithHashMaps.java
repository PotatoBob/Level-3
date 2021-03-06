import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StudentIDWithHashMaps implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton add;
	JButton view;
	String name = "";
	int ID = 0;
	HashMap<String, Integer> x = new HashMap<>();
	public static void main(String[] args) {
		StudentIDWithHashMaps SIDWHM = new StudentIDWithHashMaps();
	}
	StudentIDWithHashMaps() {

		window = new JFrame();
		window.setVisible(true);
		panel = new JPanel();
		
		add = new JButton("Add");
		add.addActionListener(this);
		panel.add(add);
		view = new JButton("View");
		view.addActionListener(this);
		panel.add(view);
		
		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(100, 100);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == add) {
			name = JOptionPane.showInputDialog("Enter Name");
			ID = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
			x.put(name, ID);
		}
		else if (e.getSource() == view) {
			for (String B : x.keySet()) {
				//System.out.println(x.get(B));
				System.out.print("name: "+B);
				System.out.println("    ID: "+x.get(B));
				//System.out.print(x.get(B));
			}
		}
		
	}
}
