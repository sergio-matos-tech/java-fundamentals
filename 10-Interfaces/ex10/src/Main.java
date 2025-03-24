import services.BrazilInterestService;
import services.InterestService;
import services.USAInterestService;

public class Main {
    public static void main(String[] args) {

        InterestService brazilInterestService = new BrazilInterestService(2.0);
        System.out.printf("R$%.2f\n", brazilInterestService.payment(200, 3));

        InterestService USAInterestService = new USAInterestService(1.0);
        System.out.printf("R$%.2f", USAInterestService.payment(200, 3));

    }
}