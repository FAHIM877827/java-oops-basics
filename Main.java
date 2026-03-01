class Student{
    String name;
    int age;
    float mark;

    void greeting(){
        System.out.println("Hey hi");
    }

}
public class Main{
    public static void main(String[] args) {
        
        // creating object for the above class
        Student s1 = new Student();
        Student s2 = new Student();  // new variable used to create an Object
        // i can create n number of object for my class

        s1.name = "Fahim"; s1.age = 19; s1.mark = 88.1f;
        s2.name = "Thaush"; s2.age = 20;s2.mark = 72.9f;
        System.out.println(s1.mark);
        System.out.println(s2.name);
        
        // So s1 -> in stack which point the address of object 1;
        // And s2 -> in stack memory point th address of object 2;
    }
}