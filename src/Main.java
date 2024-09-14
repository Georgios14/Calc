import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String equation;

        System.out.println("\nEnter an equation:");
        Reader reader = new Reader();
        equation = reader.readEquation();

        List<Double> numbers = new LinkedList<>();
        List<String> symbols = new LinkedList<>();

        Parser parser = new Parser();

        parser.parse(numbers,symbols,equation);

        Calculator calculator = new Calculator();

        calculator.Calculate(numbers,symbols);

        System.out.println("Solution: " + numbers.get(0));
    }
}