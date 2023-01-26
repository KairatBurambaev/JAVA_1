import java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        String math_symbol = inp.next();
        int y = inp.nextInt();
        switch (math_symbol) {
            case ("-"):
                System.out.println(x-y);
                break;
            case ("+"):
                System.out.println(x+y);
                break;
        }
    }
}
