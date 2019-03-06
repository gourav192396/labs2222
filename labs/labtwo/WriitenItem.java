package labtwo;

public class WriitenItem extends Item{

	private String author;
	private static String staticAuthor;
	
	public WriitenItem() {
		super(); //calling default constructor of Item
	}
	
	public WriitenItem(String author,String staticAuthor)
	{
		super(123,"Dead by Java",1000); //calling parameter constructor of Item
		this.author = author;
		WriitenItem.staticAuthor = staticAuthor;
	}


	@Override
	void checkIn() {
		System.out.println("CheckIn Method"); //providing body
	}

	@Override
	void checkOut() {
		System.out.println("CheckOut Method");	//providing body	
	}

	@Override
	void addItem() {
		System.out.println("addItem Method"); //providing body
	}
	
	public static void main(String[] args) {
	
	/////////////////////////////////////////////////////////////////////////////	
	WriitenItem wi = new WriitenItem(); //for default constructor
	System.out.println(wi); 			//call toString of WrittenItem; If not present then calls from Item	
	
	wi.setTitle("Java Books"); 			//calling one setter method
	System.out.println(wi.getTitle());  //calling one getter method
	
	wi.checkIn();wi.checkOut();wi.addItem();//calling methods
	//////////////////////////////////////////////////////////////////////////////
	
	
	
	///////////////////////////////////////////////////////////////////////////////
	WriitenItem wi2 = new WriitenItem("Author From WriitenItem","Author from Static variable"); //for parameter constructor
	System.out.println(wi2.author); //print variable
	
	System.out.println(WriitenItem.staticAuthor); //print static variable
	System.out.println(wi2.getTitle()); //calling Item getter
	
	}

}
