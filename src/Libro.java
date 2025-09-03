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



   
}
