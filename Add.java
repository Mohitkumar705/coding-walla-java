import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = in.nextInt();
        System.out.println("Enter the Seciund Number");
        int b = in.nextInt();
        int c = a+b;
        System.out.println("Add of two number is Result => "  + c);
        in.close();
    }
}
