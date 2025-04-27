public class Operadores004 {
    public static void main(String[] args) {
        // Aula 5 - Ternário
        // É uma condição IF em uma linha
        // <Expressão Condicional> ? <Valor se verdadeiro> : <Valor se falso>;
        int a, b;

        a = 6;
        b = 6;
        String resultado = "";

        // Sintáxe completa
        // Deve-se utilizar quando há necessidade de condições aninhadas ou condições complexas
        if(a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

            System.out.println(resultado);
            
        // Sintáxe reduzida
        // Deve-se utilizar somente em casos simples, onde não há necessidade de casos aninhados
        String resultado2 = (a==b) ? "Verdadeiro" : "Falso";

        System.out.println(resultado2);
    }
}
