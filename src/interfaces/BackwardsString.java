package interfaces;

public class BackwardsString extends SpecialString{
	
	public BackwardsString(String s) {
		super(s);
		
	}

	public String funkifyText(String str) {
		String end = "";
		for (int i = str.length()-1; i >= 0; i--) {
			end+=str.charAt(i);
		}
		System.out.println(end);
		return end;
	}
}
