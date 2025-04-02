import java.time.LocalDateTime;
import java.util.Scanner; //leer la entrada del usuario desde la consola

public class SolicitarDatosRescatista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del animal rescatado:");

        System.out.print("Especie (perro, gato, etc.): ");
        String especie = scanner.nextLine();

        System.out.print("Raza: ");
        String raza = scanner.nextLine();

        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        System.out.print("Lugar: ");
        String lugar = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        LocalDateTime fechaHoraRescate = LocalDateTime.now();

        Animal animalRescatado = new Animal(especie, raza, sexo, estado, lugar, fechaHoraRescate, edad);

        System.out.println("\nInformación del animal rescatado:");
        System.out.println(animalRescatado);

        scanner.close();
    }
}