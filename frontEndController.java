
public class frontEndController {
	private static frontEndController instance = null;
	private frontEndView view;
	protected frontEndController() {}
	
	public static frontEndController getInstance() {
		if (instance ==null) {
			instance = new frontEndController();
		}
		return instance;
	}
	
	public void viewAction (String actionValue)
	{
		if (actionValue.equals("Exit")){
			view.setVisible(false);
			System.exit(0);
		}
	}
	
	public void beginApp()
	{
		view = new frontEndView();
		view.setVisible(true);
		
	}
	

}
