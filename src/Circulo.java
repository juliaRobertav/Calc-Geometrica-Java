public class Circulo {

    double raio;

    Circulo(double raio){    //construtor: método que inicializa classes(mesmo nome da classe)
        this.raio=raio;
    }

    double calcularArea(){
        return Math.PI*Math.pow(this.raio, 2);  //PI*r*2
    }

    double calcularPerimetro(){
        return 2*Math.PI*raio;  //2*PI*r
    }

}

