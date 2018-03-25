package interfaces;

public class MixedCapsString extends SpecialString {
	public MixedCapsString(String s) {
		super(s);
	}

	public String funkifyText(String s) {
		String end = "";
		for (int i = 0; i < s.length(); i++) {
			if(i%2 == 0) {
				end+=Character.toLowerCase(s.charAt(i));
			} else {
				end+=Character.toUpperCase(s.charAt(i));
			}
		}
		return end;
	}
}
