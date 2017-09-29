import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld2 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld2.class);
        logger.debug("Hello World.");

        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        lc.setPackagingDataEnabled(true);
        StatusPrinter.print(lc);
    }
}
