public class Retangulo {

    double base;
    double altura;
    double lado;

    Retangulo(double base, double altura, double lado){
        this.base=base;
        this.altura=altura;
        this.lado=lado;
    }

    double calcularArea(){
        return Math.pow(base, altura);  //b*h
    }

    double calcularPerimetro(){
        return lado+lado+lado+lado; //soma dos lados
    }

}
