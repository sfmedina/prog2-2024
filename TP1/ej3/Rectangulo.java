package ej3;
//Implementar la clase Rectángulo.
// Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se
// trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
// Nota. Definir la estructura que deber poseer un rectángulo y en base a esto implementar
// los atributos de la clase.
// La funcionalidad que debe proveer un rectángulo es la siguiente
// ● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
// Y.
// ● Calcular el Área del rectángulo.
// ● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
// iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
// del mismo es mayor que la del otro.
// ● Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
// propiedades para que sea un cuadrado.
// ● Determinar el largo del lado superior.
//● Determinar si está acostado o parado (si el alto es más que el ancho). 

public class Rectangulo {
    double posX ;
    double posY;
    double altura;
    double ancho;







    
    public double getPosX() {
        return posX;
    }


    public void setPosX(double posX) {
        this.posX = posX;
    }


    public double getPosY() {
        return posY;
    }


    public void setPosY(double posY) {
        this.posY = posY;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getAncho() {
        return ancho;
    }


    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    public Rectangulo(){
        posX=0;
        posY=0;
        altura =3.5;
        ancho=5.5;
    }
 
    
    public double cambiaPosX(double posX){
        double nuevaPosX=0;
        posX+=nuevaPosX;

        return  posX;
    }
    public double cambiaPosY(double posY){
        double nuevaPosY=0;
        posY+=nuevaPosY;

        return  posY;
    }

    public double area(double h, double a){
        double area;
        area=h*a;
        return area;
    }

    public boolean orientacion(double h, double a){       
        return (h<a);
    }

    public boolean escuadrado(double h, double a){
        return (h==a);
    }
    public int esmayor(double area1, double area2){
        int es =0;
        if(area1>area2){
            es=1;
        }else if(area1<area2){
            es=-1;
        }
        else{
            es=0;
        }
            return es;

        }
    }

