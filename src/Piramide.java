public class Piramide {

    double l;
    double h;

    Piramide(double l, double h){
        this.l = l;
        this.h = h;
    }

    double calcularArea(){
        return Math.pow(l, 2);
    }

    double calcularVolume(){
        return Math.pow(l, 2)*h/3;
    }
}
