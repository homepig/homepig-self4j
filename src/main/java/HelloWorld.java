import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        //{}占位符
        logger.info("Hello World {}",new Date());
    }
}
