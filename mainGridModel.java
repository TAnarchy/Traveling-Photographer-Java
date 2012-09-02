import javax.swing.*;

public class mainGridModel extends JFrame 
{
	public mainGridModel()
	{
		setUP();
	}
	
	private void setUP()
	{
		JButton mainGrid = new JButton("Trips");
		JButton clientInfo = new JButton("Client Information");
		JButton exit = new JButton("Exit");
		JLabel description = new JLabel("Description goes here");
		add(description);
		add(mainGrid);
		add(clientInfo);
		add(exit);
	}

}
