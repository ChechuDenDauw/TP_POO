
package tp_programacion3;


public class Gallina {

    String idGallina;
    int edad;          
    int huevosPuestos; 

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("[Gallina " + idGallina + "] Edad: " + edad + " | Huevos: " + huevosPuestos);
    }
}
