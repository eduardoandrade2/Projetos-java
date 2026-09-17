import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura =sc.nextDouble();
        int farenheit = (int)(temperatura * 1.8) + 32;
        System.out.println("A temperatura será de "+farenheit);
        sc.close();
    }
}