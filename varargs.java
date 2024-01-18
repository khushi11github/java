public class varargs {
   static int sum(int x,int ...arr){
   int result=x;
    for(int a : arr){
        result+=a;
    }
    return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,4,5,6));
        System.out.println(sum(2,3,4,5,6,6,7,7));
    }


//A function with varargs means variable argument can be created in java using the following sytax
/*
 * int sum( int ...args){
 * 
 * }
 * 
 * 
 * arr is available here as int [] arr which is used to store as many argument.
 * we can pass any no. of argument in fuction sum
 * sum(7,9,0);
 * sum(4,6,7,8,9,9);
 * we can also create the fuction like this
 * static void bar(int x, int ...arr)
 * it means atleast one integer (which is x) is required.one qrgument is necessary here
 */
}
