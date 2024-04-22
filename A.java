package keyword;

//this is doing with the help of instance and local variable....//public class th {
class A {
    int a;

    A(int a) {
        a = a;
        // System.out.println(a);
    }

    void show() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        A r = new A(100);
        r.show();
    }
}
