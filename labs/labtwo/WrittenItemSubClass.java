package labtwo;

public class WrittenItemSubClass {

	public static void main(String[] args) {
		
		Book book = new Book();
		System.out.println(book);
	}

}

class Book extends WriitenItem{

	public Book() {
		System.out.println("Default of Book");
	}
}