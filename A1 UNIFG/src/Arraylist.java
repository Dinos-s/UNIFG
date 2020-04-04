import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>(); 

        lista.add("a");
        lista.add("c");

        System.out.println(lista);
        
        lista.add(1, "b");
        System.out.println(lista);

        boolean existe = lista.contains("a");
        if (existe) {
            System.out.println("Existe");
        }

        int pos = lista.indexOf("b");
        if (pos > -1) {
            System.out.println("Exxiste; index of " + pos);
        }else{
            System.out.println("inexixtente " + pos);
        }

        System.out.println("na posição " + lista.get(2)); 

        lista.remove("b");
        lista.remove(0);//posição
        System.out.println(lista);

        System.out.println(lista.size());

        System.out.println(lista);
    lista.clone();

              
    }
}