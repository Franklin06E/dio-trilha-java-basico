public class Metodos001 {
    public static void main(String[] args) throws Exception {

    }

    // Métodos são as ações das aplicações, ou seja, o que a aplicação pode fazer.
        // Métodos são funções ou sub-rotinas que podem ser chamadas para executar uma tarefa específica.
        // O nome do método deve ser um verbo no infinitivo, ou seja, o que o método faz.
        // O nome composto deve ser escrito em camelCase, ou seja, a primeira palavra deve ser minúscula e as demais devem começar com letra maiúscula
        // O método deve ter uma finalidade real, e deve-se evitar métodos que não fazem nada ou que não têm um propósito claro.
        // Deve-se ter atenção se o método necessitará de um retorno ou parâmetros.
        // É importante pensar nos riscos de exceção dos métodos, ou seja, o que pode dar errado.
        // Exemplo: O método dividir pode gerar uma exceção se o segundo parâmetro for zero.

        public class MyClass {
	
            public double somar(int num1, int num2){
                //LOGICA - FINALIDADE DO MÉTODO
                return num1 + num2;
            }
            
            public void imprimir(String texto){
                //LOGICA - FINALIDADE DO MÉTODO
                //AQUI NÃO PRECISA DO RETURN
                //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
            }
            // throws Exception : indica que o método ao ser utilizado
            // poderá gerar uma exceção
            public double dividir(int dividendo, int divisor) throws Exception{}
            
            // este método não pode ser visto por outras classes no projeto
            private void metodoPrivado(){}
            
            //alguns equívocos estruturais
            public void validar(){
                //este método deveria retornar algum valor
                //no caso boolean (true ou false)
            }
            public void calcularEnviar(){
                //um método deve representar uma única responsabilidade
            }
            public void gravarCliente(String nome, String cpf, Integer telefone, ....){
                //este método tem a finalidade de gravar
                //informações de um cliente, por que não criar
                //um objeto cliente e passar como parâmetro ?
                //veja abaixo
            }
            public void gravarCliente(Cliente cliente){}
            //ou
            public void gravar(Cliente cliente){}
        }
        
}
