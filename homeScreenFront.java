import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

public class homeScreenFront extends JPanel {


	private void exitButtonListener(MouseEvent e) {
		System.exit(0);
	}

	private void initComponents() {
	
		// Generated using JFormDesigner Evaluation license - Artion Fine
		label1 = new JLabel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new FormLayout(
			"4*(default, $lcgap), 44dlu, $lcgap, default",
			"11*(default, $lgap), default"));

		//---- label1 ----
		label1.setText("Description Goes Here");
		add(label1, CC.xywh(3, 3, 9, 13));

		//---- button1 ----
		button1.setText("Trips");
		add(button1, CC.xywh(3, 17, 5, 5));

		//---- button2 ----
		button2.setText("Profile");
		add(button2, CC.xywh(9, 17, 1, 5));

		//---- button3 ----
		button3.setText("Exit");
		button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				exitButtonListener(e);
				exitButtonListener(e);
			}
		});
		add(button3, CC.xywh(11, 17, 1, 5));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Artion Fine
	private JLabel label1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
