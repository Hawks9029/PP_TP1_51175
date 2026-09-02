import java.util.ArrayList;
import java.util.List;

public class AppAlternativo {
        public static void main(String[] args) {

            List<Estudiante> estudiantes = new ArrayList<>();

            estudiantes.add(new Estudiante("52342", "Luis Gómes"));
            estudiantes.add(new Estudiante("50243", "Victor Fuentes"));
            estudiantes.add(new Estudiante("51878", "María Diaz"));

            EventoUniversitario evento = new EventoUniversitario("001", "Encuentro de POO",2000,true);

            Sala sala = new Sala(1, "Aula Magna");

            evento.asignarSala(sala);

            evento.crearActividad(1, "Taller de POO",50,"taller" );
            evento.crearActividad(2, "Charla de PL",30,"charla" );

            evento.getActividades().get(0).inscribir(estudiantes.get(0));
            evento.getActividades().get(0).inscribir(estudiantes.get(1));

            evento.getActividades().get(1).inscribir(estudiantes.get(1));
            evento.getActividades().get(1).inscribir(estudiantes.get(2));

            evento.mostrarDatos();

        }
}
