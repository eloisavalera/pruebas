package io;

import java.io.*;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("/home/theasker/Escritorio/DAW/programacion/pruebas/src/io/xanadu.txt")));

            while (s.hasNext()) {
              // asigna un delimitador diferente para scanner en vez del espacio que tiene por defecto
              s.useDelimiter(",\\s*");
              System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
