package it.uniparthenope.informatica.prgriii9.l10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeDate01 {
    public SerializeDate01() {
        Date d = new Date ();

        try {
            FileOutputStream f = new FileOutputStream ("date.ser");
            ObjectOutputStream s = new ObjectOutputStream (f);
            s.writeObject (d);
            s.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    public static void main (String args[]) {
        new SerializeDate01();
    }
}
