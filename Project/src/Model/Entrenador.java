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

    // Metodos Getter and Setter : Para devolver o sobreescribir informacion.

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento()
    {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento)
    {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Medallas[] getMedallas()
    {
        return medallas;
    }

    public void setMedallas(Medallas[] medallas)
    {
        this.medallas = medallas;
    }

    public Pokemon[] getPokedex()
    {
        return pokedex;
    }

    public void setPokedex(Pokemon[] pokedex)
    {
        this.pokedex = pokedex;
    }

    public int getId()
    {
        return id;
    }

}
