import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 5);

        FileHelper fileHelper = new FileHelper();
        fileHelper.writeToFile("result.txt", "Result: " + result);

        logger.info("Calculation completed. Result: " + result);
    }
}