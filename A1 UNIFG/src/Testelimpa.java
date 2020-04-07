/**
 * remove
 */
public class Testelimpa {

    public static void main(String[] args) {
        Genics<String> vetor = new Genics<String>();

        vetor.adiciona("joão");
        vetor.adiciona("maria");
        vetor.adiciona("fred");
        
        System.out.println(vetor);
        
        vetor.limpa();
        System.out.println(vetor); 
    }
}