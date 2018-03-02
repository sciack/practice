

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Convert this file to Kotlin, then alter the code to use the Kotlin expressions instead of assignment:
 * let, when, if, try, apply, run, with, also, use
 *
 * Can you reduce the entire function to a single expression with no return statement?
 */
public class FileContents {
    public List<String> contentsOf(String csvFileNames) throws IOException {
        String[] fileNames = csvFileNames.split(",");
        List<String> allContents = new ArrayList<>();

        for (String fileName : fileNames) {
            File f;
            if(!fileName.endsWith(".txt"))
                f = new File(fileName + ".txt");
            else {
                f = new File(fileName);
            }

            String outputContent;
            if(!f.exists()) {
                try {
                    f.createNewFile();
                    outputContent = "<empty>";
                } catch (IOException e) {
                    outputContent = "<could not create>";
                }
            } else {
                outputContent = Files.readAllLines(f.toPath()).stream().collect(Collectors.joining(","));
            }
            allContents.add(fileName + ":" + outputContent);
        }
        return allContents;
    }
}
