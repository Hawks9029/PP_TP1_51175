import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract  class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;


    private List<Inscripcion>  inscripciones ;


    public static final int CUPO_MINIMO ;


    static {
        /* Variable de clase: se fija un cupo mínimo de 5 personas para cualquier actividad. */
        CUPO_MINIMO = 2;
        System.out.println("Inicializador estático: se cargó la clase Actividad.");
    }


    public Actividad(int id, String titulo, int cupo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = (cupo > CUPO_MINIMO) ? cupo : CUPO_MINIMO;
        this.inscripciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            return;
        }
        this.titulo = titulo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupo) {
        this.cupoMaximo = (cupo > CUPO_MINIMO) ? cupo : CUPO_MINIMO;
    }

    public Inscripcion inscribir(Estudiante estudiante) {
        Inscripcion inscripcion = new Inscripcion(this, estudiante, LocalDate.now(), "REGISTRADA");
        inscripciones.add( inscripcion);
        return inscripcion;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void mostrarInscripciones() {
        if (inscripciones.isEmpty()) {
            System.out.println("  Sin inscripciones registradas.");
            return;
        }
        System.out.println("   Inscripciones registradas:");
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println("   " + inscripcion.getFecha()
                                            +" - "+  inscripcion.getEstado()
                                            + " - " + inscripcion.getEstudiante().getNombre()
                                            + " (Legajo: " + inscripcion.getEstudiante().getLegajo() + ")");
        }
    }


    public final void mostrarIdentificacion() {
        /* Aquí se evidencia el polimorfismo: cada subclase implementa su propia versión de getTipo() . Si este método no estuviese
        *  definido en la superclase, no se podría utilizar aquí. */
        System.out.println("- " + getTipo() + ": " + titulo + " (id=" + id + ")" + " - Cupo máximo: " + cupoMaximo);
    }


    public abstract double calcularCostoMateriales();


    public abstract String getTipo();
}
