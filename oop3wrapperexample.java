/**
 * oop3wrapperexample
 ``````````````````````````````````g* primitive data types: predifend and supported y java. they include boolean char byte short int long and float and double
 * non primitive data type are defined by programmer or java library. they include classes interfaces and array.
 * non primitive data type are also called reference type because they store reference to object to memory rather than actualm value
 * 
 * The purpose of a wrapper class is to convert a primitive data type into an object and vice versa. This is useful for scenarios where we need to use objects instead of primitives, such as in collections, serialization, synchronization, etc
Java provides eight wrapper classes, one for each primitive data type. The table below shows the primitive type and the equivalent wrapper class
1
3
:
 * 
 * wrapper is basically converting the primitive into non primitive(object)
 *  
 * 
 * 
 */
public class oop3wrapperexample {

    /**
     * @param args
     */
    public static void main(String[] args) {
   //int a=10;
   Integer b=20;
 
   Integer a=10;
   Integer num = 45;//as an object..num is an object not like primitive type and it has so many function for it
   //converting primitive into object
System.out.println(a+" "+ b);
/*static void swap(Integer a,Integer b){

//it'd not swap because  we arepassing it
// by value not by reference.in java there is noyhing called as pass by reference. it is not swapping the originalvalue. but when you passedobject reference value is passed.
//even if we covert itto Ineger a Integer b.. and pass it still it is not swapping..why?if we take a look on integer class it is is final.
//what is final?finalis keyword that prevent content to be modified. or not able to be modified.we cant modify the value

    Integer temp=a;
    a=b;
    b=temp;
    return;
    
}
/*
 * FINAL VARIABLE HAS TO BE INITIALISED . FINAL VARIABLE
 */

    }
}