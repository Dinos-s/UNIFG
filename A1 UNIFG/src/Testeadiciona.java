
public class Testeadiciona {
    public static void main(String[] args) {
        Genics<String> vetor = new Genics<String>();

        vetor.adiciona("joão");
        vetor.adiciona("maria");
        vetor.adiciona("fred");
        
        System.out.println(vetor);
    }
}