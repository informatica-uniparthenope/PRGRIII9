package it.uniparthenope.informatica.prgriii9.l19;

public class Runner implements Runnable {
    private boolean timeToQuit=false;

    public void run() {

        while ( ! timeToQuit ) {
            // continue doing work
            System.out.println(Math.random());
        }
           // clean up before run() ends
    }

    public void stopRunning() {
        timeToQuit=true;
    }

}
