public class Operadores {
    public static void main(String[] args) throws Exception {
        // Operadores são símbolos especiais que tem um significado próprio, associados
        // a determinadas operações.

        // Operador de Atribuição
        int a = 10; // A variável a recebe o valor 10 através do "="
        String nome = "Lucas"; // A variável nome recebe o valor "Lucas" através do "="

        // Operadores de concatenação
        String nomeCompleto = "Linguagem" + "Java"; // A variável nomeCompleto recebe o valor "Linguagem Java" através
                                                    // do "+"

        System.out.println(nomeCompleto);

        // Casos especiais de concatenação
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);
        // Resultado: 31
        // Explicação: 1 + 1 + 1 = 3, depois o resultado é concatenado com "1",
        // resultando em "31"

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);
        // Resultado: 1111
        // Explicação: 1 + "1" = "11", depois o resultado é concatenado com 1,
        // resultando em "111", e por fim, concatenado com 1 novamente, resultando em
        // "1111"

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);
        // Resultado: 1111
        // Explicação: 1 + "1" = "11", depois o resultado é concatenado com 1,
        // resultando em "111", e por fim, concatenado com "1" novamente, resultando em
        // "1111"

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);
        // Resultado: 1111
        // Explicação: "1" + 1 = "11", depois o resultado é concatenado com 1,
        // resultando em "111", e por fim, concatenado com 1 novamente, resultando em
        // "1111"

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);
        // Resultado: 14
        // Explicação: 1 + 1 + 1 = 3, depois o resultado é concatenado com "1",
        // resultando em "14"

        
    }
}
