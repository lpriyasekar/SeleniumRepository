package inheritance;

public class CheckBoxButton extends Button {

	public void CheckButton() {

		System.out.println("CheeckButton method");
	}
	
	public static void main(String[] args) {
		CheckBoxButton boxaction=new CheckBoxButton();
		boxaction.submit();
		boxaction.CheckButton();
	}
}

