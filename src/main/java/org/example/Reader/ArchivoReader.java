package org.example.Reader;

import org.example.Pojo.Archivo;

import java.util.Objects;
import java.util.Scanner;

public class ArchivoReader implements Reader<Archivo> {
    Scanner scanner;

    public ArchivoReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ArchivoReader that = (ArchivoReader) o;
        return Objects.equals(scanner, that.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(scanner);
    }

    public Archivo read() {
        scanner = new Scanner(System.in);
        System.out.println("dame el tamaño");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("dame la ruta del archivo");
        String path = scanner.nextLine();

        Archivo archivo = new Archivo(size, path);
        return archivo;

    }
}
