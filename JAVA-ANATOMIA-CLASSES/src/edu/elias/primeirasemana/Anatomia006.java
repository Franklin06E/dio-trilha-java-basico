package edu.elias.primeirasemana;
// //Aula 6 - Anatomia das Classes 6
public class Anatomia006 {

    public static void main(String[] args) {
        // Java Beans - Sugestão de Padrão de nomenclatura de classes, métodos e atributos

        // Variável
        // Deve ser clara, sem abreviações ou não ter sentido.
        // Sempre no singular, exceto array ou coleção.
        // Deve possuir um idioma único.

        // Não recomendado:

        double salMedio = 1500.23; // Variável abreviada.
        String emails = "aluno@escola.com"; // Variável com nome no plural.
        String myName = "Joseph"; // Variável com nome em inglês. Sendo utilizado português.

        // Recomendado:

        double salarioMedio = 1500.23; // Variável clara, sem abreviações.
        String email = "aluno@escola.com"; // Variável com nome no singular.
        String [] listaDeEmails = {"aluno@escola.com", "professor@escola.com"};

    }
    // Métodos

        // Métodos devem ser nomeados com verbos, primeira letra minúscula exceto por cada palavra composta. As outras regras são as mesmas para variáveis.
   
        // somar(){}, abrirConexao(){}, concluirProcessamento(){}, findById (int id){}, calcularImprimir(){}
    
}
