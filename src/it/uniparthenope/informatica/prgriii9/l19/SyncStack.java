package it.uniparthenope.informatica.prgriii9.l19;

import java.util.ArrayList;
import java.util.List;

public class SyncStack {
    private List<Character> buffer = new ArrayList<Character>(400);

    public synchronized char pop() {
        char c;
        while (buffer.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                // ignore it...
            }
        }

        c = buffer.remove(buffer.size()-1);
        return c;
    }

    public synchronized void push(char c) {
        this.notify();
        buffer.add(c);
    }

}
