
package tp_programacion3;

public class Estudiante {

    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public void mostrarInfo() {
        System.out.println("[Estudiante] " + nombre + " " + apellido
                + " | Curso: " + curso + " | Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > 10) {
            calificacion = 10;
        }
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0;
        }
    }
}
