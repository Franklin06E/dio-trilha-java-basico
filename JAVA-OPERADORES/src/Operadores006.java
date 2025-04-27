public class Operadores006 {
    public static void main(String[] args) {
        // Aula 7 - Operadores lógicos
        // São utilizados para combinar expressões booleanas e retornam um valor
        // booleano (true ou false)
        // && (E lógico) - Retorna true se ambas as expressões forem verdadeiras
        // || (OU lógico) - Retorna true se pelo menos uma das expressões for verdadeira
        // ! (NÃO lógico) - Inverte o valor da expressão booleana

        boolean condicao1 = true;
        boolean condicao2 = false;

        // E lógico
        System.out.println("Condicao1 && Condicao2: " + (condicao1 && condicao2)); // false

        // OU lógico
        System.out.println("Condicao1 || Condicao2: " + (condicao1 || condicao2)); // true

        // NÃO lógico
        System.out.println("!Condicao1: " + !condicao1); // false

        if (condicao1 && condicao2) {
            System.out.println("Ambas as condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma condição é verdadeira");
        }
    }
}
