public class BMICalculator {

        public float calculateBmi(float weight,float height) {
        if (weight <= 0 || weight >= 300) {
            System.out.println("weight is not correct, should be positive from 1 to 299 kg");
            return -1;
        }
        if (height <= 40 || height >= 300) {
            System.out.println("height is not correct , should be positive from 41 to 299 cm");
            return -1;
        }
        height = height / 100;
        return weight / (height * height);

    }
}

