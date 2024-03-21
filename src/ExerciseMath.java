public class ExerciseMath extends Exercise {
    private MathProblem problemClass = new MathProblem();

    public MathProblem generateExample() {
        MathProblem problem;
        switch (this.getLevel()) {
            case 1:
                problem = problemClass.generateLevel1Problem();
                return problem;
            case 2:
                problem = problemClass.generateLevel2Problem();
                return problem;
            case 3:
                // Code here
                break;
            default:
                // Code here
                break;
        }
        return problemClass;
    }


}
