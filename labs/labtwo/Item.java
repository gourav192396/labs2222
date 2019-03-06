package labtwo;

public abstract class Item {

	private long identificationNumber;
	private String title;
	private int numberOfCopies;
	
	public long getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(long identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	public Item(){System.out.println("Default constructor of Item");}
	
	public Item(long identificationNumber, String title, int numberOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Called toString from Item";
	}

	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
	//methods without body
	abstract void checkIn();
	abstract void checkOut();
	abstract void addItem();

}

