package validation;
import java.io.IOException;
public class ValidatePollutionLevel {
    public static void validatepollutionLevel(double pollutionLevel) throws IOException {
        if (pollutionLevel > 20) {
            throw new IOException("Pollution level is very High");
        }
    }
}
