import java.io.*;

public class proy {
    public static class pelicula {
        String Titulopelicula, Detallepelicula, Generopelicula;
        String Nombre, Apellido;
    }

    public static class musica {
        String Titulomusica, Detallemusica, Generomusica;
        String Nombre, Apellido;
    }

    public static class pdf {
        String Titulopdf, Detallepdf, Generopdf;
        String Nombre, Apellido;
    }

    public static class foto {
        String Titulofoto, Detallefoto, Generofoto;
        String Nombre, Apellido;
    }

    public static class programa {
        String Tituloprograma, Detalleprograma, Generoprograma;
        String Nombre, Apellido;
    }

    public static void main(String[] args) throws IOException {
        pelicula[] pel = new pelicula[200];
        musica[] mus = new musica[200];
        pdf[] pd = new pdf[200];
        foto[] fot = new foto[200];
        programa[] pro = new programa[200];

        int narchivosaingresar = 0, opcion, tipo;

        do {
            System.out.println("LIBRERIA DE ARCHIVOS");
            System.out.println("************************************************************");
            System.out.println("Lista de actos a ejecutar :");
            System.out.println("1. Registrar Datos o Informacion");
            System.out.println("2. Borrar Datos o Informacion");
            System.out.println("3. Corregir Datos o Informacion");
            System.out.println("4. Listado General de acuerdo al numero");
            System.out.println("5. Listado Ordenado por Titulo");
            System.out.println("6. Buscar por Titulo");
            System.out.println("7. Buscar por el Numero");
            System.out.println("8. Salir");

            opcion = leerint("Seleccione su Opcion");

            switch (opcion) {
                case 1:
                    do {
                        narchivosaingresar = leerint("Numero Total de Archivos a Ingresar");
                    } while (narchivosaingresar < 0 || narchivosaingresar > 200);

                    for (int i = 0; i < narchivosaingresar; i++) {
                        System.out.println("Contenido del Archivo a Ingresar Nº" + (i + 1));
                        System.out.println("1. Peliculas");
                        System.out.println("2. Musica");
                        System.out.println("3. Pdf");
                        System.out.println("4. Fotografias");
                        System.out.println("5. Programacion");

                        tipo = leerint("Seleccione el Contenido del Archivo");

                        switch (tipo) {
                            case 1:
                                pel[i] = leerPelicula();
                                break;
                            case 2:
                                mus[i] = leerMusica();
                                break;
                            case 3:
                                pd[i] = leerPdf();
                                break;
                            case 4:
                                fot[i] = leerFoto();
                                break;
                            case 5:
                                pro[i] = leerPrograma();
                                break;
                        }
                    }
                    break;

                case 8:
                    System.out.println("Gracias por su preferencia");
                    break;
            }
        } while (opcion != 8);
    }

    public static int leerint(String mensaje) throws IOException {
        BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(mensaje);
        return Integer.parseInt(w.readLine());
    }

    public static pelicula leerPelicula() throws IOException {
        pelicula aux = new pelicula();
        BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el titulo de la pelicula: ");
        aux.Titulopelicula = w.readLine();
        System.out.println("Ingrese detalles de la pelicula: ");
        aux.Detallepelicula = w.readLine();
        System.out.println("Ingrese el genero de la pelicula: ");
        aux.Generopelicula = w.readLine();
        return aux;
    }

    public static musica leerMusica() throws IOException {
        musica aux = new musica();
        BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el titulo de la cancion: ");
        aux.Titulomusica = w.readLine();
        System.out.println("Ingrese detalles de la cancion: ");
        aux.Detallemusica = w.readLine();
        System.out.println("Ingrese el genero de la cancion: ");
        aux.Generomusica = w.readLine();
        return aux;
    }

    public static pdf leerPdf() throws IOException {
        pdf aux = new pdf();
        BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el titulo del PDF: ");
        aux.Titulopdf = w.readLine();
        System.out.println("Ingrese detalles del PDF: ");
        aux.Detallepdf = w.readLine();
        System.out.println("Ingrese el tipo de PDF (Libro, Revista, etc.): ");
        aux.Generopdf = w.readLine();
        return aux;
    }

    public static foto leerFoto() throws IOException {
        foto aux = new foto();
        BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el titulo de la foto: ");
        aux.Titulofoto = w.readLine();
        System.out.println("Ingrese detalles de la foto: ");
        aux.Detallefoto = w.readLine();
        System.out.println("Ingrese el estilo de la foto (Retrato, Paisaje, etc.): ");
        aux.Generofoto = w.readLine();
        return aux;
    }

    public static programa leerPrograma() throws IOException {
        programa aux = new programa();
        BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el titulo del programa: ");
        aux.Tituloprograma = w.readLine();
        System.out.println("Ingrese detalles del programa: ");
        aux.Detalleprograma = w.readLine();
        System.out.println("Ingrese el tipo de programa (Tutorial, Instalador, etc.): ");
        aux.Generoprograma = w.readLine();
        return aux;
    }
}
