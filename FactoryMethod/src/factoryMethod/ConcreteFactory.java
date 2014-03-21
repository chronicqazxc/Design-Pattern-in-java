package factoryMethod;

import button.*;

public class ConcreteFactory extends AbstractFactory{
	public RedButton makeButton(){
		return new RedButton();
	}
}
