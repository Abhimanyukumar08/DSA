import java.util.Scanner;

public class simpleint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal , time and rate");
        int p  = sc.nextInt();
        int t  = sc.nextInt();
        int r  = sc.nextInt();
        float simple_interset = p*r*t/100;
        System.out.println(simple_interset);
    }
}
