import java.util.Comparator;

public class OrdenarPersonaPorId implements Comparator {
  
  public int compare(Object o1, Object o2) {
    Persona p1 = (Persona)o1;
    Persona p2 = (Persona)o2;
    return p1.getIdPersona() - p2.getIdPersona();
  }
}