import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Sat Sep 01 18:34:10 EDT 2012
 */



/**
 * @author Artion Fine
 */
public class frontEndView extends JFrame {
	public frontEndView() {
		initComponents();
	}

	private void buttonClicked(MouseEvent e) {
		Object obj = e.getSource();
		JButton currentButton=(JButton)obj;
		frontEndController fed = frontEndController.getInstance();
		fed.viewAction(currentButton.getText());
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Artion Fine
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		label1 = new JLabel();

		//======== this ========
		Container contentPane = getContentPane();

		//---- button1 ----
		button1.setText("Your Trips");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonClicked(e);
			}
		});

		//---- button2 ----
		button2.setText("Your Profile");
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonClicked(e);
			}
		});

		//---- button3 ----
		button3.setText("Exit");
		button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonClicked(e);
			}
		});

		//---- label1 ----
		label1.setText("<HTML><h2>Welcome to Traveling Photographer!</h2><BR> An application that allows School Photographers to quickly input their Travel data, that directly interacts with Google Maps. Quick and easy!</HTML>");
		label1.setBorder(new LineBorder(Color.black));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setHorizontalTextPosition(SwingConstants.CENTER);

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(button2, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
							.addGap(18, 18, 18)
							.addComponent(button3, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(11, 11, 11)
							.addComponent(label1, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)))
					.addContainerGap())
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label1, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
					.addGap(9, 9, 9)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(button3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(button2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addGap(35, 35, 35))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Artion Fine
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JLabel label1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
