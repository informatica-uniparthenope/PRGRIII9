package it.uniparthenope.informatica.prgriii9.l09;

public class Exception01 {
    public static void main(String[] args) {
        try {
            double sum = 0.0;
            for (String arg : args) {
                sum = sum + Double.parseDouble(arg);
            }
            System.out.println("Sum=" + sum);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
