package clase1;

import java.util.Scanner;

public class Animal {
    //Atributos
    private String nombre;
    private int edad;
    private String tipo;

    Scanner lectura=new Scanner(System.in);

    //metodo constructor

    public Animal(){

    }
  
    public Animal(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
       
    }
    

    //metodos accesores 
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int setEdad(int edad){
        return this.edad=edad;
    }
        
    //Metodos
    public void registrarAnimal(){
        //cuerpo metodo
        System.out.println("Ingrese el nombre del animal");
        nombre=lectura.nextLine();

        System.out.println("Ingrese la edad del animal");
        edad=lectura.nextInt();
    }
    public void  mostrarAnimal(){
        System.out.println("El nombre del animal ingresado es "+nombre+" y tiene "+edad+" años");
    }
    
    
}
