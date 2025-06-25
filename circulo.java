import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = leia.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("Área do círculo: " + area);

        leia.close();
    }
}
