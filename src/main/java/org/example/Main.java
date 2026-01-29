package org.example;

import org.example.Pojo.Archivo;
import org.example.Pojo.Program;

import java.lang.reflect.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime una ruta");
        String path = scanner.nextLine();

        System.out.println("dime el nombre del fichero");
        String name = scanner.nextLine();

        System.out.println("dame el tamaño");
        int size = scanner.nextInt();
        scanner.nextLine();

        Archivo archivo = new Archivo(size, path);
        Archivo[] listArchivo = new Archivo[size];
        Program program = new Program<Archivo>(name, listArchivo);

        System.out.println("dime donde quieres que lo mueva");
        String outpath = scanner.nextLine();
        program.execute(outpath);

    }
}