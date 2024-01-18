public class methods {
    static void telljoke(){
        //STATIC KEYWORD
        //static keyword is used to associated a method of a given class with the class rather than the object.static method in a class is shared by all objects
        
        System.out.println("I INVENTED THE NEW WORLD "
                + "plagarism"  );
    }
    int sum(int a,int b){
        int c=a+b;
        return c;
    }
    //METHOD OVERLOADING
    //TWO OR MORE methods can have same name but different parameter such methods are called overloaded methods 
    /*
     * overloaded function foo
     * void foo()
     * vpid foo(int a);
     * void foo(int a, int b)
     * overloading cannot be performed by changing return type of the method
     *  
     */
    static void foo(){
        System.out.println("foo is called without any argument");
    }
    static void foo(int a){
        System.out.println("foo"+a);
    }

    public static void main(String[] args) {
        telljoke();
        //CALLING A METHOD 
        //A method can be calledby creating an object of class in which the method exist followed by mrthod call;
        methods obj = new methods();//created a object of class method and this obj is used to callthe fuctions/methods
       int c=obj.sum(7,0);
       System.out.println(c);
    System.out.println("foo is called")
;
foo();//calling foo with no arguments
foo(5);  
    }
//telljoke method is static method shared by all the object of the class "Method" so while calling it we need not to call it by using object. 

}


