import java.io.File;
import java.util.Scanner;

public class InfoFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la ruta del fichero: ");
        String ruta = sc.nextLine();

        File f = new File(ruta);

        if (!f.exists()) {
            System.out.println("El fichero no existe.");
        } else {
            if (f.isDirectory()) {
                System.out.println("Es un directorio.");
            } else {
                System.out.println("Es un fichero.");
                System.out.println("Nombre: " + f.getName());
                System.out.println("Tamaño: " + f.length() + " bytes");
                System.out.println("Permiso de lectura: " + f.canRead());
                System.out.println("Permiso de escritura: " + f.canWrite());
            }
        }
    }
}
