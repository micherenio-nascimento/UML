class Interruptor {

    public void acionar(Lampada l){

        var Atual = l.getStatus() == true ? l.desligar() : l.ligar();

        if(Atual == true){
            System.out.println("Lâmpada ligada!");
        } else {
            System.out.println("Lâmpada desligada!");
        }

    }
    
}