class Main{

    public static void main(String[] args){
        
        Interruptor inter = new Interruptor();
        Lampada lamp = new Lampada();

        System.out.println(lamp.getStatus());
        inter.acionar(lamp);
        System.out.println(lamp.getStatus());

        lamp.setStatus(true);
        inter.acionar(lamp);
        System.out.println(lamp.getStatus());

    }

}