package io;
import java.io.*;
import java.util.ArrayList;
public class EjemploArchivos {
    public static void main(String[] args) {
        //crear la lista
        ArrayList listaDeObjetosPersona = new ArrayList();
        //crear un ObjetoPersona para meter en la lista
        ObjetoCliente carlos = new ObjetoCliente("carlos", 34);
        //añadir el ObjetoPersona a la lista
        listaDeObjetosPersona.add(carlos);
        String path = "/home/theasker/Escritorio/DAW/programacion/pruebas/src/io/archivo.txt";
        try {
            FileOutputStream archivoSalida = new FileOutputStream(path);
            ObjectOutputStream flujoSalida = new ObjectOutputStream(archivoSalida);
            //escribo en el archivo el objeto completo
            flujoSalida.writeObject(listaDeObjetosPersona);
            //cierro tanto el flujo como el FileOutputStream
            flujoSalida.close();
            archivoSalida.close();
        } catch (Exception ex) {
        }
        try {
            //creo el objeto ArrayList que recibirá los datos escritos en el archivo
            ArrayList otraLista = new ArrayList();
            FileInputStream archivoEntrada = new FileInputStream(path);
            ObjectInputStream flujoEntrada = new ObjectInputStream(archivoEntrada);
            //obligo a que el objeto que me devuelve el método readObjetc() se convierta a un objeto del tipo ArrayList
            otraLista = (ArrayList) flujoEntrada.readObject();
            //obligo a que el objeto que me devuelve el método get() se convierta a un objeto del tipo ObjetoCliente
            ObjetoCliente otraPersona = (ObjetoCliente) otraLista.get(0);
            //compruebo que todo ha ido bien mostrando la información del ObjetoCliente
            System.out.println(otraPersona.toString());
        } catch (Exception ex) {
        }
    }
}
class ObjetoCliente implements Serializable{
    String nombre;
    int edad;
    public ObjetoCliente(String n, int e) {
        this.nombre = n;
        this.edad = e;
    }
    @Override
    public String toString() {
        return "ObjetoPersona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}