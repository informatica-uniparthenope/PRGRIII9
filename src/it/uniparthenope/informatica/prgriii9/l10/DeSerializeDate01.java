package it.uniparthenope.informatica.prgriii9.l10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class DeSerializeDate01 {
    DeSerializeDate01() {
        Date d = null;
        try {
            FileInputStream f = new FileInputStream ("date.ser");
            ObjectInputStream s = new ObjectInputStream (f);
            d = (Date) s.readObject ();
            s.close ();
        } catch (Exception e) {
            e.printStackTrace ();
        }

        System.out.println("Deserialized Date object from date.ser");
        System.out.println("Date: "+d);
    }

    public static void main (String args[]) {
        new DeSerializeDate01();
    }

}
