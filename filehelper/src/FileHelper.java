import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileHelper {
    private static final Logger logger = LogManager.getLogger(FileHelper.class);

    public void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            logger.info("Successfully wrote to the file.");
        } catch (IOException e) {
            logger.error("An error occurred while writing to the file.", e);
        }
    }
}