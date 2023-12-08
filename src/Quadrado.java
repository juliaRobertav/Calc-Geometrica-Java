public class Quadrado {

    double lado;

    Quadrado(double lado){
        this.lado=lado;
    }

    double calcularArea(){
        return Math.pow(this.lado, 2);  //lado*lado
    }

    double calcularPerimetro(){
        return lado+lado+lado+lado; //soma dos lados
    }

}
