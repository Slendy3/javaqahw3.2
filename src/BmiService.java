public class BmiService {
    public int calculate(double metre, double kg) {
        double index = (kg / Math.pow(metre, 2));
        return (int)index;
    }
}
