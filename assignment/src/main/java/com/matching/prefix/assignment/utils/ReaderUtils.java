package com.matching.prefix.assignment.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

/**
 * Utility class to parse and read files from resources package.
 */
public class ReaderUtils {

    public static Stream<String> readSamplePrefixes(String fileName) {
        Class<ReaderUtils> clazz = ReaderUtils.class;
        InputStream inputStream = clazz.getClassLoader().getResourceAsStream(fileName);
        return readInputStream(inputStream);
    }

    private static Stream<String> readInputStream(InputStream is) {
        Stream.Builder<String> streamBuilder = Stream.builder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8))) {

            String line;
            while ((line = reader.readLine()) != null) {
                streamBuilder.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return streamBuilder.build();
    }

}
