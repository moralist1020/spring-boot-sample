package com.james.sample.log4j2.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Logger 日志记录
 *
 * 级别：TRACE < DEBUG < INFO < WARN < ERROR < FATAL
 *
 * Created by James on 2017/5/11.
 */
public class L {

    private static final Logger LOGGER = LogManager.getLogger();

    private L() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static Logger getLogger(){
        return LOGGER;
    }

    public static void t(String msg) {
        LOGGER.trace(msg);
    }

    public static void d(String msg) {
        LOGGER.debug(msg);
    }

    public static void i(String msg) {
        LOGGER.info(msg);
    }

    public static void w(String msg) {
        LOGGER.warn(msg);
    }

    public static void e(String msg) {
        LOGGER.error(msg);
    }

    public static void f(String msg) {
        LOGGER.fatal(msg);
    }
}
