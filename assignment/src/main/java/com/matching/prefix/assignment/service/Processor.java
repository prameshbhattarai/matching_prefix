package com.matching.prefix.assignment.service;

import com.matching.prefix.assignment.utils.ReaderUtils;

import java.util.stream.Stream;

/**
 * This is a simple processor class which will initialize all the Prefixes from given file into Trie Dictionary.
 * It will also provide a method to find prefix from Trie service.
 */
public class Processor {

    private final Trie trie;

    /**
     * Initialize all the prefixes from given file into Trie Dictionary.
     * @param fileName File name from resources where we have all the prefixes.
     */
    public Processor(String fileName) {
        Stream<String> prefixes = ReaderUtils.readSamplePrefixes(fileName);
        trie = new Trie();
        prefixes.forEach(trie::insert);
    }

    /**
     * Wrapper method from Trie, to search the text in the Trie.
     * @return Prefix from Trie.
     */
    public String findPrefix(String searchText) {
        return trie.findPrefix(searchText);
    }
}
