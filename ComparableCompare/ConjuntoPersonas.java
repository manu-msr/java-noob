import java.util.*;

public class ConjuntoPersonas {
  public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Carlos", "Ana", "Dionisio", "Bernardo");
        System.out.println("lista original:" + nombres);

        Collections.sort(nombres);
        System.out.println("lista ordenada:" + nombres);

        Set<String> otrosNombres = new TreeSet<String>();
        otrosNombres.add("Mario");
        otrosNombres.add("Fernando");
        otrosNombres.add("Omar");
        otrosNombres.add("Juana");

        System.out.println("conjunto ordenado:" + otrosNombres);

        Set<Persona> personas = new TreeSet<Persona>();
        personas.add(new Persona(1, "Mario"));
        personas.add(new Persona(2, "Fernando"));
        personas.add(new Persona(3, "Omar"));
        personas.add(new Persona(4, "Juana"));

        System.out.println("conjunto ordenado de personas: " + personas);

        List<Persona> otrasPersonas = Arrays.asList(new Persona(4, "Juana"),
                new Persona(2, "Fernando"),
                new Persona(1, "Mario"),
                new Persona(3, "Omar"));
        Collections.sort(otrasPersonas, new OrdenarPersonaPorId());
        System.out.println("lista de personas ordenadas por ID:" + otrasPersonas);


        Set<Persona> conjuntoPersonas = new TreeSet<Persona>(new OrdenarPersonaPorId());
        conjuntoPersonas.add(new Persona(3, "Omar"));
        conjuntoPersonas.add(new Persona(4, "Juana"));
        conjuntoPersonas.add(new Persona(2, "Fernando"));
        conjuntoPersonas.add(new Persona(1, "Mario"));

        System.out.println("conjunto de personas ordenadas por ID:" + conjuntoPersonas);
    }
}