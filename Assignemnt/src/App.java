import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
