class Student{
    int age ;
}

public class passbyvalofobj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 18;
        ChangeObjectVal(s1);
        System.out.println(s1.age);

    }
    static void ChangeObjectVal(Student s2){
        s2.age = 20;
    }
}

// s1 -> reference. when i pass thet a new reference is created at stack
// memory and thet also point to the same object .

// s1 ,s2 in stack ===> Student obj; so in this 
// When passing object:

// ✔ New reference variable created
// ✔ Reference value copied
// ✔ No new object created
// ✔ Java is still 100% pass by value
