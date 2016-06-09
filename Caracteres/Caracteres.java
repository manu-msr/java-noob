public class Caracteres {
  
  public Caracteres() {
    
  }
  
  public String revString(String s) {
    int contador = 0;
    char letra = ' ';
    while(contador < s.length()) {
      letra = s.charAt(contador++);
      switch(letra) {
        case '$':
        case '#':
        case '@':
        case '!':
          return "Sí";
      }
    }
    return "NO";
  }
}
