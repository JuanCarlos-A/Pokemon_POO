package Model;
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
}
