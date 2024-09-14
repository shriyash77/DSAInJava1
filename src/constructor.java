class Const{
    private String name;
    private int id;
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public Const(String myName, int myId){
        name = myName;
        id = myId;
    }
}
public class constructor {
    public static void main(String[] args) {
    Const shriyash = new Const("Shriyash", 45);
        System.out.println(shriyash.getName());
        System.out.println(shriyash.getId());
    }
}
