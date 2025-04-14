public class Cilindro {

    private double raio;
    private double altura;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {     // modifica o objeto através da atribuação do valor passado por parâmetro a este objeto
        if (raio > 0) {
            this.raio = raio;
        }      //raio a roxo apra se referir ao objeto declaro em cima // this é referência para o próprio objeto
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolume() {       //não é preciso de passar valores/parâmetro porque o cálculo do volume é através dos valores de raio e altura caracterizados logo no início
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public double calcularArea() {
        return 2 * Math.PI * raio * (raio + altura);
    }

}
