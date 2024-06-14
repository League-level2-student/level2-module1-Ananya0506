package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	ArrayList<String> list = new ArrayList<String>();
	JButton add = new JButton();
	JButton view  = new JButton();
	String s = "";
	public void createGUI() {
	
		JFrame frame = new JFrame();
frame.setVisible(true);
		JPanel panel = new JPanel();
		
add.setText("Add Name");
view.setText("View Names");
frame.add(panel);
panel.add(view);
panel.add(add);
add.addActionListener(this);
view.addActionListener(this);
list.add(0, "Bob Banders");	
list.add(1,"Sandy Summers" );
list.add(2," Greg Ganders" );
list.add(3, "Donny Doners");
	
// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add 
		if(e.getSource() == add) {
		list.add(list.size(), JOptionPane.showInputDialog("enter a name for the guest."));
		//that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
			// all the names added to the list. Format the list as follows:
		} else if (e.getSource() == view) {
	
		for(int i = 0; i< list.size(); i++) {
s+="Guest " + (i+1) + ":" + list.get(i) + "\n";
	}
JOptionPane.showMessageDialog(null, s);
		s = "";
		}
}}