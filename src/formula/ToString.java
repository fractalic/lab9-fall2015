package formula;

public class ToString implements Formula{
	
	Formula formula;
	private String toStr;
	
	public ToString(Formula formula) {
		formula.toString();
	}
	
	public String toString() {
		return this.toStr;
	}
	
	public boolean evaluate() {
		return false;
	}
}
