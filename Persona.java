import java.util.ArrayList;

/**
 * Clase que modela a un veterinario de la clínica.
 * Contiene sus datos personales y la lista de mascotas que tiene a cargo.
 *
 * @author Benjamín Jarquín Badilla
 * @version 1.01
 */
public class Persona {

    /** Nombre completo del veterinario. */
    private String nombre;

    /** Código de su licencia profesional. */
    private String codigoLicencia;

    /** Lista de mascotas asignadas a este veterinario. */
    private ArrayList<Mascota> misMascotas;

    /**
     * Constructor que crea un nuevo veterinario.
     *
     * @param nombre            Nombre del veterinario
     * @param codigoLicencia    Código de licencia profesional
     */
    public Persona(String nombre, String codigoLicencia) {
        this.nombre = nombre;
        this.codigoLicencia = codigoLicencia;
        this.misMascotas = new ArrayList<Mascota>();
    }

    /**
     * Asigna una mascota al veterinario.
     *
     * @param mascota Mascota que se va a asignar
     */
    public void asignarMascota(Mascota mascota) {
        this.misMascotas.add(mascota);
    }

    /**
     * Devuelve una cadena con los nombres de todas las mascotas asignadas.
     *
     * @return Nombres de las mascotas separados por espacio
     */
    public String consultarNombreMisMascotas() {
        String nombres = "";
        for (Mascota mascota : this.misMascotas) {
            nombres += mascota.getNombre() + " ";
        }
        return nombres;
    }

    /**
     * Retorna el nombre del veterinario.
     *
     * @return Nombre del veterinario
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Genera una representación en texto del estado del veterinario.
     *
     * @return Información completa del veterinario y sus mascotas
     */
    public String toString() {
        String msg = "Persona\n";
        msg += "Nombre: " + this.nombre + "\n";
        msg += "Código de licencia: " + this.codigoLicencia + "\n";
        msg += "Mascotas: " + this.consultarNombreMisMascotas();
        return msg;
    }
}