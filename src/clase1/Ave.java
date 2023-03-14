package clase1;

public class Ave extends Animal {

private String envergadura;

//metodo constructor
public Ave(){

}
public Ave(String nombre, int edad, String envergadura){
super(nombre, edad, envergadura);
this.envergadura = envergadura;
}

//metodos accesore 

public String getEnvergadura() {
    return envergadura;
}

public void setEnvergadura(String envergadura) {
    this.envergadura = envergadura;
}


//metodos propios

public void mostrarAve(){
    System.out.println("El nombre del animal es "+getNombre()+" tiene "+getEdad()+" años y la envergadura del ave es " +envergadura);
}

}

    

