package singleton;
/*
 * Purpose: Make sure than the instance of the class will have only one
 */
public class Singleton {
	private static Singleton _instance = new Singleton();
	public static Singleton instance(){
		if(_instance == null){
			_instance = new Singleton();
		}
		return _instance;
	}
	protected Singleton(){}
}

