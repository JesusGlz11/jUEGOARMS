

/**
 * Esta clase es la declaración de las armas Ak
 */

//A una plantilla se le llama clase
public class Ak {
    //A los datos les llamamos Atributos o caracteristicas del objeto.
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;

/**
 *
 * Este es un metodo que indica el valor de los atributos Ak
 * @return int regresa el valor del daño dependiendo del tipo de arma
 */
    public Ak(int tipo){
        switch (tipo){
            case 0:
                this.tipo="Madera";
                this.cargador=4;
                this.precision=20;
                this.velocidadCarga=1;
                this.precio=1;
                this.danio=10;
            break;
            
            case 1:
                this.tipo="Bronce";
                this.cargador=5;
                this.precision=75;
                this.velocidadCarga=5;
                this.precio=1000;
                this.danio=10;
            break;
            
            case 2:
                this.tipo="Plata";
                this.cargador=8;
                this.precision=70;
                this.velocidadCarga=4.5;
                this.precio=2300;
                this.danio=11;                
            break;
            
            case 3:
                this.tipo="Adamantius";
                this.cargador=30;
                this.precision=100;
                this.velocidadCarga=1;
                this.precio=10000;
                this.danio=35;                
            break;
        }
    }
    
 /**
 *Este es el constructor completo
 */
    public Ak(String tipo, int cargador, int precision, double velocidadCarga, double precio, int danio){
        this.tipo=tipo;
        this.cargador=cargador;
        this.precision=precision;
        this.velocidadCarga=velocidadCarga;
        this.precio=precio;
        this.danio=danio;
    }
    
 /**
 *Constructor vacio
 */
    public Ak(){
    
    }
    
 /**
 *Este metodo muestra el menu 
 * @return regresa el menu de tipo de armas
 */
    public String menuAk(){
    String menu= "Tipo de arma que desea:\n";
    menu+="Menu:\n";
    menu+="0-Madera\n";
    menu+="1-Bronce\n";
    menu+="2-Plata\n";
    menu+="3-Adamantium\n";
    return menu;
    }
    
    //a las funciones o acciones les llamamos metodos //Metodos son las acciones e interaciones del objeto

 /**
 *Este metodo calcula el danio
 * @return nos regresa el danio
 */
    public double disparar(){
        return (this.danio*this.precision)/100;
    }

    
 /**
 * Este metodo regresa el valor de cada atributo de la clase Ak
 * @return va a regresar los valores de los atributos en String
 */   
    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ",precio=" + precio + ", danio=" + danio + '}';
    }
    
    
    
}
