
package tp_programacion3;

import java.time.Year;

public final class Libro {

    private final String titulo;
    private final String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anio) {
        int anioActual = Year.now().getValue();
        if (anio >= 1450 && anio <= anioActual) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("[Libro] Año inválido: " + anio + ". Se mantiene: " + this.anioPublicacion);
        }
    }

    public void mostrarInfo() {
        System.out.println("[Libro] \"" + titulo + "\" de " + autor + " (" + anioPublicacion + ")");
    }
}
