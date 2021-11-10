package it.uniparthenope.informatica.prgriii9.l10;

import java.io.*;

public class BufferedStreams01 {
    public static void main(String[] args) {
        try {
            FileReader input = new FileReader(args[0]);
            BufferedReader bufInput = new BufferedReader(input);

            try {
                FileWriter output = new FileWriter(args[1]);
                BufferedWriter bufOutput= new BufferedWriter(output);

                try {
                    String line;

                    // read the first line
                    line = bufInput.readLine();
                    while ( line != null ) {
                        // write the line out to the output file
                        bufOutput.write(line, 0, line.length());
                        bufOutput.newLine();

                        // read the next line
                        line = bufInput.readLine();
                    }
                } finally {
                    bufOutput.close();
                }
            } finally {
                bufInput.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}