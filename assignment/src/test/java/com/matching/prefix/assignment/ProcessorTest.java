package com.matching.prefix.assignment;

import com.matching.prefix.assignment.service.Processor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProcessorTest {

    private static final String TEST_SAMPLE_FILE = "test_prefixes.txt";
    private static final Processor processor = new Processor(TEST_SAMPLE_FILE);

    @Test
    public void shouldReturnPrefixForLowerCaseSearchText() {
        String expectedPrefix = "one";

        String actualPrefix = processor.findPrefix("one");
        Assertions.assertEquals(expectedPrefix, actualPrefix);

        actualPrefix = processor.findPrefix("oneandone");
        Assertions.assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    public void shouldReturnPrefixForUpperCaseSearchText() {
        String expectedPrefix = "ONE";

        String actualPrefix = processor.findPrefix("ONE");
        Assertions.assertEquals(expectedPrefix, actualPrefix);

        actualPrefix = processor.findPrefix("ONEANDONE");
        Assertions.assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    public void shouldReturnPrefixForLowerAndUpperCaseSearchText() {
        String expectedPrefix = "oNe";

        String actualPrefix = processor.findPrefix("oNe");
        Assertions.assertEquals(expectedPrefix, actualPrefix);

        actualPrefix = processor.findPrefix("oNeONE");
        Assertions.assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    public void shouldReturnPrefixForAlphanumericSearchText() {
        String expectedPrefix = "on1";

        String actualPrefix = processor.findPrefix("on1");
        Assertions.assertEquals(expectedPrefix, actualPrefix);

        actualPrefix = processor.findPrefix("on123");
        Assertions.assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    public void shouldReturnPrefixForNumericSearchText() {
        String expectedPrefix = "11";

        String actualPrefix = processor.findPrefix("11");
        Assertions.assertEquals(expectedPrefix, actualPrefix);

        actualPrefix = processor.findPrefix("1122");
        Assertions.assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    public void shouldNotReturnPrefixIfSearchTextNotFound() {
        String expectedPrefix = "";

        String actualPrefix = processor.findPrefix("22");
        Assertions.assertEquals(expectedPrefix, actualPrefix);

        actualPrefix = processor.findPrefix("tWo");
        Assertions.assertEquals(expectedPrefix, actualPrefix);
    }

}
