class Sensor{

    private boolean status;

    Sensor(boolean s){
        this.status = s;
    }

    public boolean detectarMovimento(){
        return this.status;
    }

}