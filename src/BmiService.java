public class BmiService {

    public int calculate(int weightKg, double heightMetr) {
        return(int) (weightKg / (heightMetr * heightMetr));
    }
}
