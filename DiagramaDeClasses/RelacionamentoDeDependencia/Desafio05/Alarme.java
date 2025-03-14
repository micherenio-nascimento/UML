class Alarme {

    public void verificarAlerta(Sensor ss){

        if (ss.detectarMovimento() == true) {
            System.out.println("Alerta! Movimento detectado!");
        } else {
            System.out.println("Sem movimento");
        }
    }
    
}