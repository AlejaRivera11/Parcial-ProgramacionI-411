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

        System.out.println("Digite el libro");
        //Imprimer la informacion ingresada para el objeto 2
        libro2.imprimir();
        

        



        sc.close();


        //Provando metodos devolucion y prestamo



    }

}
