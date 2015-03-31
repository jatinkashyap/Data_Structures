
public class ReverseString {
	public static String recursiveMethod(String s){
		String reverse = "";
		if(s.length()==1){
			return s;
		}else{
			reverse += s.charAt(s.length()-1) + recursiveMethod(s.substring(0, s.length()-1));
			return reverse;
		}
	}
	public static String loopMethod(String s){
		String reverse = "";
		for(int i = s.length()-1;i>=0;i--){
			reverse += s.charAt(i);
		}
		return reverse;
	}
	public static void main(String[] args) {
		String s = "Jatin";
		System.out.println(s);
		System.out.println(ReverseString.recursiveMethod(s));
		System.out.println(s);
		System.out.println(ReverseString.loopMethod(s));
	}
}
