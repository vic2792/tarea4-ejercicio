package org.example.Pojo;

import java.util.Objects;

public class Texto extends Archivo {
    private String text;

    public Texto(int size, String path, String text) {
        super(size, path);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Texto texto = (Texto) o;
        return Objects.equals(text, texto.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }
    public void open() {
        super.open();
        System.out.println("el texto contiene " + text);
    }

}
