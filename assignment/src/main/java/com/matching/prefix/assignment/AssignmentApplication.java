package com.matching.prefix.assignment;

import com.matching.prefix.assignment.service.Processor;

public class AssignmentApplication {

    private static final String SAMPLE_PREFIXES = "sample_prefixes.txt";

    /**
     * This is main class where we are creating Processor class, which will
     * initializing all the prefixes from "sample_prefixes.txt" file
     * and provide method to search text.
     */
    public static void main(String[] args) {
        String searchText = "trueCaller";

        Processor processor = new Processor(SAMPLE_PREFIXES);
        String prefix = processor.findPrefix(searchText);

        System.out.printf("Prefix of %s is: %s", searchText, prefix);
    }

}
