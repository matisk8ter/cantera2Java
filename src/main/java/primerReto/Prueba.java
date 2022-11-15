package primerReto;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

      /*
    *   next() → Lee un String hasta encontrar un delimitador, generalmente un espacio.
        nextBoolean() → Lee valores booleanos.
        nextByte() → Lee valores byte que ingresan por teclado.
        nextDouble() → Lee valores decimales (double) introducidos por el usuario.
        nextFloat() → Recibe los valores float, que ingresan.
        nextShort() → Lee un dato de tipo short.
        nextInt() → Para leer datos del tipo entero.
        nextLong() → Para leer un dato del tipo long.
        nextLine() → Lee un String hasta encontrar un salto de línea.
        close() → Cierra la clase Scanner luego de utilizada
    *
    **/


    public static void registrar(String nombre, String documento, ArrayList<String> arrNom, ArrayList<String> arrDoc) {
        arrNom.add(nombre);
        arrDoc.add(documento);
    }

    public static void buscar(String documento, ArrayList<String> arrNom, ArrayList<String> arrDoc) {
        int posicion = arrDoc.indexOf(documento);

        String doc = arrDoc.get(posicion);
        String nom = arrNom.get(posicion);

        System.out.println("Nombre: " + nom + "\nDocumeto: " + doc);
    }

    public static void eliminar(String documento , ArrayList<String> arrNom, ArrayList<String> arrDoc){
        int posicion = arrDoc.indexOf(documento);

         arrDoc.remove(posicion);
         arrNom.remove(posicion);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        ArrayList<String> arrNombres = new ArrayList<>();
        ArrayList<String> arrDocumentos = new ArrayList<>();


        String nombre, documento;
        int edad, opcion;

        System.out.println("" +
                "1- Registrar\n" +
                "2- Buscar \n" +
                "8- Salir");

        do {
            System.out.println("ingrese una opcion");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registro de usuario");

                    if (arrDocumentos.size() < 2) {
                        System.out.println("ingrese un nombre");
                        nombre = entrada.next();

                        System.out.println("ingrese un documento");
                        documento = entrada.next();

                        registrar(nombre, documento, arrNombres, arrDocumentos);
                    }else {
                        System.out.println("no hay mas lugares");
                    }

                    break;

                case 2:
                    System.out.println("buscar usuario por documento");
                    documento = entrada.next();
                    buscar(documento, arrNombres, arrDocumentos);

                    break;

                case 3:
                    System.out.println("Remover usuario por documento");
                    documento = entrada2.next();

                    eliminar(documento, arrNombres, arrDocumentos);

                    System.out.println("se borro!");
                    break;

                default:
                    System.out.println("opcion incorrecta");

            }

        } while (opcion != 8);


    }
}
