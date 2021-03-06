import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StudentID implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton add;
	JButton view;
	String name = "";
	int ID = 0;
	HashMap<String, Integer> StudID = new HashMap<>();
	ArrayList<String> names = new ArrayList<>();
	ArrayList<Integer> IDs = new ArrayList<>();
	public static void main(String[] args) {
		StudentID SID = new StudentID();
	}
	StudentID() {
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
			//StudID.put(name, ID);
			names.add(name);
			IDs.add(ID);
		}
		else if(e.getSource() == view) {
			//System.out.println(StudID);
			for (int i = 0; i < IDs.size(); i++) {
				System.out.print("name: "+names.get(i));
				System.out.println("    id: "+IDs.get(i));
			}
		}
	}
}
