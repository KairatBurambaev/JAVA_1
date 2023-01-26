import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите N: ");
        int N = num.nextInt();
        num.close();
        int triangular_N = 0;
        int prod_N = 1;
        for (int i = 1; i <= N; i++) {
            triangular_N = triangular_N + i;
            prod_N = prod_N * i;
        }
        System.out.printf("Треугольное %d: %d \n", N, triangular_N);
        System.out.printf("Произведение числа %d: %d \n", N, prod_N);
    } 
}
