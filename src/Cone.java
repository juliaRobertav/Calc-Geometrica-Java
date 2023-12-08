import java.util.Scanner;

public class Cone {

    double raio;
    double altura;


    Cone(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    double calcularArea(){
        return Math.PI*raio*(raio+(Math.sqrt(Math.pow(this.raio, 2.0)) + (Math.pow(this.altura, 2.0))));
    }

    double calcularVolume(){
        return (Math.PI*Math.pow(raio, 2)*altura)/3.0;
    }

}
