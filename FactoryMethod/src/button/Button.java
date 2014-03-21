package button;

public abstract class Button {
	private String buttonColor;
	private String buttonName;
	abstract Button generateButton();
	public String getButtonColor() {
		return buttonColor;
	}
	public void setButtonColor(String buttonColor) {
		this.buttonColor = buttonColor;
	}
	public String getButtonName() {
		return buttonName;
	}
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
	
}
