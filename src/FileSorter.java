import java.io.File;

public class FileSorter {
    private File file;
    private File sourceDir;

    public FileSorter(String filePath, String sourcePath) {
        file = new File(filePath);
        sourceDir = new File(sourcePath);
    }

    public void sort() {
        createDir();
        movingFile();
    }

    private String getFileExtension() {
        String fileName = file.getName();
        int lastIndexOf = fileName.lastIndexOf('.');

        if (lastIndexOf == -1) {
            return null;
        }

        return fileName.substring(lastIndexOf + 1);
    }

    private void createDir() {
        String path = sourceDir.getPath() + "/" + getFileExtension();
        File newDir = new File(path);
        newDir.mkdir();
    }

    private void movingFile() {
        String name = file.getName();
        String path = sourceDir + "/" + getFileExtension() + "/" + name;
        file.renameTo(new File(path));
    }
}