package inheritance;

public class Button extends WebElement{

	public void submit() {

		System.out.println("submit Medthod");
	}
	public static void main(String[] args) {
		
		Button baction = new Button();
		baction.click();
		baction.setText();
		baction.submit();
	}
	
}
