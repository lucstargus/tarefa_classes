public class MontagemComputador {
    public static void main(String args[]) {
        System.out.println("Bem Vindo ao Sistema de Montagem de Computadores");
        Computador computador =  new Computador();

        //Código responsável pela Escolha de peças do Objeto (computador)
        computador.setGabinete("T-Dagger Cube");
        computador.setPlacaMae("B550M AORUS Elite");
        computador.setProcessador("Ryzen 7 5800x");
        computador.setMemoriaRam(32);

        //Código responsável pela confirmação de peças escolhidas
        System.out.println(computador.getGabinete());
        System.out.println(computador.getPlacaMae());
        System.out.println(computador.getProcessador());
        System.out.println(computador.getMemoriaRam() + "GB RAM" );
    }
}
