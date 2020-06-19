
/**
 * Esta clase es la declaracion de los personajes del juego
 */
public class Personaje {
   int vida;
   String nombre;
   Ak arma; 
   
/**
 *
 * 
 * 
 */   
   public Personaje(){
       this.vida=100;
   }
   
/**
 *
 * Este es un metodo completo en donde se asigno valores a todos los atributos de la clase
 * @param nombre es el nombre del P
 */   
   public Personaje(String nombre){
       this();
       this.nombre=nombre;
       this.arma=new Ak();
   }
  
 /**
 *
 * Este es un metodo que equipa un arma a un personaje
 * @param valor es el tipo de arma que utlilizara
 */  
   public void equiparArma(int valor){
       arma=new Ak(valor);
   }
   
 /**
 *
 * Este metodo le resta el danio recibido a la vida
 * @param danio es el danio recibido
 */  
   public void recibirDanio(double danio){
   this.vida-=danio;
   }
   
}
