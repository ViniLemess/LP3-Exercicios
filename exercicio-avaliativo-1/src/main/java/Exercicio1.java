public class Exercicio1 {
    public static void main(String[] args) {

        String nome1 = "João";
        String nome2 = "Vini";
        String nome3 = "Kauan";

        System.out.println(nome1.equals(nome2)); //retorna um boolean baseado na comparação de duas strings
        System.out.println(nome2.toUpperCase()); //transforma todos os caracteres da string em maiusculo
        System.out.println(nome3.charAt(0)); //mostra qual é o char na posição passada como parametro
        System.out.println(nome1.toLowerCase()); //transforma todos os caracteres da strign em minusculo
        System.out.println(nome3.contains("auan")); //retorna um boolean verificando se a string do parametro esta contida na string verificada
        System.out.println(nome2.toCharArray()); //separa a string transformando-a em um array de char
        System.out.println(nome3.isBlank()); //retorna true caso a string esteja vazia ou contendo espaço em branco
        System.out.println(nome1.isEmpty()); //retorna true caso a string esteja vazia;
        System.out.println(nome2.length()); //retorna um int com o numero de caracteres que a string possui
        System.out.println(nome3.matches("0-9")); //retorna um booleano de acordo com a expressao regular passada como parametro
        System.out.println(nome1.concat(" Gabriel")); //concatena string desejada com a string passada como parametro
        System.out.println(nome2.replace("Vini", "Vinicius")); //altera a string contida na variavel
    }
}
