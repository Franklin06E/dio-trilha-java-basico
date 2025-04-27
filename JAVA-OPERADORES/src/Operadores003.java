public class Operadores003 {
    public static void main(String[] args) {
        // Aula 4 - Incrementar numeros iguais
        int numero = 5;

        //s repetição
        numero = numero + 1;

        System.out.println(numero);

        // mesmo resultado, mas com operador de incremento
        System.out.println(numero++); // imprime 6, depois incrementa para 7
        System.out.println(numero); // imprime 7

        System.out.println(++numero); // incrementa para 8, depois imprime 8
        System.out.println(numero); // imprime 8

        System.out.println(numero--); // imprime 8, depois decrementa para 7
        System.out.println(numero); // imprime 7

        System.out.println(--numero); // decrementa para 6, depois imprime 6
        System.out.println(numero); // imprime 6

        boolean verdadeiro = true;
        // Invertendo o valor booleano
        System.out.println("Inverteu: " + !verdadeiro); // imprime false
        System.out.println(verdadeiro); // imprime true

        // Inverteu a variável verdadeiro para false
        verdadeiro = !verdadeiro; // inverteu para false
        System.out.println(verdadeiro); // imprime false
    }
}
