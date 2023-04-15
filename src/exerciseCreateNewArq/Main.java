package exerciseCreateNewArq;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) throws IOException {

        creNewArq("C:\\Users\\rafaw\\OneDrive\\Documentos");


    }

    private static void creNewArq(String path) throws IOException {

        LocalDateTime l1 = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm.ms");

        Path p1 = Paths.get(path);
        //Como a criacao é Data e hora atual do sistema. Existem regras de criacao do arquivo que devem ser seguidas.
        //Ex: Não pode :,/ no nome do Arquivo
        Files.createFile(p1.resolve("file_Data e Hora_"+ l1.format(dateTimeFormatter) +".txt"));
        System.out.println("Arquivo criado com Sucesso");

    }

}
