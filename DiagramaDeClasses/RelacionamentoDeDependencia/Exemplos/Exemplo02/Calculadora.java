class Calculadora {

    public int somar(int a, int b, Logger logger){
        
        int resultado = a+b;
        logger.log("Soma realizada: " + a + " + " + b + " = " + resultado);
        return resultado;
        
    }
    
}