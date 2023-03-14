package clase1;

public class Movie {
    private String name;
    private String category;
    int year;
    public int duration;

    //metodo constructor 
    public Movie(){

    }


    public Movie(String name) {
        this.name = name;
    }
    public string 

    public void mostrarPelicula(String name, String category, int duration) {
        System.out.println("El nombre de la pelicula es "+name+", la categoria de su pelicula es "+category+" y la duración es "+duration);
       }

       public void mostrarPelicula(String name) {
        System.out.println("la categoria de su pelicula es "+category);
       }

       public void mostrarPelicula(int duration, String category) {
        System.out.println("la categoria de su pelicula es "+category+" y la duracion es "+duration);
       }
     


    
}
