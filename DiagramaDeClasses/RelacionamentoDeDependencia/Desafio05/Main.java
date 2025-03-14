class Main{

    public static void main(String[] args){

        Alarme alarm = new Alarme();
        Sensor sen = new Sensor(false);
        alarm.verificarAlerta(sen);
        
    }

}