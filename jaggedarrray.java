public class jaggedarrray {
public static void main(String[] args) {
    int arr[][]=new int[2][];//i dont know the number of column i have 
    //column size is not fixed . this called jagged array
    //we can create a row with any number of columns and we don't need to declare all at once.
    arr[0]=new int[3];
    arr[1]= new int[4];
    for(int i=0;i<arr.length;i++){
        for(int j=0;i<arr[i].length;j++){
            arr[i][j]=(int)(Math.random()+10);
            System.out.print(arr[i][j]+" ");
        }
    }
    for(int n[]: nums){
        for(int val :n)System.out.println(val+" ");
    }
}
    
}  
