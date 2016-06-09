package pokedex;

/**
 * Programa para probar lo métodos de las clases <code>Pokémon</code> y
 * <code>Pokedex</code>.
 * @author Manuel Soto Romero
 */
public class Main {

    /**
     * Clase principal.
     * @param args -- Comandos de la línea de argumentos.
     */
    public static void main(String[] args) {
        
        /**
         * Crear un pokedex
         */
        Pokedex pokedex = new Pokedex();
        
        /**
         * Crear tres pokémons
         */
        Pokemon uno = new Pokemon("Bulbasaur");
        Pokemon dos = new Pokemon("Charizar");
        Pokemon tres = new Pokemon("Agumon");
        
        /**
         * Probar los métodos del pokedex con el pokémon uno
         */
        System.out.println("Pokémon uno: ");
        System.out.println("Nombre: " + 
                pokedex.obtenerPokemon(uno.getNumber()));
        System.out.println("Evolución: " + 
                pokedex.obtenerEvolución(uno.getName()));
        
        /**
         * Probar los métodos del pokedex con el pokémon dos
         */
        System.out.println("\nPokémon dos: ");
        System.out.println("Nombre: " +
                 pokedex.obtenerPokemon(dos.getNumber()));
        System.out.println("Evolución: " +
                pokedex.obtenerEvolución(dos.getName()));
        
        /**
         * Probar los métodos del pokedex con el pokémon tres
         */
        System.out.println("\nPokémon tres: ");
        System.out.println("Nombre: " +
                pokedex.obtenerPokemon(tres.getNumber()));
        System.out.println("Evolución: " +
                pokedex.obtenerEvolución(tres.getName()));
    }
}