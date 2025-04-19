package Practice;

public class Access_Method_Overloading {
    public static void main(String[] args) {
        // Method overloading or compilation polymorphism
        Method_overloading m1 = new Method_overloading();
        int store = m1.add(2,3);
        System.out.println(store);
        int store1 = m1.add(1,2,5);
        System.out.println(store1);
    }
}
