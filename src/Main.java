// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        double heightMetr = 1.87;

            System.out.println (service.calculate(weightKg,heightMetr));
        }
    }
