package pl.coderslab.tydzien1.z6parametryzowanieTestów;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TextFormatterTest {

    @ParameterizedTest
    @CsvSource({
            "'    hello',          'hello'",
            "'hello    ',          'hello'",
            "'hello  world',       'hello world'",
            "'hello\\tworld',      'hello world'",
            "'hello\\t\\tworld',   'hello world'",
            "'hello\\nworld',      'hello world'",
            "'hello\\n\\nworld',   'hello world'"
    })
    void format(String source, String expected) {
        source = processEscapes(source);
        assertEquals(expected, TextFormatter.format(source));
    }

    private String processEscapes(String text) {
        return text.replace("\\t", "\t")
                .replace("\\n", "\n");
    }
}