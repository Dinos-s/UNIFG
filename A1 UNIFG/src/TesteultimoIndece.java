
public class TesteultimoIndece {
    public static void main(String[] args) {
        
        Genics<String> vetor = new Genics<String>();

        vetor.adiciona("joão");
        vetor.adiciona("maria");
        vetor.adiciona("fred");
        vetor.adiciona("joão");

        vetor.ultimoIndiceDe("joão");
    }
}