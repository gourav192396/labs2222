package labthirteen;

interface MyInterface{
	
	void callMe(String u, String p);
}
public class Demo {

	void check(String username, String password)
	{
		System.out.println(username+password);
	}
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		MyInterface interface1 = (String a , String b) -> demo.check(a, b);
		interface1.callMe("a", "b");
	}
}
