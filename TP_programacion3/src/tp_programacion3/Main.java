
package tp_programacion3;


public class Main {

    public static void main(String[] args) {

        System.out.println("==== 1) Registro de Estudiantes ====");
        Estudiante e = new Estudiante();
        e.nombre = "Ana";
        e.apellido = "García";
        e.curso = "Programación II";
        e.calificacion = 6.5;
        e.mostrarInfo();
        e.subirCalificacion(2.0);
        e.mostrarInfo();
        e.bajarCalificacion(3.0);
        e.mostrarInfo();

        System.out.println("\n==== 2) Registro de Mascotas ====");
        Mascota m = new Mascota();
        m.nombre = "Firulais";
        m.especie = "Perro";
        m.edad = 3;
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();

        System.out.println("\n==== 3) Encapsulamiento con Libro ====");
        Libro libro = new Libro("Patrones de Diseño", "GoF", 1994);
        libro.mostrarInfo();
        libro.setAnioPublicacion(3000); // inválido
        libro.setAnioPublicacion(2000); // válido
        libro.mostrarInfo();

        System.out.println("\n==== 4) Gestión de Gallinas ====");
        Gallina g1 = new Gallina();
        g1.idGallina = "G-001";
        g1.edad = 1;
        g1.huevosPuestos = 0;
        Gallina g2 = new Gallina();
        g2.idGallina = "G-002";
        g2.edad = 2;
        g2.huevosPuestos = 5;

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();

        System.out.println("\n==== 5) Simulación de Nave Espacial ====");
        NaveEspacial nave = new NaveEspacial("Andrómeda", 50, 100);
        nave.mostrarEstado();
        nave.avanzar(10);      // no en vuelo → no avanza
        nave.despegar();       // consume 10
        nave.avanzar(45);      // puede fallar por combustible
        nave.recargarCombustible(30);
        nave.avanzar(20);
        nave.mostrarEstado();
    }
}
