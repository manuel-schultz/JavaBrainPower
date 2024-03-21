import java.util.ArrayList;
import java.util.List;

public class MathProblem {
    private List<Integer> numbers = new ArrayList<Integer>();
    private List<String> operators = new ArrayList<String>();
    private String problem;
    private Double result;

    public String getProblem() {
        return problem;
    }

    public Double getResult() {
        return result;
    }

    public MathProblem generateLevel1Problem() {
        ExerciseMath exm = new ExerciseMath();
        String[] allowedOperators = {"+", "-"};

        // Filling the numbers with between 2 and 4 numbers up to 100.
        for (Integer i = 0; i < exm.generateRandomNumber(2, 4); i++) {
            numbers.add(exm.generateRandomNumber(0, 100));
        }

        // Generate operators for the mathproblem.
        generateMathproblemOperators(allowedOperators);

        // Fill the problemstring with the mathproblem.
        generateProblemString();

        // Calculate the result of the mathproblem.
        calculateProblemResult();

        System.out.println(this);
        return this;
    }

    public MathProblem generateLevel2Problem() {
        ExerciseMath exm = new ExerciseMath();
        String[] allowedOperators = { "+", "-" };

        // Filling the numbers with between 3 and 8 numbers from -100 up to 100.
        for (Integer i = 0; i < exm.generateRandomNumber(3, 8); i++) {
            numbers.add(exm.generateRandomNumber(-100, 100));
        }

        // Generate operators for the mathproblem.
        generateMathproblemOperators(allowedOperators);

        // Fill the problemstring with the mathproblem.
        generateProblemString();

        // Calculate the result of the mathproblem.
        calculateProblemResult();

        return this;
    }

    private void generateMathproblemOperators(String[] allowedList) {
        ExerciseMath exm = new ExerciseMath();

        // Filling the operators with operators.
        for (Integer i = 1; i < numbers.size(); i++) {
            operators.add(exm.chooseRandomString(allowedList));
        }
    }

    private void generateProblemString() {
        String problemString = "";

        // Fill the problemstring with the mathproblem.
        for (Integer i = 0; i < numbers.size(); i++) {
            problemString += Integer.toString(numbers.get(i));
            if (i != numbers.size() - 1) {
                problemString += " " + operators.get(i) + " ";
            }
        }
        problem = problemString;
    }

    private void calculateProblemResult() {
        Integer partialResult;

        // Calculate the Result of the problem.
        partialResult = numbers.get(0);
        for (Integer i = 1; i < numbers.size(); i++) {
            if (operators.get(i - 1) == "+") {
                partialResult += numbers.get(i);
            } else if (operators.get(i - 1) == "-") {
                partialResult -= numbers.get(i);
            }
        }
        result = (double) partialResult;

    }
}