
package boletin3_3;

public class Circulo {
    
    private double radio;
    public final double PI=3.14;
    
    public Circulo(){
        radio=0;
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public void setradio(double r){
        radio = r;
    }
    public double getradio(){
        return radio;
    }
    public double calcularArea(){
        return Math.pow(radio,2);
    }
    public double calcularLongitud(){
        return radio*PI*2;
    }
}
