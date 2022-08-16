package fileIO;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileUtil {

    public boolean createFolder(final String path) {
        File f = new File(path);
        if (f.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }
//    public boolean createFolder(final String path) {
//        return new File(path).mkdirs();
//    }


    public boolean createFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    //if append true, text appended
    public boolean writeToFile(String filePath, String text, boolean append) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        try (OutputStream fileOutputStream = new FileOutputStream(file, append)) {
            fileOutputStream.write(text.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //return all child files
    public void content(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("File " + file.getName());
            File[] files = file.listFiles();
            for (File child : files) {
                content(child.getAbsolutePath());
            }
        } else {
            System.out.println("File " + file.getName());
        }
//        return null;

    }

    // copy source file to new path
    public boolean copyTo(String sourcePath, String toPath) {
        File sourceFile = new File(sourcePath);
        if (sourceFile.isDirectory()) {
            File[] child = sourceFile.listFiles();
            new File(toPath).mkdirs();
            for (File file : child) {
                copyTo(file.getAbsolutePath(), toPath + "\\" + file.getPath());
            }
        } else {
            copyFile(sourcePath, toPath);
        }
        return true;
    }

    public void copyFile(String sourcePath, String toPath) {
        try {
            Files.copy(Path.of(sourcePath), Path.of(toPath), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //վերադարձնել տվյալ հասցեով ֆայլի միջի պարունակությունը
    public static String txtContent(String path) {
        String content = "";
        try (InputStream inputStream = new FileInputStream(path)) {
            int charCode = inputStream.read();
            while (charCode != -1) {
                content += ((char) charCode);
                charCode = inputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }
}
