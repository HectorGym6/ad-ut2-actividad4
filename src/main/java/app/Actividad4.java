package app;

import service.FileService;

import java.io.IOException;

public class Actividad4 {
    private static  final String PATH = "/hect/descargas/enteros.dat";

    public static void main(String[] args) throws IOException {
        FileService fileService = new FileService();
        //Insertar el numero en la direcccion de enteros.dat
        fileService.insertIntegerInDataStreamFile(PATH);    }
}
