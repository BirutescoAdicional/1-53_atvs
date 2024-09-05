import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char escolha = 's';
        do {
            System.out.print("Digite o dia (em números inteiros): ");
            int dia = sc.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("Hoje é Domingo!");
                    break;
                case 2:
                    System.out.println("Hoje é Segunda-feira!");
                    break;
                case 3:
                    System.out.println("Hoje é Terça-feira!");
                    break;
                case 4:
                    System.out.println("Hoje é Quarta-feira!");
                    break;
                case 5:
                    System.out.println("Hoje é Quinta-feira!");
                    break;
                case 6:
                    System.out.println("Hoje é Sexta-feira!");
                    break;
                case 7:
                    System.out.println("Hoje é Sábado!");
                    break;
                default:
                    System.out.println("Hoje é %&¨%$*((&¨&##@");
                    break;
                }
            System.out.print("Deseja continuar? [S/N]:");
            escolha = sc.next().charAt(0);
            if(escolha=='n' || escolha=='N'){
                break;
            }
        }while(escolha=='s');
        System.out.println("Fim do programa");
    }
}
