import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import java.util.Random;
import java.util.Scanner;

/**
 * Parser para crear matrices
 */
public class PruebaMatriz extends DefaultHandler {
   
   /**
    * Para saber si encontró la etiqueta dimensiona.
    */
   boolean dimensiona;
   
   /**
    * Para saber si encontró la etiqueta dimensionb.
    */
   boolean dimensionb;
   
   /**
    * Para saber si encontró la etiqueta elemento.
    */
   boolean elemento;
   
   /**
    * Guarda el parámetro de la etiqueta dimensiona.
    */
   int n;
   
   /**
    * Guarda el parámetro de la etiqueta dimensionb.
    */
   int m;
   
   /**
    * Guarda los elementos como cadena.
    */
   String elementos;
   
   /**
    * Busca las etiquetas.
    */
   public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
      if (qName.equalsIgnoreCase("dimensiona")) {
         dimensiona = true;
      }
      if (qName.equalsIgnoreCase("dimensionb")) {
         dimensionb = true;
      }
      if (qName.equalsIgnoreCase("elementos")) {
         elemento = true;
      }
   }
   
   /**
    * Obtiene los valores de las etiquetas.
    */
   public void characters(char[] ch, int start, int length) throws SAXException {
      if (dimensiona) {
         n = Integer.parseInt(new String(ch,start,length).trim());
         dimensiona = false;
      }
      if (dimensionb) {
         m = Integer.parseInt(new String(ch,start,length).trim());
         dimensionb = false;
      }
      if (elemento) {
         elementos = new String(ch,start,length).trim();
         elemento = false;
      }
   }
   
   /**
    * Construye la matriz.
    */
   public TDAMatriz getMatriz() {
      Double[] arreglo = new Double[elementos.length()];
      elementos = elementos.replace(" ", "");
      for (int i = 0; i < elementos.length(); i++) {
         arreglo[i] = new Double(new String(elementos.charAt(i)+""));
      }
      int contador = 0;
      TDAMatriz nueva = new Matriz(n, m);
      for(int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            nueva.agrega(i,j, arreglo[contador++]);
         }
      }
      return nueva;
   }
   
   public void parseDocument(InputStream is) {
      SAXParserFactory spf = SAXParserFactory.newInstance();
      try {
         SAXParser sp = spf.newSAXParser();
         sp.parse(is, this);
      }catch(SAXException se) {
         se.printStackTrace();
      }catch(ParserConfigurationException pce) {
         pce.printStackTrace();
      }catch (IOException ie) {
         ie.printStackTrace();
      }
   }
   
   /**
    * Método main.
    */
   public static void main(String args[]) throws IOException {
      
      /* En caso de que no se le pase nada por consola */
      if(args.length == 0){
         System.out.println("Debes pasar algún argumento");
         System.exit(1);
      }
      
      /* Matriz generada a partir del parser */
      FileInputStream fis=new FileInputStream("matriz.xml");
      PruebaMatriz ep= new PruebaMatriz();     
      ep.parseDocument(fis);
      TDAMatriz a = ep.getMatriz();
      
      /* Matriz generada aleatoriamente */
      Random alea = new Random();
      TDAMatriz b = new Matriz(a.getRenglones(),a.getColumnas());
      for (int i = 0; i < b.getRenglones(); i++) {
         for (int j = 0; j < b.getColumnas(); j++) {
            b.agrega(i,j, new Double(alea.nextInt(100)));
         }
      }
      
      /* Mostramos las dos matrices */
      System.out.println("Matriz a");
      System.out.println(a);
      System.out.println("Matriz b");
      System.out.println(b);
      
      Scanner teclado = new Scanner(System.in);
      
      /* Respuesta dependiendo del parámetro */
      switch(args[0]) {
         case "-r":
            System.out.println("Renglones: " + a.getRenglones());
            break;
         case "-c":
            System.out.println("Columnas: " + a.getColumnas());
            break;
         case "-e":
            System.out.print("Introduce la posición i: ");
            int i = teclado.nextInt();
            System.out.print("Introduce la posición j: ");
            int j = teclado.nextInt();
            System.out.println(a.get(i,j));
            break;
         case "-mo":
            System.out.print("Introduce la posición i: ");
            i = teclado.nextInt();
            System.out.print("Introduce la posición j: ");
            j = teclado.nextInt();
            System.out.print("Introduce el nuevo elemento: ");
            double e = teclado.nextDouble();
            a.agrega(i,j, e);
            System.out.println(a);
            break;
         case "-s":
            System.out.println("a + b: ");
            System.out.println(a.suma(b));
            break;
         case "-me":
            System.out.print("Introduce el escalar: ");
            int es = teclado.nextInt();
            System.out.println(a.multiplicaEscalar(es));
            break;
         case "-t":
            System.out.println(a.traspuesta());
            break;
         case "-i":
            if (a.equals(b))
            System.out.println("Son iguales");
            else
               System.out.println("Son distintas");
            break;
      }
   }
}  