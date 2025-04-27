public class Operadores005 {
    public static void main(String[] args) {
        // Aula 6 - Operadores relacionais
        // São utilizados para comparar valores e retornam um valor booleano (true ou false)
        int numero1 = 1;
        int numero2 = 2;
        boolean resultado;

        System.out.println("numero1 = " + numero1 + " e numero2 = " + numero2);
        // == (igual a)
        resultado = numero1 == numero2;
        System.out.println("numero1 == numero2: " + resultado); // false

        // != (diferente de)
        resultado = numero1 != numero2;
        System.out.println("numero1 != numero2: " + resultado); // true

        // > (maior que)
        resultado = numero1 > numero2;
        System.out.println("numero1 > numero2: " + resultado); // false

        // < (menor que)
        resultado = numero1 < numero2;
        System.out.println("numero1 < numero2: " + resultado); // true

        // >= (maior ou igual a)
        resultado = numero1 >= numero2;
        System.out.println("numero1 >= numero2: " + resultado); // false

        // <= (menor ou igual a)
        resultado = numero1 <= numero2;
        System.out.println("numero1 <= numero2: " + resultado); // true

        // Relacionais com fluxo de controle
        if(numero1 < numero2){
            System.out.println("Numero 1 é menor que o Número 2");
        }

        // Comparação de Strings
        String nomeUm = "Elias";
        String nomeDois = "Elias";

        System.out.println(nomeUm == nomeDois);

        String nomeTres = new String("Elias");

        System.out.println(nomeUm == nomeTres); // false, pois são objetos diferentes

        // Para comparar o conteúdo de Strings, deve-se utilizar o método equals()
        System.out.println(nomeUm.equals(nomeTres)); // true, pois o conteúdo é o mesmo
    }
}
