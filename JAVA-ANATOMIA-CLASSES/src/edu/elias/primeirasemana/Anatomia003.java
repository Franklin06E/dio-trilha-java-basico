package edu.elias.primeirasemana;
// Aula 3 - Anatomia das Classes 3

public class Anatomia003 {

    public static void main(String[] args) {

        // Estrutura

        // Tipo nomeBemDefinido = Atribuição (opcional em alguns casos)

        // Exemplo:

        // Variável do tipo texto (String)
        String meuNome = "Elias";

        // Variável do tipo inteiro
        int anoFabricacao = 2022;

        // Variável do tipo lógica
        boolean verdadeira = true; // ou false

        // Manipulação de variáveis

        anoFabricacao = 2018;

        // Declaração das variáveis para o método nomeCompleto
        String primeiroNome = "Elias";
        String segundoNome = "Franklin";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        // Chamada do método nomeCompleto, passando os parâmetros primeiroNome e segundoNome
        // Pode haver uma variável com mesmo nome, a diferença é que o método é chamado através de método(parâmetros)

        System.out.println(nomeCompleto);
    }

        // Estrutura padrão de um método
        // Deve ser declarado dentro de uma classe, mas fora do método main
        // Retorno e Parâmetros não precisa ser do mesmo tipo.    
        // TipoRetorno NomeObjetivoNoInfinitivo (Parametros) {}

        // Exemplo:

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        // Concatenação de strings, o mesmo que +, mas mais eficiente
    }
}