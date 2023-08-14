import java.util.Scanner;
public class contaNumPrimo {

    public static void main(String[] args) {

        Scanner sistema = new Scanner(System.in);

        System.out.println("Digite 5 números de maneira simultânea: ");
        int num1 = Integer.parseInt(sistema.nextLine());
        int num2 = Integer.parseInt(sistema.nextLine());
        int num3 = Integer.parseInt(sistema.nextLine());
        int num4 = Integer.parseInt(sistema.nextLine());
        int num5 = Integer.parseInt(sistema.nextLine());

        Thread primeira = new Thread(new Runnable() {
            @Override
            public void run() {
                calculaPrimo(num1);
            }

        });

        Thread segunda = new Thread(new Runnable() {
            @Override
            public void run() {
                calculaPrimo(num2);
            }

        });

        Thread terceira = new Thread(new Runnable() {
            @Override
            public void run() {
                calculaPrimo(num3);
            }

        });

        Thread quarta = new Thread(new Runnable() {
            @Override
            public void run() {
                calculaPrimo(num4);
            }

        });

        Thread quinta = new Thread(new Runnable() {
            @Override
            public void run() {
                calculaPrimo(num5);
            }

        });

        primeira.start();
        segunda.start();
        terceira.start();
        quarta.start();
        quinta.start();


    }
    public static void  calculaPrimo (int num){
        if (num == 2){
            System.out.println(num + " eh primo.");

        } else if (num != 2 && (num % 3 == 0 || num % 5 == 0 || num % 7 == 0)){
            System.out.println(num + " não eh primo.");

        } else if (num % num == 0 || num % 1 == 0){
            System.out.println(num + " eh primo.");

        } else {
            System.out.println(num + " não eh primo.");

        }

    }

}
