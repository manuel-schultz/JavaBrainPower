public class App {
    public static void main(String[] args) throws Exception {
        new App().testSystem();
        

    }

    public void testSystem() {
        ExerciseMath em = new ExerciseMath();
        em.setLevel(1);
        em.setLevel(2);

        MathProblem problem = em.generateExample();
        System.out.println(problem.getProblem());
        System.out.println(problem.getResult());
    }
}
