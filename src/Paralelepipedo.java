public class Paralelepipedo {

    double a; //comprimento
    double b; //largura
    double c; //altura

    Paralelepipedo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calcularArea(){
        return Math.pow(this.a, this.b);
    }
    double calcularVolume(){
        return (this.a*this.b*this.c);
    }

}
