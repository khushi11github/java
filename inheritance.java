class base{
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }
    public void printx(int x){
        System.out.println(x);
    }
}
//extend is  used to inheritance basr
//inheritance in java is declared using extend keyword



class derived extends base{
    int y;
    public int gety(){
        return y;
    }
   public void sety(int y){
    this.y = y;
   }
   
}








public class inheritance {
    public static void main(String[] args) {
        base b=new base();
        b.setx(4);
       System.out.println(b.getx());
      derived d = new derived();
      d.setx(8);
      System.out.println(d.getx());
    }}