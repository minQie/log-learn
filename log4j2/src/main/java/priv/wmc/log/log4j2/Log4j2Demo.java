package priv.wmc.log.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Wang Mincong
 * @date 2020-09-20 17:54:36
 */
public class Log4j2Demo {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Current Time: {}", System.currentTimeMillis());
        logger.info("Current Time: " + System.currentTimeMillis());
        logger.info("Current Time: {}", System.currentTimeMillis());
        
        logger.trace("trace log");
        logger.debug("debug log");
        
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }
}
