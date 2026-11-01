package org.example;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main{
    private static Logger logger = Logger.getLogger("Mi Log");
    private static SimpleFormatter simpleFormatter =  new SimpleFormatter();

    public static void main(String[] args) throws IOException {
        //Ruta para escribir archivo log
        FileHandler fh = new FileHandler("C:\\Users\\danie\\Documents\\2ºDAM\\PROYECTOS CLASE\\PROYECTO 1er TRIMESTRE\\Proyecto\\archivos-log\\archivo.log",false);
        logger.setLevel(Level.ALL);
        fh.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);//No se muestra por pantalla
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tF [%4$s] - %5$s%6$s%n");
        logger.addHandler(fh);
        fh.setFormatter(simpleFormatter);


        //Hilo creacion anónima
        Thread hilo1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    logger.info(Thread.currentThread().getName()+"\nEstado de "+Thread.currentThread().getName()+": "+Thread.currentThread().getState()+"\n---------------------------------------------------------------");
                    Thread.currentThread().join(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"Hilo Inicial");

        //Estado Inicial hilo1
        logger.info(Thread.currentThread().getName()+"\nEstado de "+hilo1.getName()+": "+hilo1.getState()+"\n---------------------------------------------------------------");

        //Iniciar Run del hilo 1
        hilo1.start();

        //Creacion Hilo Extendiendo Thread
        HiloExtendido hiloExtendido = new HiloExtendido(logger);
        //Iniciar Run del hilo 2
        hiloExtendido.start();

        //Creacion Hilo Lambda
        Thread hilo3 = new Thread(() ->{
            try {
                Thread.sleep(50);
                logger.info(Thread.currentThread().getName()+"\nEstado de "+hilo1.getName()+": "+hilo1.getState()+"\n---------------------------------------------------------------");
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        },"Hilo comprobar estado Hilo inicial");

        //Iniciar Run del hilo 3
        hilo3.start();



    }
}
