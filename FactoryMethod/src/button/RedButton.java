package button;

public class RedButton extends Button {

	@Override
	public Button generateButton() {
		// TODO Auto-generated method stub
		this.setButtonColor("red");
		this.setButtonName("Red Button");
		return this;
	}

}
