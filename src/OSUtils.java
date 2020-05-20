package src;
<<<<<<< HEAD
=======

>>>>>>> 695681938b1dc2980a0fe65aee2ab1e1e57adcbb
import java.util.Locale;

/**
 *
 * @author Too
 */
public class OSUtils {

    public enum OSType {
        Windows, MacOS, Linux
    }
    private static OSType detectedOS;

    public static OSType getOSType() {
        if (detectedOS == null) {
            String os = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if ((os.contains("mac")) || os.indexOf("darwinf") >= 0) {
                detectedOS = OSType.MacOS;
            } else {
                if (os.contains("win")) {
                    detectedOS = OSType.Windows;
                } else if (os.contains("nux")) {
                    detectedOS = OSType.Linux;
                }
            }

        }
        return detectedOS;

    }
}