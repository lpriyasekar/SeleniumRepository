package inheritance;

public class RadioButton extends Button{

	public void selectRadioButton() {

		System.out.println("selectRadioButton method");
	}
	
	public static void main(String[] args) {
		RadioButton raction=new RadioButton();
		raction.click();
		raction.submit();
		raction.selectRadioButton();
	}
}
