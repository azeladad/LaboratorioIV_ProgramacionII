class Material {
    private String titulo;
    private String autor;

    public Material(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo + " | Autor: " + autor);
    }

}

class Libro extends Material{
    private int numeroPaginas;
    
    public Libro(String titulo, String autor, int numeroPaginas){
            super(titulo, autor);
            this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tipo: Libro | Numero de paginas: " + numeroPaginas);
    }
}

class Revista extends Material{
    private int numeroEdicion;

    public Revista(String titulo, String autor, int numeroEdicion){
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion(){
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion){
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tipo: Revista | Numero de edicion: " + numeroEdicion);

    }

}

public class Ejercicio04 {
    public static void main(String[] args) {
        Material [] materiales = new Material[3];
        materiales[0] = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 471);
        materiales[1] = new Revista("National Geographic", "Varios Autores", 250);
        materiales[2] = new Libro("El Principito", "Antonie de Saint-Exupery", 96);

        System.out.println("--- Sistema de Biblioteca ---\n");

        for (Material m : materiales){
            m.mostrarInformacion();
            System.out.println("-----------------------------");
        }
    }

}