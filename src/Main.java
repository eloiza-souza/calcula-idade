
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = null;
        boolean isValidDate = false;
        System.out.println("* * * CALCULADORA DE IDADE * * *");

        //Prompts the user to enter the name
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        while (!isValidDate) {
            System.out.print("Digite a data de nascimento (formato dd/MM/yyyy): ");
            String input = scanner.nextLine();
            // Try to convert the input to LocalDate
            try{
                birthDate = LocalDate.parse(input, formatter);

                // Checks if the date is before the current date
                if (birthDate.isBefore(LocalDate.now()))
                    isValidDate = true;
                else
                    System.out.println("A data de nascimento deve ser anterior à data atual.");
            }
            catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, use o formato dd/MM/yyyy.");
            }
        }
        System.out.printf("\n%s tem %d anos.\n", name, Period.between(birthDate, LocalDate.now()).getYears());

        scanner.close();
    }
}