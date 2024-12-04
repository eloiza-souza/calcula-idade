import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("* * * CALCULADORA DE IDADE * * *");
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("Nascimento\nDia: ");
        int birthDay = scanner.nextInt();

        System.out.print("Mês: ");
        int birthMonth = scanner.nextInt();
        System.out.print("Ano: ");
        int birthYear = scanner.nextInt();
        System.out.printf("%s tem %02d/%02d/%04d anos. %n", name, birthDay, birthMonth, birthYear);

        scanner.close();
    }
}