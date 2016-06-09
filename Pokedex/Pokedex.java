package pokedex;

/**
 * Interfaz para manejar un Pokedex y mostrar los datos de algunos Pokémons.
 * @author Manuel Soto Romero
 * @version 1.00
 */
public class Pokedex {
    
    /**
     * Método a partir de un parámetro que devuelve el nombre de un pokemon a
     * partir del número que se le pasa como parámetro.
     * @param n -- Número del pokémon.
     * @return Nombre del pokémon.
     */
    public String obtenerPokemon(int n){
        switch(n) {
            case 1:
                return "Bulbasaur";
            case 2:
                return "Ivysaur";
            case 3:
                return "Venusaur";
            case 4:
                return "Charmander";
            case 5:
                return "Charmeleon";
            case 6:
                return "Carizard";
            default:
                return "Pokemon no encontrado";
        }
    }
    
    /**
     * Método para obtener información sobre si el pokémon puede evolucionar
     * @param p -- Nombre del pokémon.
     * @return información sobre este
     */
    public String obtenerEvolución(String n){
        if(n.equalsIgnoreCase("Bulbasaur")) {
            return "Ivysaur";
        }
        if(n.equalsIgnoreCase("Ivysaur")) {
            return "Venusaur";
        }
        if(n.equalsIgnoreCase("Venusaur")) {
            return "That creature has no further evolution.";
        }
        if(n.equalsIgnoreCase("Charmander")) {
            return "Charmelon";
        }
        if(n.equalsIgnoreCase("Charmeleon")) {
            return "Charizard";
        }
        if(n.equalsIgnoreCase("Charizar")) {
            return "That creature has no further evolution.";
        }
        return "That creature is not found in our database.";
    }
}
