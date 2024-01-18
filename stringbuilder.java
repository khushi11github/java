//strings are immutable..stringbuilder add modify string

import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("TONAA");
        System.out.println(sb);
   //REPACING CHAR USIG setCharAt(index,newchar)
   sb.setCharAt(0,'y');
   System.out.println(sb);
  
//INSERTING using insert
sb.insert(2,'n');
//DELETe using delete(start,end index)
System.out.println(sb.delete(1,3));
//APPEND at the end using append
sb.append("e");//str=str+"e"
System.out.println(sb);
//CAPACITY of String builder is automatically increased when we exceed the capacity
//sb.length()-->for length;

//REVERSING A STRING

//REVERSING A STRING

//REVERSING A STRING

Scanner sc = new Scanner(System.in);
StringBuilder sb1=new StringBuilder(sc.nextLine());
for(int i=sb1.length()-1;i>-1;i--){
    System.out.print(sb1.charAt(i));
}




String s1=new  String("harry");
System.out.println(s1);
String s3 =s1.substring(0,3);
System.out.println(s3);
//STRING METHOD
/*String name="hary";
1. name.length():-returns length of string
2.name.toLowerCase():returns a new string which has all the lowercase character from string name
3.name.toUpperCase(): returns a new string with all upper case characters in string name
4.name.trim():-Returns a new string after removing all the leading and trading spaces fromthe original string
5.name.substring(int start,end):=returns a substring 
(end is exclusive)
6.name.replace(target string,replacing string);


 
 */




String nontrimstring="     ssharry    ";
System.out.println(nontrimstring.trim());





    }
}
