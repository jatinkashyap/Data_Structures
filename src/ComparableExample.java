import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Arrays;

class Item implements Comparable<Item>{
	public int value;
	
	public Item(int value){
		this.value = value;
	}
	
	public int compareTo(Item item){
		return Integer.compare(this.value, item.value);
	}
}


public class ComparableExample {
	public static void main(String[] args) throws IOException, ParseException {
		
			FileReader fr = new FileReader("src/Sort.java");
			char[] ch = new char[500];
			fr.read(ch);
			boolean something = false;
			if(something){
				throw new ParseException();
			}
			for(char c : ch){
				System.out.print(c);
			}
		
	}
	
}

class ParseException extends Exception{
	
}
