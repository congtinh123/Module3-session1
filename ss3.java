import java.util.Scanner;
public class ss3 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("nhap chieu dai: ");
int L = scanner.nextInt();
System.out.println("nhap chieu rong: ");
int W = scanner.nextInt();
int C = (L+W)*2;
int S = L*W;
System.out.println("ket qua " + S);
System.out.println("ket qua " + C);

    }
}
