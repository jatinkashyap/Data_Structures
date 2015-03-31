
public class HashCodeDemo {
	public static void main(String[] args) {
		HashObject h1 = new HashObject("Java",123);
		HashObject h2 = new HashObject("Python",456);
		HashObject h3 = new HashObject("R",789);
		HashObject h4 = new HashObject("Java",123);
		System.out.println(h1.equals(h4));
		System.out.println(h2.equals(h3));
	}
}

class HashObject{
	private String name;
	private int price;
	
	public HashObject(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int hashCode(){
		int hashCode;
		hashCode = this.name.hashCode();
		hashCode += hashCode +(price*20);
		return hashCode;
	}
	
	public boolean equals(Object o){
		if(o instanceof HashObject){
			HashObject i = (HashObject)o;
			return (this.name.equals(i.name) && (this.price == i.price));
		}else{
			return false;
		}
	}
}