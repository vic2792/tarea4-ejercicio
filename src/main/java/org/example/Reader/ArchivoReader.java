package org.example.Reader;

import org.example.Pojo.Archivo;

import java.util.Scanner;

public class ArchivoReader implements Reader<Archivo> {
    Scanner scanner;

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
