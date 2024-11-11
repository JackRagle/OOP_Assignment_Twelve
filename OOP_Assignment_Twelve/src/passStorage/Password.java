package passStorage;

public class Password {
	
	private char[] pass;
	private int indx;
	private int size;
	
	public Password(int size) {
		this.size = size;
		pass = new char[this.size];
		indx = 0;
	}
	
	public void addChar(char in) {
		pass[indx] = in;
		indx++;
	}
	
	public boolean checkPass() {
		boolean isValid = false;
		boolean hasCap = false;
		boolean hasLow = false;
		boolean hasNum = false;
		boolean hasSpe = false;
		int count = 0;
		
		for(int i = 0; i < this.size; i++) {
			if(Character.isUpperCase(this.pass[i])) {
				hasCap = true;
			}
			else if(Character.isLowerCase(this.pass[i])) {
				hasLow = true;
			}
			else if(Character.isDigit(this.pass[i])) {
				hasNum = true;
			}
			else {
				hasSpe = true;
			}
		}
		if(hasCap) count++;
		if(hasLow) count++;
		if(hasNum) count++;
		if(hasSpe) count++;
		if(count >= 3) isValid = true;
		return isValid;
	}
	
}
