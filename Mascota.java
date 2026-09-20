import java.time.LocalDate;

/**
 * Clase que representa a una mascota que es atendida en la clínica canina.
 * Guarda sus datos básicos, el año de nacimiento y el veterinario asignado.
 *
 * @author [Benjamín Jarquín Badilla]
 * @version 1.01
 */
public class Mascota {

    /** Nombre de la mascota. */
    private String nombre;

    /** Raza a la que pertenece la mascota. */
    private String raza;

    /** Año en el que nació la mascota (0 si no se registró). */
    private int anioNacimiento = 0;

    /** Veterinario responsable de la mascota. */
    private Persona veterinario;

    /**
     * Constructor para crear una mascota sin registrar el año de nacimiento.
     *
     * @param nombre Nombre de la mascota
     * @param raza   Raza de la mascota
     */
    public Mascota(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    /**
     * Constructor completo que incluye el año de nacimiento.
     *
     * @param nombre          Nombre de la mascota
     * @param raza            Raza de la mascota
     * @param anioNacimiento  Año de nacimiento
     */
    public Mascota(String nombre, String raza, int anioNacimiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
    }

    /**
     * Devuelve el nombre del veterinario asignado (cadena vacía si no hay ninguno).
     *
     * @return Nombre del veterinario o cadena vacía
     */
    public String consultarNombreVeterinario() {
        String nombreVeterinario = "";
        if (this.veterinario != null) {
            nombreVeterinario = this.veterinario.getNombre();
        }
        return nombreVeterinario;
    }

    /**
     * Asigna un veterinario a esta mascota.
     *
     * @param vet Veterinario que se va a asignar
     */
    public void asignarVeterinario(Persona vet) {
        this.veterinario = vet;
    }

    /**
     * Calcula la edad actual de la mascota en años caninos.
     *
     * @return Edad canina (0 si no se conoce el año de nacimiento)
     */
    private int calcularEdadCanina() {
        int edadCanina = 0;
        if (this.anioNacimiento != 0) {
            edadCanina = this.calcularAnioActual() - this.anioNacimiento;
        }
        return edadCanina;
    }

    /**
     * Convierte la edad canina a su equivalente aproximado en años humanos.
     *
     * @return Edad humana equivalente
     */
    private int calcularEdadHumana() {
        return this.calcularEdadCanina() * 7;
    }

    /**
     * Obtiene el año actual del sistema.
     *
     * @return Año actual
     */
    private int calcularAnioActual() {
        return LocalDate.now().getYear();
    }

    /**
     * Retorna el nombre de la mascota.
     *
     * @return Nombre de la mascota
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Genera una descripción completa del estado de la mascota.
     *
     * @return Información de la mascota (nombre, raza, edades y veterinario)
     */
    public String toString() {
        String msg = "Mascota\n";
        msg += "Nombre: " + this.nombre + "\n";
        msg += "Raza: " + this.raza + "\n";
        msg += "Año de nacimiento: " + this.anioNacimiento + "\n";
        msg += "Edad canina: " + this.calcularEdadCanina() + "\n";
        msg += "Edad humana: " + this.calcularEdadHumana() + "\n";
        msg += "Veterinario: " + this.consultarNombreVeterinario();
        return msg;
    }
}