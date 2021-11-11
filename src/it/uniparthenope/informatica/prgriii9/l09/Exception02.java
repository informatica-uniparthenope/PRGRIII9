package it.uniparthenope.informatica.prgriii9.l09;

public class Exception02 {

    public static void main(String[] args) {

            double sum = 0.0;
            for (String arg : args) {
                try {
                    sum = sum + Double.parseDouble(arg);
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Sum=" + sum);

    }

}
