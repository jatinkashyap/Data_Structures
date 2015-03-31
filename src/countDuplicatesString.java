import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countDuplicatesString {
	public static void count(String s){
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		char ch[] = s.toCharArray();
		for(char c:ch){
			if(m.containsKey(c)){
				m.put(c,m.get(c)+1);
			}else{
				m.put(c, 1);
			}
		}
		Set<Character> keys = m.keySet();
		for(char c:keys){
			if(m.get(c)>1){
				System.out.println("Char "+c+" repeating "+m.get(c)+"times");
			}
		}
	}
	public static void main(String[] args) {
		String s = "qwdnkdkndlfkndkldnclkdndlkndkndkvndlncvdkvndlkvnjfbeubfjvbrguooerbrjughtipbnrb";
		count(s);
	}
}
