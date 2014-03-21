import button.*;
import factoryMethod.*;

public class test {
	public static void main(String [] args){
		ConcreteFactory factory = new ConcreteFactory();
		Button redButton = factory.makeButton().generateButton();
		System.out.println("button1:" +redButton+ "button color: " + redButton.getButtonColor() + ", button name: "+ redButton.getButtonName());
	}
}
