package src.Model;
// Importaciones
import java.time.LocalDate;

public class Entrenador
{
    // Atributos : Campos de los datos del entrenador.
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String lugarNacimiento;
    private Medallas[] medallas;
    private Pokemon[] pokedex;

    // Constructor : Metodo para crear objetos de la clase Entrenador.
    public Entrenador(int id, String nombre, LocalDate fechaNacimiento, String lugarNacimiento, Medallas[] medallas, Pokemon[] pokedex)
    {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.medallas = medallas;
        this.pokedex = pokedex;
    }
}
