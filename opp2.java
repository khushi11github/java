class student{
    int rollno;
    String name;
    int marks;

student(){
    this.rollno=12;
    this.name="khushu";
    this.marks=95;

}


}
public class opp2 {
    public static void main(String[] args) {
        student khushi = new student();
        //khushi.name = "khush";
        System.out.println("Name of the Student is : " + khushi.name);
    }
}
