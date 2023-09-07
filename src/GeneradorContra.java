/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jaime
 */
public class GeneradorContra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamano de la contraseña: ");
        int longitud = scanner.nextInt();
        scanner.nextLine(); 
        
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+[]{}|;:,.<>?"; // Conjunto de caracteres permitidos

        String contrasenaGenerada = generarContrasena(longitud, caracteres);
        System.out.println("Contraseña generada: " + contrasenaGenerada);
    }

    public static String generarContrasena(int longitud, String caracteres) {
        Random random = new Random();
        String contrasena = "";

        for (int i = 0; i < longitud; i++) {
            int indiceCaracter = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indiceCaracter);
            contrasena += caracterAleatorio;
        }

        return contrasena;
    }

    
}
