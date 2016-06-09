package japones;

/**
 *
 * @author manumsr
 */
public class Japones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        while(i <= 100){
            NumJap num = new NumJap(i);
            System.out.println(i + " en japones: " + num.convertir());
            i++;
        }
        
        NumJap num2 = new NumJap(101);
        System.out.println(num2.convertir());
    }
}
