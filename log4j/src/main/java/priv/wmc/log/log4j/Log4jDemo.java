package priv.wmc.log.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author Wang Mincong
 * @date 2020-09-20 17:32:06
 */
public class Log4jDemo {

    private final Logger rootLogger = Logger.getRootLogger();
    private final Logger logger = Logger.getLogger(Log4jDemo.class);
    private final Logger infoLevelLogger = Logger.getLogger("infoLevelLogger");

    public Log4jDemo() {
        rootLogger.debug("rootLogger: debug!");
        rootLogger.info("rootLogger: info!");
        rootLogger.warn("rootLogger: warn!");
        rootLogger.error("rootLogger: error!");

        logger.debug("logger: debug!");
        logger.info("logger: info!");
        logger.warn("logger: warn!");
        logger.error("logger: error!");
//
        infoLevelLogger.debug("infoLevelLogger: debug!");
        infoLevelLogger.info("infoLevelLogger: info!");
        infoLevelLogger.warn("infoLevelLogger: warn!");
        infoLevelLogger.error("infoLevelLogger: error!");
    }

    public static void main(String[] args) {
        // 两个配置效果一样
//        PropertyConfigurator.configure("log4j/target/classes/log4j.properties");
        PropertyConfigurator.configure("log4j/target/classes/log4j.xml");
        new Log4jDemo();
    }

}
