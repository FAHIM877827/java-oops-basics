class A{

    String name = "mohamed";
}
public class Final {
    public static void main(String[] args) {
        
        // for a  premitive
        final int a = 10;
        System.out.println(a);
        // when i code a = 20 it shows error
        
        
        // for a object
        final A obj1 = new A();
        obj1.name = "Fahim";
        System.out.println(obj1.name);
        // reassigning =>  obj1 = new A(); try to create new obj impossibe

        

    }
    // when a non premitive is in final we canot resign it.
    // ob1 --> A . when i use a final key the arraow mark become constent

}
