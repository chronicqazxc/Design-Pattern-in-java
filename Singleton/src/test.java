import singleton.*;

public class test {
	public static void main(String [] args){
		Singleton singleton = Singleton.instance();
		System.out.println("singleton1: "+singleton);
		Singleton singleton2 = Singleton.instance();
		System.out.println("singleton2: "+singleton2);
	}
}
