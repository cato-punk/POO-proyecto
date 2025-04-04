import java.util.Scanner;

public class Menu {
    private static Scanner leer = new Scanner(System.in);

    public static void main() {
        menu();

    }
    public static void menu(){
        int opcion;
        do {
            mostrarOpciones();
            opcion = leerOpcion();
            ejecutarOpcion(opcion);
        } while(opcion !=4);
    }
    private static void mostrarOpciones() {
        System.out.println("----------¿Quién desea ingresar?---------- ");
        System.out.println("1.- RESCATISTA");
        System.out.println("2.- VETERINARIO");
        System.out.println("3.- ADOPTADOR");
        System.out.println("4.- SALIR");
        System.out.println("Ingrese una opción: ");

    }
    private static int leerOpcion() {
        return Integer.parseInt(leer.nextLine());
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> rescatista();
            case 2 -> veterinario();
            case 3 -> adoptador();
            case 4 -> System.out.println("Adiós....");
            default -> System.out.println(" Opcion invalida...");}
        }
    }