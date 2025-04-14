public class Exercicio1 {

    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro();  // variavel cilindro (2º) tem uam referência para a classe Cilindro (1ª)
        cilindro.setRaio(2);
        cilindro.setAltura(3);   // invocar o metodo para o objeto cilindro, alterando o valor do raio e altura DESTE cilindro

        // criação de dois obejtos criados a partir da mesma classe, logo contém o mesmo conjunto de variáveis de instância

        Cilindro cilindro1 = new Cilindro();
        cilindro1.setRaio(3);
        cilindro1.setAltura(4);

        System.out.println("Volume: " + cilindro.calcularVolume());    //  metodo de instância que devolve o valor do volume do cilindro
        System.out.println("Área: " + cilindro.calcularArea());

        System.out.println("Volume: " + cilindro1.calcularVolume());
        System.out.println("Área: " + cilindro1.calcularArea());
    }
}

