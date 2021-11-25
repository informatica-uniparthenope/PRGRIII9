package it.uniparthenope.informatica.prgriii9.l19;

import java.util.ArrayList;
import java.util.List;

public class SynchTestWithSteroids {
    public static void main(String[] args) {
        SyncStack stack = new SyncStack();
        int items = 500;
        int nP = 5;
        int nC = 5;

        for (int i=0;i<nP;i++) {
            Producer p = new Producer(stack,items);
            Thread prodT = new Thread (p);
            prodT.start();
        }

        for (int i=0;i<nC;i++) {
            Consumer c = new Consumer(stack, items);
            Thread prodT = new Thread (c);
            prodT.start();
        }
    }
}
