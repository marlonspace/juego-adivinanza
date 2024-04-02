import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int num,aleatorio,contador = 0;
        aleatorio = (int)(Math.random()*100);
        System.out.println(aleatorio);

        do {
            System.out.println("digite un numero ");
            num = entrada.nextInt();
            contador ++;

            if (num<=aleatorio){
                System.out.println("el numero  es mayor");
            }
            else {
                if (num>=aleatorio);
                System.out.println("el numero  es menor");
            }
        } while (num!=aleatorio);
        System.out.println("adivino el numero y tu numero de intentos son : "+contador);

    }
}