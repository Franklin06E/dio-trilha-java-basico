package Anatomia004;
// Aula 4 - Anatomia de Classes 4
// Exemplo de código não identado, resultando em um código difícil de ler e entender
/*
public class BoletimEstudantil004 {
    public static void main(String[] args) {
    int mediaFinal = ;
    if(mediaFinal<6)	
    System.out.println("REPROVADO"); 
    else if(mediaFinal==6)
    System.out.println("PROVA MINERVA"); 
    else
    System.out.println("APROVADO"); 		
    }
    }
*/
// Exemplo de código identado, resultando em um código fácil de ler e entender
public class BoletimEstudantil004 {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else 
            System.out.println("APROVADO");
        
    }
}