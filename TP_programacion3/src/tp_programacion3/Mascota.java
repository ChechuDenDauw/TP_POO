
package tp_programacion3;


public class Mascota {

    String nombre;
    String especie;
    int edad;

    public void mostrarInfo() {
        System.out.println("[Mascota] " + nombre + " | Especie: " + especie + " | Edad: " + edad);
    }

    public void cumplirAnios() {
        edad++;
    }
}
