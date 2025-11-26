package calculadora;

/**
 * <p>Classe de teste para a aplicação Calculadora.</p>
 *
 * <p>Esta classe contém o método principal responsável por criar uma instância
 * da classe {@code Calculadora} e executar diferentes operações matemáticas
 * utilizando o método {@code calcular}.</p>
 *
 * <p>Também são realizados testes com operadores inválidos e divisões por zero,
 * demonstrando o tratamento de exceções geradas pela calculadora.</p>
 */
public class TesteCalculadora {
    
    /**
     * <p>Método principal da aplicação.</p>
     *
     * <p>Executa exemplos de operações válidas e captura exceções resultantes
     * de operações inválidas, como divisão por zero ou operador desconhecido.</p>
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); //exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); //exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}