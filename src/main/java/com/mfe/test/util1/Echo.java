package com.mfe.test.util1;

import org.apache.log4j.Logger;

/**
 * Created by minichen on 2017/1/4.
 */
public class Echo {
    private static Logger logger = Logger.getLogger(Echo.class);
    static public String sayHello(){
        logger.debug("sayHello debug");
        return "Hello world!";
    }
}
