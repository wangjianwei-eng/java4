package shiyan4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class FileUtil {
	public static synchronized String readFile(String path) throws IOException {
        File f = new File(path);
        if (!f.exists() || !f.isFile()) {
            return null;
        }
        StringBuilder contents = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
            String line;
            boolean firstLine = true;
            while ((line = bufferedReader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                } else {
                    contents.append("\n");
                }
                contents.append(line);
            }
        }
        return contents.toString();
    }
	public static synchronized void touch(String path) {
        File f = new File(path);
        if (f.exists()) {
            return;
        }
        try {
            f.createNewFile();
        } catch (IOException ignored) {     
        }
	}
	 public static synchronized void writeFile(String path, String[] lines) {
	        touch(path);
	        try (PrintStream ps = new PrintStream(path)) {
	            for (String line : lines) {
	                ps.println(line);
	            }
	        } catch (FileNotFoundException ignored) {
	        }
	    }
	}
