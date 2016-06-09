package pokedex;

/**
 * Interfaz para manejar pokemon.
 * @author Manuel Soto Romero
 * @version 1.00 Marzo, 2013
 */
public class Pokemon {
    
    /**
     * Variable privada para almacenar el tipo de pokémon.
     */
    private String type;
    
    /**
     * Variable privada para almacenar el nombre del pokémon.
     */
    private String name;
    
    /**
     * Variable privada para almacenar el número del pokémon.
     */
    private int number;
    
    /**
     * Constructor a partir de un parámetro
     * @param name -- Nombre del pokemon.
     */
    public Pokemon(String name) {
        this.name = name;
        if(name.equalsIgnoreCase("Bulbasaur")) {
            this.type = "Planta, veneno";
            this.number = 1;
        }
        if(name.equalsIgnoreCase("Ivysaur")) {
            this.type = "Planta, veneno";
            this.number = 2;
        }
        if(name.equalsIgnoreCase("Venusaur")) {
            this.type = "Planta, veneno";
            this.number = 3;
        }
        if(name.equalsIgnoreCase("Charmander")) {
            this.type = "Fuego";
            this.number = 4;
        }
        if(name.equalsIgnoreCase("Charmeleon")) {
            this.type = "Fuego";
            this.number = 5;
        }
        if(name.equalsIgnoreCase("Charizar")) {
            this.type = "Fuego";
            this.number = 6;
        }
    }

    /**
     * Método para obtener el nombre del pokémon.
     * @return nombre del pokémon.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para modificar el nombre del pokémon.
     * @param name -- Nuevo nombre.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para obtener el número del pokémon.
     * @return número del pokémon.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Método para modificar el número del pokémon.
     * @param number -- Nuevo número.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Método para obtener el tipo del pokémon.
     * @return tipo del pokémon.
     */
    public String getType() {
        return type;
    }

    /**
     * Método para modificar el tipo del pokémon.
     * @param type -- Tipo nuevo.
     */
    public void setType(String type) {
        this.type = type;
    }
}