package factoryMethod;

import button.*;

public abstract class AbstractFactory {
	Button button;
	AbstractFactory(){
		button = makeButton();
	}
	abstract Button makeButton();
}
