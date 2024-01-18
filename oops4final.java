
/*
 * ALWAYS INTIATISLIZE WHILE DECLARING IT.
 * finalguarantee that thisimmutability
 * or whatever only when the instance variable are primitive data type
 * 
 * 
 * if theinstance variableof reference type has a final modifier behind it
 * the valueof instance variable willnever change.the reference to the object willnever change.it willalways refers to the same object.the value of  object can change.
 * 
 * final student kunal- new student();
 * kunal.name="new name"
 */

class A{
    String name;
    public A(String name){
        this.name= name;
    }
    @Override
    protected void finalize() throws Throwable{
System.out.println("object is destroyed");
//if any object of the class a freed from the memory.finaize method is called automatically



    }
}


public  class oops4final {
    public static void main(String[] args) {
 A kunal = new  A("khushi");
 kunal.name="kunal";
 //when a new primitive isfinal, you connot reassign it .
 // kunal = new A("new object");(not allowed)
    }
    
}
/*
 * what is garbage collection ?
 * in java garbage means unreferenced object/
 * 
 * garbage collection is a way to destroy un used object
 * 
 * 
 * 
 * 
 * 
 */
