
package tp_programacion3;


public class NaveEspacial {

    String nombre;
    int combustible;    // actual
    int capacidadMax;   // tope
    boolean enVuelo = false;

    public NaveEspacial(String nombre, int combustibleInicial, int capacidadMax) {
        this.nombre = nombre;
        this.capacidadMax = Math.max(0, capacidadMax);
        this.combustible = Math.min(Math.max(0, combustibleInicial), this.capacidadMax);
    }

    public boolean despegar() {
        if (enVuelo) {
            System.out.println("[Nave] Ya está en vuelo.");
            return false;
        }
        if (combustible >= 10) {
            combustible -= 10;
            enVuelo = true;
            System.out.println("[Nave] Despegó correctamente. Combustible restante: " + combustible);
            return true;
        } else {
            System.out.println("[Nave] Combustible insuficiente para despegar.");
            return false;
        }
    }

    public boolean avanzar(int distancia) {
        if (!enVuelo) {
            System.out.println("[Nave] No puede avanzar: la nave no está en vuelo.");
            return false;
        }
        if (distancia <= 0) {
            System.out.println("[Nave] Distancia inválida.");
            return false;
        }
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("[Nave] Avanzó " + distancia + " u. Combustible restante: " + combustible);
            return true;
        } else {
            System.out.println("[Nave] Combustible insuficiente para avanzar " + distancia + " u.");
            return false;
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("[Nave] Cantidad de recarga inválida.");
            return;
        }
        int antes = combustible;
        combustible = Math.min(capacidadMax, combustible + cantidad);
        int cargado = combustible - antes;
        if (cargado < cantidad) {
            System.out.println("[Nave] Se cargaron " + cargado + " u (tope " + capacidadMax + ").");
        } else {
            System.out.println("[Nave] Se cargaron " + cargado + " u.");
        }
    }

    public void mostrarEstado() {
        System.out.println("[Nave \"" + nombre + "\"] En vuelo: " + enVuelo
                + " | Combustible: " + combustible + "/" + capacidadMax);
    }
}
