package io;

import java.io.File;
import java.io.FileFilter;

public class FiltrosFicheros {
  public static void main(String[] args) {
        //para ver el contenido de la carpeta nbproject
        File f = new File("nbproject");
        //nbproject ¿es una carpeta?
        boolean b = f.isDirectory();
        System.out.println(b);
        //para ver todo el contenido de nbproject, bien sean carpetas bien sean archivos
        System.out.println("--------------");
        File[] listado = f.listFiles();
        for(File archivo : listado)
            System.out.println(archivo.getName());
        //para ver sólo los archivos con extension .xml
        System.out.println("--------------");
        FiltroXML filtro = new FiltroXML();
        listado = f.listFiles(filtro);
        for(File s : listado)
            System.out.println(s.getName());
    }
}

class FiltroXML implements FileFilter{

    //lo único que hay que hacer es decirle cuando el filtro devolverá verdadero, 
    //que es cuando la extension del mismo termine en xml
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().toLowerCase().endsWith(".xml");
    }
}
