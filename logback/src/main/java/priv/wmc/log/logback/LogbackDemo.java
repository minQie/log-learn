package priv.wmc.log.logback;

import org.junit.Test;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.ansi.AnsiOutput.Enabled;

/**
 * @author 王敏聪
 * @date 2020-09-20 18:58:47
 */
public class LogbackDemo {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(LogbackDemo.class);

    @Test
    public void test() {
        // clr 为什么没有生效？原因：只要调试 ColorConverter 就可以发现，需要开启 spring 的一个配置，详见AnsiOutputApplicationListener
        // 最终定位到解决问题的代码如下（基于Spring的话默认是开启）
        AnsiOutput.setEnabled(Enabled.ALWAYS);

        // mine 中不同环境下日志应该有不同的关注点（提供多个选择）
        // 不要在mine项目的日志配置中写满基础笔记（转译到当前log项目中来 - 顺便整理一下）
        // 整理好之后，将规则统一应用到其他项目

        LOG.debug("debug");
        LOG.info("info");
        LOG.warn("warn");
        LOG.error("error");
    }

}
