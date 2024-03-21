package kurisu.code.designpatterns;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMdFiles {
    private static List<String> titles = new ArrayList<>();
    private static List<String> content = new ArrayList<>();

    public static void main(String[] args) {

        String path = "/home/chris/doc/code/design-patterns";
        File directory = new File(path);

        if (!directory.isDirectory()) {
            System.out.println("Error: Provided path is not a directory.");
            return;
        }

        for (File file : directory.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".md")) {
                try {
                    System.out.println("Reading file: " + file.getName());
                    readMarkdown(file);
                } catch (Exception e) {
                    System.err.println("Error reading file: " + file.getName() + ". Exception: " + e.getMessage());
                }
            }
        }

        for (int i = 0; i < titles.size(); i++) {
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println(titles.get(i));
            System.out.println();
            System.out.println(content.get(i));
        }
    }

    private static void readMarkdown(File file) throws Exception {        
        StringBuilder currentContent = new StringBuilder("");

        List<String> lines = readFileInReverse(file);

        for (String line : lines) {
            if (line.trim().startsWith("# ")) {
                titles.add(line);
                content.add(currentContent.toString());
                currentContent = new StringBuilder("");
            } else {
                currentContent.append(line).append("\n");
            }
        }
    }

    private static List<String> readFileInReverse(File file) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        Collections.reverse(lines);
        return lines;
    }

}
