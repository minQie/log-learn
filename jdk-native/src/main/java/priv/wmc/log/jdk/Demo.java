package priv.wmc.log.jdk;

import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * 演示jdk自带的日志输出
 *
 * @author Wang Mincong
 * @date 2020-09-01 21:49:58
 */
public class Demo {

    public static final Logger logger = LogManager.getLogManager().getLogger("");

    public static void main(String[] args) {
        logger.info("我是一条日志");
    }
}
