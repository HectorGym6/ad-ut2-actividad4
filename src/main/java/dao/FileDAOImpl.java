package dao;


import java.io.*;

public class FileDAOImpl implements FileDao {

    @Override
    public File[] listFiles(String directorio) {
        File path = new File(directorio);
        return path.listFiles();
    }

    @Override
    public void rename(File file, String name) {
        file.renameTo(new File(name));
    }

    @Override
    public void insertTextIntoFile(File file, String text) {
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readTextInFile(File file, String text) {
        try (FileReader fileReader = new FileReader(file);
             BufferedReader br = new BufferedReader(fileReader)){
            String line;
            System.out.printf("Lectura del fichero %s: \n", file.getName());
            while((line=br.readLine())!=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void showDataStreamFile(File file) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")){
            randomAccessFile.seek(0);
            while (!isEOF(randomAccessFile)) {
                int entero = randomAccessFile.readInt();
                System.out.println(entero);
                if (isEOF(randomAccessFile)){
                    System.out.println("FIN de fichero");
                }
            }
        } catch (EOFException e) {
            System.err.println("FIN de fichero");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void insertIntoDataStreamFile(int number, File file) throws IOException {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.writeInt(number);
        }
    }

    private static boolean isEOF(RandomAccessFile randomAccessFile) throws IOException {
        return randomAccessFile.length() == randomAccessFile.getFilePointer();
    }

}