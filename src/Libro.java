public class Libro {
   private String titulo;
   private String autor;
   private int numeroEjemplares;
   private int numeroEjemplaresPrestados;
   
   public Libro (){

   }

   public Libro(String titulo,String autor, int numeroEjemplares,int numeroEjemplaresPrestados){
      this.titulo = titulo;
      this.autor = autor;
      this.numeroEjemplares = numeroEjemplares;
      this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
   }

   public prestamo(int numeroEjemplares, int numeroEjemplaresPrestados){
      boolean disponible;
      if (numeroEjemplares>numeroEjemplaresPrestados){
         numeroEjemplaresPrestados = numeroEjemplaresPrestados + 1;
         disponible = true;
      }else{
         disponible = false;
      }
   }return disponible;
   
   public devolucion(int numeroEjemplaresPrestados){
      boolean devolucionLibro;
      if (numeroEjemplaresPrestados>0){
         numeroEjemplaresPrestados = numeroEjemplaresPrestados - 1;
         devolucionLibro = true;
      }else{
         devolucionLibro = false;
      }
   }return devolucionLibro;

   public void imprimir (){
      System.out.println("El titulo del libro es: " + titulo);
      System.out.println("El autor del libro es: " + autor);
      System.out.println("La cantidad total de unidades del libro es: " + numeroEjemplares);
      System.out.println("La cantidad total de unidades prestadas del libro es: " + numeroEjemplaresPrestados);

    }

    
}
