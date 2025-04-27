public class TiposVariaveis001a003 {
    public static void main(String[] args) throws Exception {
        // Aula 1 e 2 - Integração com GitHub
        // Aula 3 - Tipos de dados Primitivos
        // int, byte, short, long, float, double, boolean e char. São valores brutos,
        // não objetos. Que são armazenados em pilha de memória (memory stack)

        // Declaração de variáveis
        // <Tipo> <nome da variável> = <valorOpcional>;

        // Tipos numéricos inteiros
        byte idade = 123; // 1 byte (8 bits) -128 a 127
        short ano = 2023; // 2 bytes (16 bits) -32.768 a 32.767
        int cep = 12345678; // 4 bytes (32 bits) -2.147.483.648 a 2.147.483.647
        long cpf = 12345678901L; // 8 bytes (64 bits) -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807, deve ser finalizado com L OU l

        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("Cep: " + cep);
        System.out.println("Cpf: " + cpf);

        // Tipos numéricos com ponto flutuante
        float pi = 3.14f; // 4 bytes (32 bits) -3.40282347E+38 a 3.40282347E+38, deve ser finalizado com F OU f
        double salario = 2.500; // 8 bytes (64 bits) -1.7976931348623157E+308 a 1.7976931348623157E+308

        System.out.println("Pi: " + pi);
        System.out.println("Salario: " + salario);

        // Tipos lógicos e caracteres
        boolean verdadeiro = true; // 1 bit (0 ou 1)
        char letra = 'A'; // 2 bytes (16 bits) -65536 a 65535

        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Letra: " + letra);

        // Java é fortemente tipada, ou seja, não é possível atribuir um valor de um tipo a outro tipo diferente sem conversão explícita. Ou no caso numérico, para um tipo que não comporte o valor do tipo atribuído.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; // Não compila, pois o valor de numeroNormal pode ser maior que o máximo do short (32767).
        // Para resolver isso, é necessário fazer um cast (conversão explícita) para o tipo short.
        short numeroCurto2 = (short) numeroNormal;
    }
}
