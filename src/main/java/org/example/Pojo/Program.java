package org.example.Pojo;

import java.util.Arrays;
import java.util.Objects;

public class Program<T extends Archivo> {
    private String name;
    private T[] files;

    public Program(String name, T[] files) {
        this.name = name;
        this.files = files;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T[] getFiles() {
        return files;
    }

    public void setFiles(T[] files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Program<?> program = (Program<?>) o;
        return Objects.equals(name, program.name) && Objects.deepEquals(files, program.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(files));
    }

    public void execute(String outputPath) {
        System.out.println("este el programa" + name);
        for (T file:files) {
            file.open();
            file.move(outputPath);
        }
    }
}
