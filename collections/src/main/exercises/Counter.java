import java.util.function.Consumer;

/**
 * Implement a simple lazy counter which:
 * - Count upwards starting with the seed.
 * - Starts a thread which terminates the stream after 500ms.
 * - Applies the consumer to each value in the stream.
 */
public interface Counter {
    void count(Integer seed, Consumer<Integer> consumer);
}

