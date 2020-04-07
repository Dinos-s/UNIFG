
public class Testeremover {
    public static void main(String[] args) {
        Genics<String> vetor = new Genics<String>();

        vetor.adiciona("José");
        vetor.adiciona("Maria");
        vetor.adiciona("José");
        System.out.println(vetor);
        vetor.remover("José");
        System.out.println(vetor);
    }
}