public class Cubo {

    double a;   //area
    double bases;

    Cubo(double a, double bases){
        this.a=a;
        this.bases=bases;
    }


    double calcularArea(){
        return Math.pow(this.bases, 2);
    }

    double calcularVolume(){
        return Math.pow(this.a, 3);
    }

}
