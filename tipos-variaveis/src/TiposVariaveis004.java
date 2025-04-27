public class TiposVariaveis004 {
        public static void main(String[] args) {
        // Aula 4 - Variáveis vs Constantes

        // Variáveis são valores que podem ser alterados durante a execução do programa.
        int numero = 5;
        System.out.println("Número inicial: " + numero);

        // Alterando o valor da variável
        numero = 10; 
        System.out.println("Número alterado: " + numero);

        // Constantes são valores que não podem ser alterados durante a execução do programa.
        // Escrita como Final <Tipo> <nome da constante> = <valor>;
        // O nome da constante deve ser escrito em letras maiúsculas, com palavras separadas por underline (_).

        final double VALOR_DE_PI = 3.14;

        // VALOR_DE_PI = 3.14159f; // Não compila, pois VALOR_DE_PI é uma constante e não pode ser alterada.
        System.out.println("Valor de PI: " + VALOR_DE_PI);
    }  
}
    
    
