package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="Jatin";
		e.address="123";
		e.number=12345;
		e.SSN=12345;
		try{
			FileOutputStream fileOut = new FileOutputStream("F:/Eclipse Workspces/Preparation/Data_Structures/src/tmp/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved");
		}catch(Exception i){
			i.printStackTrace();
		}
		
	}
}
