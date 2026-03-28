import java.io.*;

class LeeFichero {
    public static void main(String[] args) {
        File archivo = new File("C:/Users/Dell/Desktop/CURSOS DE LA UNIVERSIDAD 7 SEMESTRE/PROGRAMACION I/Leerfichero.txt");

        try (FileReader reader = new FileReader(archivo);
             BufferedReader buffer = new BufferedReader(reader)) {

            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
