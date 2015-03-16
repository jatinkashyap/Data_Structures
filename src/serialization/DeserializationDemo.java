package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) {
		Employee e = null;
		try{
			FileInputStream f = new FileInputStream("F:/Eclipse Workspces/Preparation/Data_Structures/src/tmp/employee.ser");
			ObjectInputStream in = new ObjectInputStream(f);
			e = (Employee) in.readObject();
			System.out.println(e.SSN);
		}catch(Exception i){
			i.printStackTrace();
		}
	}
}
