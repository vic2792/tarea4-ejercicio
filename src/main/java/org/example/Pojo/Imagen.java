package org.example.Pojo;

import java.util.Objects;

public class Imagen extends Archivo {
    private int height;
    private int width;

    public Imagen(int size, String path, int height, int width) {
        super(size, path);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Imagen imagen = (Imagen) o;
        return height == imagen.height && width == imagen.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }

    public void open() {
        super.open();
        System.out.println("su altura es " + height +  " y su ancho es " + width);
    }
}
