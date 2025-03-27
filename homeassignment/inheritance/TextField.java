package inheritance;

public class TextField extends WebElement{
	
	public void getText() {

		System.out.println("gettext Method");
	}

	public static void main(String[] args) {
		TextField taction = new TextField();
		taction.click();
		taction.setText();
		taction.getText();
	}
}
