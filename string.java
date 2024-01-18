import java.util.*;
public class string {
    public static void main(String args[]){
        String name="Tony";
        String fullname="Tony shark";
        Scanner sc= new Scanner(System.in);
        String Name=sc.nextLine();
        System.out.println("your name is : "+ Name);
        System.out.println(Name.length());
    //charat:-charat usedto print string character one by one
for(int i=0;i<Name.length();i++){
    System.out.println(Name.charAt(i));
 }
 //indexof :- it returns the index of a specified string in another string
 //comparing string 
/*
 compareTo returns
 s1>s2:+ve;
 s1==s2:0;
 s1<s2:-ve;
 */
String name1="Tony";
String name2="Tony";
if(name1.compareTo(name2)==0){
    System.out.println("Strings are equal");

}
else{
    System.out.println("not equal");
}
//why this?strings are object in java and their functionaing is different from orignal string
if(new String("tony")==new String("tony")){
    System.out.println("equal");

}
else{
    System.out.println("not equal");
}

//SUBSTRING IN JAVA;:-bengin to sent.index-1
String sen="My name is khushi";
String mame=sen.substring(11,sen.length());
System.out.println(mame);
//strings are immutable in java
//split()
String str1="This is my first program";
String ss2[]=str1.split("\\s");
for(String x: ss2){
    System.out.println(x);
}






    }
}
