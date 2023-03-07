package salud;

import java.util.Scanner;

public class Persona {
    public String tipoDoc, nombre, apellido, sexo;
    public int documento, peso, edad;
    double estatura;
   

    Scanner lectura=new Scanner(System.in);



    public void pedirDatos(){
        System.out.println("Ingrese su tipo de documento");
        tipoDoc=lectura.nextLine();
        System.out.println("Ingrese su documento");
        documento=lectura.nextInt();
        System.out.println("Ingrese su nombre");
        nombre=lectura.nextLine();
        System.out.println("Ingrese su apellido");
        apellido=lectura.nextLine();
        System.out.println("Ingrese su sexo");
        sexo=lectura.nextLine();
        System.out.println("Ingrese su peso");
        peso=lectura.nextInt();
        System.out.println("Ingrese su edad");
        edad=lectura.nextInt();
        System.out.println("Ingrese su estatura");
        estatura=lectura.nextDouble();
    }

    public void mostrarPersona(){

    }
    public void calcularlmc(){
        
    }



    
}
