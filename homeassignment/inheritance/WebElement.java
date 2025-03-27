package inheritance;

public class WebElement {

	public void click() {
		System.out.println("Click Method");
	}
	
	public void setText() {
		System.out.println("SetTest Method");
	}

	public static void main(String[] args) {
		WebElement action=new WebElement();
		action.click();
		action.setText();
	}
}
