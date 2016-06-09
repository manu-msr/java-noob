import java.awt.FlowLayout; // especifica como se van a ordenar los componentes
import javax.swing.JFrame; // proporciona las características básicas de una ventana
import javax.swing.JLabel; // muestra texto e imágenes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing.
import javax.swing.Icon; // interfaz utilizada para manipular imágenes
import javax.swing.ImageIcon; // carga las imágenes

/**
 * Programa que muestra texto e imágenes en una ventana.
 * Objetivo: Introducir el concepto de GUI.
 * @author Manuel Soto Romero
 * @version 1.00
 */
public class LabelFrame extends JFrame {
  
  private JLabel etiqueta1; // JLabel sólo con texto;
  private JLabel etiqueta2; // JLabel construida con texto y un icono
  private JLabel etiqueta3; // Jlabel con texto adicional e icono
  
  /**
   * El constructor de LabelFrame agrega objetos JLabel a JFrame
   */
  public LabelFrame() {
    super("Prueba de JLabel");
    setLayout(new FlowLayout()); // establece el esquema del marco
    
    // Constructor de JLabel con un argumento String
    etiqueta1 = new JLabel("Etiqueta con texto");
    etiqueta1.setToolTipText("Esta es etiqueta1");
    add(etiqueta1);
    
    /* Constructor de JLabel con argumentos de cadena, Icono y 
       alineación */
    Icon unam = new ImageIcon(getClass().getResource("unam.jpg"));
    etiqueta2 = new JLabel("Etiqueta con texto e icono", unam,
                           SwingConstants.LEFT);
    etiqueta2.setToolTipText("Esta es etiqueta2");
    add(etiqueta2);
    
    etiqueta3 = new JLabel(); // Constructor de JLabel sin argumentos
    etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
    etiqueta3.setIcon(unam);
    etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
    etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
    etiqueta3.setToolTipText("Esta es etiqueta3");
    add(etiqueta3);           
  }
  
  public static void main(String[] args) {
    LabelFrame marcoEtiqueta = new LabelFrame();
    marcoEtiqueta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marcoEtiqueta.setSize(275, 180);
    marcoEtiqueta.setVisible(true);
  }
}