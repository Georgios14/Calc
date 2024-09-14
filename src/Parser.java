import java.util.List;

public class Parser {

    static void parse(List<Double> numbersList, List<String> symbolsList,String equation){

        int index = 0;

        for (int i=0;i<equation.length();i++){

            if(equation.charAt(i)=='*' || equation.charAt(i)=='/' || equation.charAt(i)=='+' || equation.charAt(i)=='-'){

                String listAddition = equation.substring(index,i);
                numbersList.add(Double.valueOf(listAddition));
                symbolsList.add(String.valueOf(equation.charAt(i)));

                index = i+1;

            }

        }

        String listAddition = equation.substring(index);
        numbersList.add(Double.valueOf(listAddition));

    }

}
