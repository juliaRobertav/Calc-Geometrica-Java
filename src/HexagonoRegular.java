public class HexagonoRegular {

    double a;   //a=apotema
    double lado;

    HexagonoRegular(double a, double lado){
        this.a=a;
        this.lado=lado;
    }

    double calcularArea(){
        return 3*lado*a;    //3 multiplicado pelo a e pelo comp. de um dos seus lados
    }

    double calcularPerimetro(){
        return Math.pow(6, a);  //comp. dos 6 lados
    }

}
