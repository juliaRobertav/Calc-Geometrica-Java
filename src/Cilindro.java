public class Cilindro {

    double raio;
    double h;

    Cilindro(double raio, double h){
        this.raio = raio;
        this.h = h;
    }

    double calcularArea(){
        return (2*Math.PI)*(raio*h)+(2*Math.PI*Math.pow(this.raio, 2));
    }

    double calcularVolume(){
        return (Math.PI)*Math.pow(this.raio, 2)*h;
    }

}
