package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger logger = null;
    private String lasLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String log) {
        lasLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLasLog() {
        return lasLog;
    }
}
