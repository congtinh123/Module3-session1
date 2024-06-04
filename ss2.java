import java.util.Scanner;

public class ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So tien ban muon doi");
        int money = scanner.nextInt();
        int vnd = money * 23000;
        System.out.println("so tien cua ban la " + vnd);
    }
    
}
