package validation;
import java.io.IOException;
import vehicle.Enum;
public class Validatecolor {
    public static void validatecolor(Enum color) throws IOException {
        if (color != color.WHITE && color != color.SILVER && color != color.BLACK && color != color.RED && color != color.BLUE) {
            throw new IOException("Invalid color");
        }
    }
}
