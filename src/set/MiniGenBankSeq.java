package set;

public class MiniGenBankSeq {
	private int locus;
	private int accessionNumber;
	private String definition;
	private String source;
	public int getLocus() {
		return locus;
	}
	public void setLocus(int locus) {
		this.locus = locus;
	}
	public int getAccessionNumber() {
		return accessionNumber;
	}
	public void setAccessionNumber(int accessionNumber) {
		this.accessionNumber = accessionNumber;
	}
	public String getDefinition() {
		if(this.definition !=null)
		{
			return this.definition;
		}
		System.out.println("Warning : value is initialized");
		return null;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public String getSource() {
		if(this.source != null)
		{
			return this.source;
		}
		System.out.println("Warning : value is initialized");
		return null;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	public MiniGenBankSeq(){
		this.locus = 0;
		this.accessionNumber = 0;
		this.definition = new String();
		this.source = new String();
	}
	
	public MiniGenBankSeq(int locus, int accessionNumber) {
		this.locus = locus;
		this.accessionNumber = accessionNumber;
		this.definition = new String();
		this.source = new String();
	}
	
	public MiniGenBankSeq(int locus, int accessionNumber, String definition,
			String source) {
		this.locus = locus;
		this.accessionNumber = accessionNumber;
		this.definition = definition;
		this.source = source;
	}
	@Override
	public String toString() {
		return "MiniGenBankSeq [locus=" + locus + ", accessionNumber="
				+ accessionNumber + ", definition=" + definition + ", source="
				+ source + "]";
	}
	
	
}
