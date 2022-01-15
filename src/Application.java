public class Application {
    public static void main(String[] args) {
        BMICalculator calculator = new BMICalculator();
        float myBmi = calculator.calculateBmi(105f,182f);
        System.out.println(myBmi);
    }
}
