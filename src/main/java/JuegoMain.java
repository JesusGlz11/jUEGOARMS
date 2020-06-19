
import java.util.Scanner;





public class JuegoMain {
public static void main (String args[]){

Scanner leer=new Scanner (System.in);

Personaje samuel= new Personaje("Samuel");
System.out.println(samuel.arma.menuAk());
int valor=leer.nextInt();
//System.out.printl(valor);
samuel.equiparArma(valor);
System.out.println(samuel);

Personaje jimena=new Personaje("Jimena");
System.out.println(jimena.arma.menuAk());
valor=leer.nextInt();
jimena.equiparArma(valor);
System.out.println(jimena);

System.out.println("El danio que haria es de:"+jimena.arma.disparar());
samuel.recibirDanio(jimena.arma.disparar());
System.out.println(samuel);

}

}
