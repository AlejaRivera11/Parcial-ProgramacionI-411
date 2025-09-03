public class Libro {
   private String titulo;
   private String autor;
   private int numeroEjemplares;
   private int numeroEjemplaresPrestados;
   
   public Libro (){
      this.titulo = "";
      this.autor = "";
      this.numeroEjemplares = 0;
      this.numeroEjemplaresPrestados=0;
   }

   public Libro(String titulo,String autor, int numeroEjemplares,int numeroEjemplaresPrestados){
      this.titulo = titulo;
      this.autor = autor;
      this.numeroEjemplares = numeroEjemplares;
      this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
   }

   public String getTitulo(){
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

   
   public boolean prestamo(){
      if (numeroEjemplares>numeroEjemplaresPrestados){
         numeroEjemplaresPrestados ++;
         return true;
      }else{
         return false;
      }
   }

   public boolean devolucion(){
      if (numeroEjemplaresPrestados>0){
         numeroEjemplaresPrestados --;
         return true;
      }else{
         return false;
      }
   }

   public void imprimir (){
      System.out.println("El titulo del libro es: " + titulo);
      System.out.println("El autor del libro es: " + autor);
      System.out.println("La cantidad total de unidades del libro es: " + numeroEjemplares);
      System.out.println("La cantidad total de unidades prestadas del libro es: " + numeroEjemplaresPrestados);

    }

    
}
