package uk.co.charliesay.helpers;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class FileHelperTest {

    @Test
    public void whenFileToString_ThenFileExists_ShouldBePresent() {
        Optional<String> s = FileHelper.fileToString("./src/test/resources/example-file-helper-parser.txt");

        assertTrue(s.isPresent());
    }

    @Test
    public void whenFileToString_ThenFileExists_ShouldMatchExpected() {
        Optional<String> s = FileHelper.fileToString("./src/test/resources/example-file-helper-parser.txt");
        String expected = "foobar";

        assertEquals(expected, s.get());
    }

    @Test
    public void whenFileToList_ThenFileExists_ShouldBePresent() {
        List<String> strings = FileHelper.fileToList("./src/test/resources/example-file-helper-parser.txt");
        String expected = "foobar";

        assertEquals(expected, strings.get(0));
    }

    @Test
    public void whenFileToIntegerList_ThenFileHasIntegers_ShouldConvert() {
        List<Integer> integerList = FileHelper.fileToIntegerList("./src/test/resources/number-helper.txt");

        assertEquals(123, integerList.get(0));
    }

}