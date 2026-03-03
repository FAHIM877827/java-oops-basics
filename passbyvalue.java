public class passbyvalue{
    public static void main(String[] args) {
        
        int a = 10;
        changepremitive(a);
        System.out.println(a); // it will print 10;

    }
    static void changepremitive(int A){
        A = 100;
    }
}
//whan i pass a the copy of will passed  and the copy get changed
// eg: 10 in memory 2000 . when i give changepremitive(a) a new memory
// created created 3000 and the copy of the a will stored in this .
// this only passed as perameter.