package calculadora;

public class TesteCalculadora {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //Testes rápidos
        calc.calc(2, 3, "+");  // esperando 5
        calc.calc(10, 4, "-"); // esperando 6
        calc.calc(3, 5, "*");  // esperando 15
        calc.calc(8, 2, "/");  // esperando 4
        calc.calc(8, 0, "/");  // divisão por zero
        calc.calc(5, 5, "x");  // operação inválida
    }
}