public class Televisao {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void botaoPower(){
        if (ligada) {
            ligada = false;
            System.out.println("Desligando a TV...");
        } else {
            ligada = true;
            System.out.println("Ligando a TV...");
        }
    }
    
    public void aumentarVolume() {
        if (ligada) {
            if (volume < 100) {
                volume++;
                System.out.println("Volume: " + volume);
            } else {
                System.out.println("Volume máximo atingido.");
            }
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume: " + volume);
            } else {
                System.out.println("Volume mínimo atingido.");
            }
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void aumentarCanal(){
        if (ligada) {
            canal++;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void diminuirCanal(){
        if (ligada) {
            canal--;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void mudarCanal(int novoCanal){
        if (ligada) {
            canal = novoCanal;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void mudarVolume(int novoVolume){
        if (ligada) {
            volume = novoVolume;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("A TV está desligada.");
        }
    }
} 
