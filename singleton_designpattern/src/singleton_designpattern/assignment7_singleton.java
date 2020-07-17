package singleton_designpattern;

class singleton{
	private static singleton instance=null;
	public String string;
	private singleton(){
		string="singleton class";
	}
	public static singleton singleton_pattern() {
		if(instance==null)
			instance=new singleton();
		return instance;
	}
}

public class assignment7_singleton {
	public static void main( String[] args ) {
        singleton a = singleton.singleton_pattern(); 
        singleton b = singleton.singleton_pattern(); 
        a.string = (b.string).toUpperCase(); 
        System.out.println("String from a is " + a.string); 
        System.out.println("String from b is " + b.string);  
        b.string = (b.string).toLowerCase();
        System.out.println("String from a is " + a.string); 
        System.out.println("String from b is " + b.string);  
        System.out.println("Object of a if :"+a);
        System.out.println("Object of b if :"+b);
    }

}
