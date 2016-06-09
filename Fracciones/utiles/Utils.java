package utiles;
/**
 * Class that will hold any utilities needed throughout the course.
 * @author Carlos Morales
 */
public class Utils{

    /**
     * Gets the Greatest Common Divisor for a given pair of integers.
     * @param int a, the first number
     * @param int b, the second number
     * @return int the number we want
     */
    public static int GCD(int a, int b){
	if(b == 0){
	    return a;
	}else{
	    return Utils.GCD(b, a % b);
	}
    }

}