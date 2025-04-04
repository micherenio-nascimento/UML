public class Main {

    public static void main(String[] args) {
        
        Logger logger = new Logger();
        Calculadora calc = new Calculadora();

        int resultado = calc.somar(5, 3, logger);
        System.out.println("Resultado: " + resultado);

    }
    
}