package com.group;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaApp {

    private static Logger logger = LoggerFactory.getLogger(JavaApp.class);

    public static void main(String[] args) {
        System.out.println("hello, world!");
        logger.info("App Finished.");
    }

}