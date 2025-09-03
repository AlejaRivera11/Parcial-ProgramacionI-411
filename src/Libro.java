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

<<<<<<< HEAD
   public String getTitulo() {
   return titulo;
   }

   public void setTitulo(String titulo){
   this.titulo= titulo;
   }

   public String getAutor(){
   return autor;
   }

   public void setAutor(String autor){
   this.autor= autor;
   }

   public int getnumeroEjemplares(){
   return numeroEjemplares;
   }

   public void setnumeroEjemplares(int numeroEjemplares){
   this.numeroEjemplares= numeroEjemplares;
   }

   public int getnumeroEjemplaresPrestados(){
   return numeroEjemplaresPrestados;
   }

   public void setnumeroEjemplaresPrestados(int numeroEjemplaresPrestados){
   this.numeroEjemplaresPrestados= numeroEjemplaresPrestados;
   }



   
=======
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

    
>>>>>>> cb3675c5a7f0fe693aba8bf8795c49ef1b4ba4bc
}
