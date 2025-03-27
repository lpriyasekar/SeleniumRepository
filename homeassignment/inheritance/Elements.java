package inheritance;

public class Elements extends Button{

	public void execution() {
		
		System.out.println("Element method");
	}
	
	public static void main(String[] args) {
		Elements e=new Elements();
		e.click();
		e.execution();
		e.setText();
		e.submit();
	
	}
}
