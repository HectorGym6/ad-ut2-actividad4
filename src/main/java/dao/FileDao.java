package dao;

import java.io.File;
import java.io.IOException;

public interface FileDao {

    public File[] listFiles(String directory);

    void rename(File file, String name);

    void insertIntoDataStreamFile(int numero, File file) throws IOException;

    void showDataStreamFile(File file);

    void insertTextIntoFile(File file, String text);

    void readTextInFile(File file, String text);
}