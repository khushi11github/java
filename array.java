/**
 * array
 */
public class array {

    public static void main(String[] args) {
//Array is a collection ofsimilar type of data datatype [] arrayname.

int [] marks=new int[5];
marks[0]=100;
marks[1]=98;
marks[2]=98;
marks[3]=99;
System.out.println(marks[4]);

// 3 WAYS TO CREATE ARAAY IN JAVA
int [] rollno;//declaration
rollno =new int[5];//memory allocation

String [] name= new String[4];// declaration+memeory allocation

double [] weight={20.0,80.7,11.3,5.0,77.9};//declaration+intialization
System.out.println(weight.length);//length of array

//MULTIDIMENTIONAL ARRAY:-2D ARRAY
//A2darray can be created as follow
int [][] flats =new int[2][3];
flats [0] [0]=1;
flats [0] [1]=2;
flats [0] [2]=3;
/*
 *     coloumn
 * rows  0        1     2
 * o   [0][0]  [0,1]  [0,2]
 *  
 * 1  [1,0]   [1,1]    [1,2]
 * 
 *new int[rows][coloumn] 
 *
 */

}}