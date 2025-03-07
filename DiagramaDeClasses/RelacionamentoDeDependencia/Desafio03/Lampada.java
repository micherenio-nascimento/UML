class Lampada {

    // false por padrão!
    private boolean status;

    public boolean ligar() {
        this.status = true;
        return this.status;
    }

    public boolean desligar() {
        this.status = false;
        return this.status;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(Boolean nv){
        this.status = nv;
    }
    
}