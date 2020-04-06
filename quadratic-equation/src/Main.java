import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String REGULAR_EXPRESSION = "(-?\\d+(\\.\\d+)?)";

    public static void main(String[] arg) {
        try {
            Scanner scanner = new Scanner(System.in);
            List<Double> coefficients = new ArrayList<>();
            System.out.println("Write the coefficients of the equation in following form: (a, b, c)");
            String equationString = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGULAR_EXPRESSION);
            Matcher matcher = pattern.matcher(equationString);
            while (matcher.find()) {
                coefficients.add(Double.parseDouble(matcher.group()));
            }

            if (coefficients.size() != 3) {
                throw (new IllegalArgumentException("Not correct coefficients form."));
            }

            QuadraticEquation quadraticEquation =
                    new QuadraticEquation(coefficients.get(0), coefficients.get(1), coefficients.get(2));
            quadraticEquation.solve();

            System.out.println("First root: " + quadraticEquation.getFirstRoot() +
                    "\nSecond root: " + quadraticEquation.getSecondRoot());
        } catch (NegativeDiscriminantException | IllegalArgumentException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
