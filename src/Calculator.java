import java.util.List;

public class Calculator{

    public void Calculate(List<Double> numbersList, List<String> symbolsList){


        while(!symbolsList.isEmpty()) {
            for (int i = 0; i < symbolsList.size(); i++) {

                String symbol = symbolsList.get(i);

                if (symbol.equals("*")) {

                    numbersList.set(i + 1, Mult(numbersList.get(i), numbersList.get(i + 1)));
                    symbolsList.remove(i);
                    numbersList.remove(i);

                    break;
                }
                if (symbol.equals("/")) {

                    numbersList.set(i + 1, Div(numbersList.get(i), numbersList.get(i + 1)));

                    symbolsList.remove(i);
                    numbersList.remove(i);

                    break;
                }
                if (symbol.equals("+") && (!symbolsList.contains("*") && !symbolsList.contains("/"))) {

                    numbersList.set(i + 1, Add(numbersList.get(i), numbersList.get(i + 1)));

                    symbolsList.remove(i);
                    numbersList.remove(i);

                    break;
                }
                if (symbol.equals("-") && (!symbolsList.contains("*") && !symbolsList.contains("/"))) {

                    numbersList.set(i + 1, Sub(numbersList.get(i), numbersList.get(i + 1)));

                    symbolsList.remove(i);
                    numbersList.remove(i);

                    break;
                }

            }
        }

    }

    static Double Add(Double num1, Double num2){

        return num1 + num2;

    }

    static Double Sub(Double num1, Double num2){

        return num1 - num2;

    }

    static Double Div(Double num1, Double num2){

        return num1 / num2;

    }

    static Double Mult(Double num1, Double num2){

        return num1 * num2;

    }

}
