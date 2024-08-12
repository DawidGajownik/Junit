package pl.coderslab.tydzien2.z4jUnitUzupełnienie;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

class XmlProcessorTest {

    @Test
    @Timeout(value = 8, unit = TimeUnit.SECONDS)
    void processXmlFiles() throws IOException {
        XmlProcessor xmlProcessor = new XmlProcessor();
        Path path = Files.createTempDirectory("xmlTest");
        Files.createFile(path.resolve("1.xml"));
        Files.createFile(path.resolve("2.xml"));
        Files.createFile(path.resolve("3.xml"));
        Files.createFile(path.resolve("4.xml"));
        Files.createFile(path.resolve("5.xml"));
        Files.createFile(path.resolve("6.xml"));
        Files.createFile(path.resolve("7.xml"));
        Files.createFile(path.resolve("8.xml"));

        xmlProcessor.processXmlFiles(path.toString());
    }
}