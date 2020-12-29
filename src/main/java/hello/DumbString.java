package hello;

public class DumbString {
	private String value;
	
	public DumbString() {
		setValue("");
	}

	public DumbString(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return getValue();
	}
}
