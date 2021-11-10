package it.uniparthenope.informatica.prgriii9.l10;

public class CommandLineInterface01 {
    public static void main(String[] args) {
        for ( int i = 0; i < args.length; i++ ) {
            System.out.println("args[" + i + "] is ’" + args[i] + "’");
        }
    }
}
