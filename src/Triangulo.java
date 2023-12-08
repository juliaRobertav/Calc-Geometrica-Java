public class Triangulo {
    double base;
    double altura;
    double lado;

    Triangulo(double base, double altura, double lados){
        this.base=base;
        this.altura=altura;
        this.lado =lados;
    }

    double calcularArea(){
        return Math.pow(base, altura)/2;
    }   //b*h/2

    double calcularPerimetro(){
        return lado+lado+lado+lado;
    }   //soma dos lados

}
