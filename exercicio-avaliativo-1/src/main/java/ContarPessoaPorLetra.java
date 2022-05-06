
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class ContarPessoaPorLetra {
    public static void main(String[] args) {

        List<String> pessoas = Arrays.asList("Lucas", "Joao Gabriel", "Mayara", "Vinicius", "Karla"
        , "Kauan", "Nicholas");

        long contador = pessoas.stream().filter(str -> (str.toUpperCase().startsWith("K"))).count();
        System.out.println("Existem " + contador + " pessoas que o nome começa com a letra K na lista!");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Joao", 21);
        map.put("Vini", 18);

    }
}
