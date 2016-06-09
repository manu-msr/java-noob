package canica;

import java.awt.Color;
import java.awt.Point;

/**
 * Clase para manejar canicas.
 * @author Manuel Soto Romero
 * @version 1.00 Marzo 2013
 */
public class Canica {
    
    /**
     * Atributos de la clase
     */
    private Color color;
    private int tamanio;
    private Point pos;
    private int pasos;
    private static int numCanicas;

    /**
     * Constructor por omisión
     */
    public Canica() {
        color = Color.RED;
        tamanio = 0;
        pos = new Point(0,0);
        pasos = 0;
        numCanicas++;
    }

    /**
     * Constructor a partir de cuatro parámetros.
     * @param color -- Color de la canica.
     * @param tamanio -- Tamaño de la canica.
     * @param pos -- Posición de la canica.
     * @param pasos -- Pasos que puede dar la canica.
     */
    public Canica(Color color, int tamanio, Point pos, int pasos) {
        this.color = color;
        this.tamanio = tamanio;
        this.pos = pos;
        this.pasos = pasos;
        numCanicas++;
    }
    
    /**
     * Método para mover la canica hacia arriba.
     * @param n -- Número de posiciones a moverse.
     * @return true si se movio, false en otro caso
     */
    private boolean arriba(int n) {
        while(n <= this.pasos && n != 0) {
            if(this.pos.y < 20 && this.pos.y >= 0){
                pos.y++;
                this.pasos--;
                n--;
            } else{
                return false;
            }
        }
        return true;
    }
    
    /**
     * Método para mover la canica hacia abajo.
     * @param n -- Número de posiciones a moverse.
     * @return true si se movio, false en otro caso
     */
    private boolean abajo(int n) {
        while(n <= this.pasos && n != 0) {
            if(this.pos.y <= 20 && this.pos.y > 0){
                pos.y--;
                this.pasos--;
                n--;
            } else{
                return false;
            }
        }
        return true;
    }
    
    /**
     * Método para mover la canica hacia la derecha
     * @param n -- Número de posiciones a moverse.
     * @return true si se movio, false en otro caso
     */
    public boolean derecha(int n) {
        while(n <= this.pasos && n != 0) {
            if(this.pos.x < 20 && this.pos.x >= 0){
                pos.x++;
                this.pasos--;
                n--;
            } else{
                return false;
            }
        }
        return true;
    }
    
    /**
     * Método para mover la canica hacia la izquierda
     * @param n -- Número de posiciones a moverse.
     * @return true si se movio, false en otro caso
     */
    public boolean izquierda(int n) {
        while(n <= this.pasos && n != 0) {
            if(this.pos.x <= 20 && this.pos.x > 0){
                pos.x--;
                this.pasos--;
                n--;
            } else{
                return false;
            }
        }
        return true;
    }
    
    /**
     * Método para avanzar
     */
    public boolean avanzar(String direccion, int pasos) {
        if(direccion.equalsIgnoreCase("Arriba")) {
            return arriba(pasos);
        }
        if(direccion.equalsIgnoreCase("Abajo")) {
            return abajo(pasos);
        }
        if(direccion.equalsIgnoreCase("Derecha")) {
            return derecha(pasos);
        }
        if(direccion.equalsIgnoreCase("Izquierda")) {
            return izquierda(pasos);
        }
        return false;
    }
    
    /**
     * Método estático que devuelve el número de canicas creadas.
     * @return número de canicas.
     */
    public static int cuantasCanicas() {
        return numCanicas;
    }
    
    /**
     * Método de acceso.
     * @return color de la canica.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Método de acceso.
     * @return número de pasos de la canica.
     */
    public int getPasos() {
        return pasos;
    }

    /**
     * Método de acceso.
     * @return posición de la canica.
     */
    public Point getPos() {
        return pos;
    }

    /**
     * Método de acceso.
     * @return tamaño de la canica.
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * Método modificador.
     * @param color -- Color de la canica.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Método modificador
     * @param pasos -- Número de pasos de la canica.
     */
    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    /**
     * Método modificador
     * @param pos -- Posición de la canica.
     */
    public void setPos(Point pos) {
        this.pos = pos;
    }

    /**
     * Método modificador
     * @param tamanio -- Tamaño de la canida.
     */
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * Método para representar en formato cadena una canica
     * @return canica en formato cadena.
     */
    @Override
    public String toString() {
        return "Canica" + "\nColor: " + getColor() + "\nTamaño: " + getTamanio() 
                + "\nPosicion: " + getPos() + "\nPasos: " + getPasos() + "\n";
    }

    /**
     * Método para decir si dos canicas son iguales
     * @param can -- Canica a comparar
     * @return true si son iguales, false en otro caso.
     */
    public boolean equals(Canica can) {
        if (can == null) {
            return false;
        }
        if (this.color != can.color && (this.color == null || 
                !this.color.equals(can.color))) {
            return false;
        }
        if (this.tamanio != can.tamanio) {
            return false;
        }
        if (this.pos != can.pos && (this.pos == null || 
                !this.pos.equals(can.pos))) {
            return false;
        }
        if (this.pasos != can.pasos) {
            return false;
        }
        return true;
    }
}
