package it.uniparthenope.informatica.prgriii9.l10;

import java.util.Properties;

public class Properties01 {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.list(System.out);
    }
}
