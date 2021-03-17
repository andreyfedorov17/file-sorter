import java.io.File;

public class FileSorter {
    private File source;
    private File[] files;

    public FileSorter(String sourcePath) {
        source = new File(sourcePath);
        files = source.listFiles();
    }

    public void sorting() {
        createDirectories();
        movingFiles();
    }

    private String getFileExtension(String fileName) {
        int lastIndexOf = fileName.lastIndexOf('.');

        if (lastIndexOf == -1) {
            return "";
        }

        return fileName.substring(lastIndexOf + 1);
    }

    private void createDirectories() {
        for (File file : files) {
            String path = source.getPath() + "/" + getFileExtension(file.getName());
            File newDirectory = new File(path);

            if (!newDirectory.exists()) {
                newDirectory.mkdir();
            }
        }
    }

    private void movingFiles() {
        for (File file : files) {
            String path = source.getPath() + "/" + getFileExtension(file.getName()) + "/" + file.getName();
            file.renameTo(new File(path));
        }
    }
}