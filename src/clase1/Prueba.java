package clase1;

import java.util.Scanner;




public class Prueba {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
       Animal guacamayo=new Animal();
        Movie titanic=new Movie();
        String name;
        Animal panda=new Animal();

       

        Movie up=new Movie ();
        up.mostrarPelicula("Up");
        up.mostrarPelicula("up", "Infantil", 60);

        Movie lanochedeldemonio=new Movie();
        lanochedeldemonio.mostrarPelicula("La noche del demonio");
        lanochedeldemonio.mostrarPelicula(60, "La noche del demonio");

        guacamayo.registrarAnimal();//invocar o llamr un metodfo
       guacamayo.mostrarAnimal();
       panda.mostrarAnimal();
       
    }
}