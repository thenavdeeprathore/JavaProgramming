package variables;

public class Static {

	/*
     * IMPORTANT POINTS:
     * ================
     * Static variables are also known as Class variables
     * 
     * a) As static variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
     * b) Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.
     * c) Initialization of Static Variable is not Mandatory. Its default value is 0.
     * d) Static variables are created at the start of program execution and destroyed automatically when execution ends.
     * e) If we access the static variable without the class name, Compiler will automatically append the class name.
     * f) If we access the static variable like Instance variable (through an object), the compiler will show the warning message and it won’t halt the program. The compiler will replace the object name to class name automatically.
     * g) Static variables are stored in Meta space memory
     */

     static int a = 10;
     static int b;

     void display() {
        System.out.println(a);  //10
        System.out.println(b);  //300   //Static variables shared same memory
     }
     
     public static void main(String[] args) {
        System.out.println(Static.a);  //Refer IMPORTANT POINTS: e
        Static obj = new Static();
        // System.out.println(obj.a);  //This is also Valid but Refer IMPORTANT POINTS: f

        System.out.println(a);  //10
        System.out.println(b);  //0
        b = 300;
        System.out.println(b);  //300

        obj.display();
     }

}
