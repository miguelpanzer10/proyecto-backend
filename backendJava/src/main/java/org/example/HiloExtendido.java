package org.example;

import java.util.logging.Logger;

public class HiloExtendido extends Thread {
    private Logger logger;
    public HiloExtendido(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void run() {
        logger.info(Thread.currentThread().getName()+" ha sido creado y se encuentra en estado "+Thread.currentThread().getState()+"\n---------------------------------------------------------------");
    }
}
