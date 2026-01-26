package org.example.Pojo;

import java.util.Objects;

public class Audio extends Archivo{
    private int duration;

    public Audio(int size, String path, int duration) {
        super(size, path);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Audio audio = (Audio) o;
        return duration == audio.duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration);
    }

    @Override
    public void open() {
        super.open(); //llamar al open de la clase padre (archivo)
        System.out.println("su duracion es " + duration );
    }
}
