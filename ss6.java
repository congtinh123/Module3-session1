import java.util.Scanner;

public class ss6 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("enter to point math: ");
float a = scanner.nextFloat();
System.out.println("enter to point Van: ");
float b = scanner.nextFloat();
System.out.println("enter to point english: ");
float c = scanner.nextFloat();
float average = (a + b + c) / 3;
float sum = (a + b + c);
System.out.println("Tong diem: " + sum);
System.out.println("Tong diem: " + average);
    }
}
