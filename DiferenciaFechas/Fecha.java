import java.util.Scanner;
/**
 * Esta clase calcula la diferencia entre los años ingresados, tomará en
 * cuenta los días bisiestos añadiéndolos al cálculo de su diferencia de 
 * dichos años convertidos en días: diferencia de años + dias bisiestos
 */
public class Fecha {
  
  public int difAnios(int a1, int a2) {
    int anioDif, cta, i, anioDias;
    anioDif = a2 - a1; // para sacar la diferencia de años
    /* Para contar los años bisiestos en un intervalo de fechas */
    cta = 0; // llevará la cuenta de años bisiestos
    /* Recorrerá del a1 al a2 comprobando si existen años bisiestos los años 
       bisiestos son divisibles por 4 y 400, ecluyendo los que sean divisibles
       por 10 */
    for (i = a1; i <= a2; i++) {
      if ((i % 4 == 0) && (i % 100 != 0 || i % 400 == 0)) {
        cta += 1;
      }
    }
    /* La diferencia de años multiplicada por 365 más la cuenta de número de 
       años bisiestos nos dará el número de días que habrá entre los años
       evaluados */
    anioDias = (anioDif * 365) + cta;
    return anioDias;
  }
  
  /**
   * Al primer año se le quitarán los días del intervalo del primer día del
   * año a la primera fecha ingresada.
   */
  public int diasAnioUno(int d1, int me1, int a1) {
    int m1, restoDias1;
    m1 = 0;
    /* Cada número de mes tiene asignado números pre-calculados ya que no
       todos los meses tienen el mismo número de días.
       Se empieza con el día 1 y aumenta de acuerdo al número de días que
       tiene cada mes hasta completar el año */
    switch(me1) {
      case 1:
        m1 = 0;
        break;
      case 2:
        m1 = 31;
        break;
      case 3:
        m1 = 59;
        break;
      case 4:
        m1 = 90;
        break;
      case 5:
        m1 = 120;
        break;
      case 6:
        m1 = 151;
        break;
      case 7:
        m1 = 181;
        break;
      case 8:
        m1 = 212;
        break;
      case 9:
        m1 = 243;
        break;
      case 10:
        m1 = 273;
        break;
      case 11:
        m1 = 304;
        break;
      case 12:
        m1 = 334;
        break;
    }
    /* Dependiendo del mes asignado sus días se sumará con los días ingresados
       de la primera fecha */
    restoDias1 = m1 + d1;
    return restoDias1;
  }
  
  /* Al segundo año se le quitarán los días del intervalo de la segunda fecha
     ingresada hasta el último día de ese mismo año. */
  public int diasAnioDos(int d2, int me2, int a2) {
    int m2, restoDias2;
    m2 = 0;
    /* Cada número de mes tiene asignado números precalculados ya que no todos
       los meses tienen el mismo número de días.
       Se empieza con el día 1 y aumenta de acuerdo al número de días que
       tiene cada mes hasta completar el año. */
      switch (me2){ 
        case 1: 
          m2 = 0; 
          break; 
        case 2: 
          m2 = 31; 
          break; 
        case 3: 
          m2 = 59; 
          break; 
        case 4: 
          m2 = 90; 
          break; 
        case 5: 
          m2 = 120; 
          break; 
        case 6: 
          m2 = 151; 
          break; 
        case 7: 
          m2 = 181; 
          break; 
        case 8: 
          m2 = 212; 
          break; 
        case 9: 
          m2 = 243; 
          break; 
        case 10: 
          m2 = 273; 
          break; 
        case 11: 
          m2=304; 
          break; 
        case 12: 
          m2=334; 
          break;
      }
      restoDias2 = m2 + d2;
      /* Devuelve el valor que se pretendía calcular */
      return restoDias2;
  }
  
  public static void main(String[] args) {
    Fecha f = new Fecha();
    Scanner in = new Scanner(System.in);
    /* Se pedira en esta funcion los datos solicitados por el programa */ 
    int dia1, dia2, mes1, mes2, anio1, anio2, restodias1, restodias2, aniodias, diastotales; 
    /* Anuncia lo que pedira para la primera fecha*/ 
System.out.println ("Ingresara datos de la primera fecha:"); 
System.out.println ("Ingrese el dia"); /* Solicita que ingrese el primer dia */ 
dia1 = in.nextInt();
System.out.println("Ingrese el mes"); /* Solicita que ingrese el primer mes */ 
mes1 = in.nextInt(); 
System.out.println ("Ingrese el anio"); /* Solicita que ingrese el primer anio */ 
anio1 = in.nextInt();
/* Anuncia lo que pedira para la primera fecha*/ 
System.out.println ("Ingresara datos de la segunda fecha:"); 
System.out.println ("Ingrese el dia"); /* Solicita que ingrese el segundo dia */ 
dia2 = in.nextInt();
System.out.println ("Ingrese el mes"); /* Solicita que ingrese el segundo mes */ 
mes2 = in.nextInt();
System.out.println ("Ingrese el anio"); /* Solicita que ingrese el segundo anio */ 
anio2 = in.nextInt();

/*Llamada a la funcion difanios*/ 
aniodias= f.difAnios(anio1, anio2); 
/* Lammada a la funcion diasaniouno*/ 
restodias1=f.diasAnioUno (dia1, mes1, anio1); 
/* Llamada a la funcion diasaniodos*/ 
restodias2=f.diasAnioDos (dia2, mes2, anio2); 
/* Calcula 'diastotales' con los valores que devuelve cada funcion */ 
diastotales= aniodias + (restodias2 - restodias1); 
System.out.println ("\n"); 
System.out.println(diastotales);
  }
}  