public class Esfera {

    double raio;

    Esfera(double raio){
        this.raio = raio;
    }

    double calcularArea(){
        return 4*Math.PI*Math.pow(raio,2);
    }


    double calcularVolume(){
        return Math.PI*Math.pow(this.raio, 2)*4/3;
    }

}
