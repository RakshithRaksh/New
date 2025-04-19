package Practice;

public class Arrays_49 {
    public static void main(String[] args) {
       // int a[] = new int[-1]; // This is called as run time error.

        int[] a2 = new int[3];
        a2[0] = 22;
        a2[1]= 45;
        a2[2] = 55;

        for (int i : a2){
            System.out.println(i);
        }

        String[] a3 = new String[2];

        a3[0] = "Rakshith";
        a3[1] =  "Acharya";

        for(String j : a3){
            System.out.println(j);
        }
    }
}
