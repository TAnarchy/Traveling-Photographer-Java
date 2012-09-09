import javax.swing.*;
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello world after a while");
		frontEndController FEC=frontEndController.getInstance();
		FEC.beginApp();
	}

}
