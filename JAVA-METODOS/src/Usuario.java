public class Usuario {

    public static void main(String[] args) {
        
        // Criação do objeto Televisao
        Televisao televisao = new Televisao();

        System.out.println("Tv Ligada: " + televisao.ligada);
        System.out.println("Canal: " + televisao.canal);
        System.out.println("Volume: " + televisao.volume);

        // Ligando a TV
        televisao.botaoPower();

        // Aumentando e dimunindo o volume e o canal
        televisao.aumentarVolume();
        televisao.diminuirVolume();
        televisao.aumentarCanal();
        televisao.diminuirCanal();
        
        // Mudando o canal e o volume
        televisao.mudarCanal(5);
        televisao.mudarVolume(59);

        // Desligando a TV
        televisao.botaoPower();

        // Testando os métodos com a TV desligada
        System.out.println("Tv Ligada: " + televisao.ligada);
        televisao.aumentarVolume();
        televisao.diminuirVolume();
        televisao.aumentarCanal();
        televisao.diminuirCanal();
        televisao.mudarCanal(10);
        televisao.mudarVolume(10);
    }
    
}
