

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;

// let,
// run,
// with,
// also,

/**
 * This class calculates the set of all characters in a particular input file.
 *
 * Convert this file to Kotlin, then alter the code to use the Kotlin expressions instead of assignment:
 * let, when, if, try, apply, run, with, also, use
 *
 * Can you reduce the entire function to a single expression with no return statement?
 */
public class CharacterReader {
    public Set<Character> readCharactersFrom(String filename) {
        try {
            File file = new File(filename);
            Reader reader = new FileReader(file);

            HashSet<Character> characters = new HashSet<>();

            try {
                while (true) {
                    int read = reader.read();
                    if (read == -1) break;
                    characters.add((char) read);
                }
            } finally {
                reader.close();
            }

            return characters;
        } catch (Exception e) {
            return new HashSet<>();
        }
    }
}
