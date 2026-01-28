package org.example.Pojo;

import javax.xml.xpath.XPath;
import java.util.Objects;

public class Archivo {
    private int size;
    private String path;

    public Archivo(int size, String path) {
        this.size = size;
        this.path = path;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Archivo archivo = (Archivo) o;
        return size == archivo.size && Objects.equals(path, archivo.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, path);
    }

    public void open() {
        System.out.println("el tamaño del archivo es " + size + "y su path es "+ path);
    }

    public void move(String newPath) {
        if (newPath == path) {
            System.out.println("no hay cambios");
        } else  {
            path = newPath;
            System.out.println("se ha movido el fichero " + newPath);
        }



    }
}
