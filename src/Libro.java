public class Libro {
   private String titulo;
   private String autor;
   private int numeroEjemplares;
   private int numeroEjemplaresPrestados;
   
   public Libro (){

   }

   public llenarLibro(String titulo,String autor, int numeroEjemplares,int numeroEjemplaresPrestados){
      this.titulo = titulo;
      this.autor = autor;
      this.numeroEjemplares = numeroEjemplares;
      this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
   }

   
}
