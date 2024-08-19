class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is :" + id);
        System.out.println("and my name is :" + name);
    }
}
public class OOP {
    public static void main(String[] args) {
    Employee shriyash = new Employee(); //Instantiating a new object
         Employee shravan = new Employee(); //Instantiating a new object

        //setting properties(Attributes)
    shriyash.id = 1;
    shriyash.name = "Shriyash";
    shravan.id = 2;
    shravan.name = "Shravan";

        //printing the attributes
        shriyash.printDetails();
        shravan.printDetails();
//        System.out.println(Shriyash.id);
//        System.out.println(Shriyash.name);
    }
}
