public class Operadores002 {
    public static void main(String[] args) {
        // Aula 3 - Operadores Unários
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println("Número negativo: " + -numero);

        // Imprimindo o numero positivo
        System.out.println("Número positivo: " + +numero);

        // Incrementando numero em mais 1, imprime 6
        numero++;
        System.out.println("Após incremento: " + numero);

        // Incrementando numero em mais 1, imprime 7
        System.out.println("Imprime e depois incrementa: " + numero++);
        System.out.println("Agora sim, número virou: " + numero);

        // Ordem de precedência conta aqui
        System.out.println("Incrementa e imprime: " + ++numero);

        boolean verdadeiro = true;

        // Invertendo o valor booleano
        System.out.println("Inverteu: " + !verdadeiro);

    }
}
