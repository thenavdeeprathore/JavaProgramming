package variables;

public class Instance {
	
	/*
     * IMPORTANT POINTS:
     * =================
     * Instance variables are non-static variables and are declared in a class outside any method, constructor or block
     * 
     * a) As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
     * b) Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used.
     * c) Initialization of Instance Variable is not Mandatory. Its default value is 0
     * d) Instance Variable can be accessed only by creating objects.
     * e) Instance variables are stored in Heap memory inside newly created objects.
     */
	
	int a;
	int b=10;
	
	void display() {
		a = 20;
		System.out.println(a); // 20
		System.out.println(b); // 10
	}

	public static void main(String[] args) {
//		System.out.println(a);	//Invalid, can't use instance variable directly in static method
		
		Instance obj = new Instance();
		System.out.println(obj.a); // 0
		System.out.println(obj.b); // 10
		obj.display();
	}

}
