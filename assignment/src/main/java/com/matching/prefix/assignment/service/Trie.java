package com.matching.prefix.assignment.service;

import com.matching.prefix.assignment.model.TrieNode;

import java.util.Map;

/**
 * Simple Trie service class which insert Prefix in Trie Dictionary.
 * Provide API to find closest Prefix of given search text.
 */
public class Trie {

    private final TrieNode root;

    public Trie() {
        root = new TrieNode('*');
    }

    /**
     * Insert each prefix text to Trie.
     * @param prefix Prefix to insert in the Trie.
     */
    public void insert(String prefix) {
        int prefixLength = prefix.length();
        TrieNode pointer = root;

        for (int i = 0; i < prefixLength; i++) {
            char ch = prefix.charAt(i);

            Map<Character, TrieNode> children = pointer.getChildren();
            if (children.containsKey(ch)) {
                pointer = children.get(ch);
            } else {
                TrieNode child = new TrieNode(ch);
                children.put(ch, child);
                pointer = child;
            }

        }
        // insertion of the prefix in Trie is completed
        // so set the end of prefix
        pointer.setEnd(true);

    }

    /**
     * Find the closest prefix of given searchText
     * @param searchText
     * @return closest prefix
     */
    public String findPrefix(String searchText) {
        StringBuilder result = new StringBuilder();

        int searchTextLength = searchText.length();
        TrieNode pointer = root;

        int i = 0;
        while (i < searchTextLength) {
            // check first character of the searchText
            char ch = searchText.charAt(i);

            Map<Character, TrieNode> children = pointer.getChildren();
            if (children.containsKey(ch)) {
                result.append(children.get(ch).getValue());
                pointer = children.get(ch);
                i++;
            } else {
                // we don't have ch matching in the trie
                // so no need to look for other char from searchText
                break;
            }

        }

        return result.toString();
    }
}
