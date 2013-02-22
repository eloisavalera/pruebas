
package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
  public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;
        
        try {
            inputStream = new FileReader("/home/theasker/Escritorio/DAW/programacion/pruebas/src/io/xanadu.txt");
            outputStream = new FileWriter("/home/theasker/Escritorio/DAW/programacion/pruebas/src/io/characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
