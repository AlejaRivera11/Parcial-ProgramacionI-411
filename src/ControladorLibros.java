import java.util.Scanner;

public class ControladorLibros {

    public static void main(String[] args) {
        //Primer objeto creado
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia",35,15);
        
        //Segundo Objeto  creado
        Libro libro2 = new Libro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Titulo del libro");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese el Autor");
        libro2.setAutor(sc.nextLine());

        System.out.println("Ingrese el numero de ejemplares");
        libro2.setnumeroEjemplares(sc.nextInt());

        boolean validar;
        do {

        System.out.println("Ingrese el numero de ejemplares prestados");
        libro2.setnumeroEjemplaresPrestados(sc.nextInt());
         if (libro2.getnumeroEjemplares() < libro2.getnumeroEjemplaresPrestados()){
            System.out.println("El numero de ejemplares prestados supera la cantidad de libros disponibles");
            validar = false;
        }else {
           validar = true; 
        }             
         
        } while (validar == false);

        System.out.println("Digite la opcion de libro que desea realizar alguna accion (Prestar/Devolver)");
        System.out.println("Opcion 1. "+ libro1.getTitulo());
        System.out.println("Opcion 2. "+ libro2.getTitulo());

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿Desea prestar o devolver el libro?");
                System.out.println("1. Prestar   2. Devolver");
                int opcion2 = sc.nextInt();
                switch (opcion2){
                    case 1:
                        libro1.prestamo();
                        System.out.println("Prestamo realizado");
                        libro1.imprimir();

                        break;
                    case 2:
                        libro1.devolucion();
                        System.out.println("Devolucion realizada");
                        libro1.imprimir();

                        break;
                    default:
                        System.out.println("Opcion no valida. Intente de nuevo");
                        break;

                }
                break;
            case 2:
                System.out.println("¿Desea prestar o devolver el libro?");
                System.out.println("1. Prestar   2. Devolver");
                int opcion3 = sc.nextInt();
                switch (opcion3){
                    case 1:
                        libro2.prestamo();
                        System.out.println("Prestamo realizado");
                        libro2.imprimir();
                        break;
                    case 2:
                        libro2.devolucion();
                        System.out.println("Devolucion realizada");
                        libro2.imprimir();
                        break;
                    default:
                        System.out.println("Opcion no valida. Intente de nuevo");
                        break;

                }
                break;
            
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
        }
        //Imprimer la informacion ingresada para el objeto 2
        //libro2.imprimir();
        

        



        sc.close();


        //Provando metodos devolucion y prestamo



    }

}
