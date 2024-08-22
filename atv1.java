import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 5:");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Número 1 digitado.");
                break;
            case 2:
                System.out.println("Número 2 digitado.");
                break;
            case 3:
                System.out.println("Número 3 digitado.");
                break;
            case 4:
                System.out.println("Número 4 digitado.");
                break;
            case 5:
                System.out.println("Número 5 digitado.");
                break;
            default:
                System.out.println("Digitou fora do mandado.");
        }
    }
}
