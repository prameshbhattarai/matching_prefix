package com.matching.prefix.assignment.model;


import java.util.HashMap;
import java.util.Map;

/**
 * TireNode Data structure.
 */
public class TrieNode {

    private final char value;
    private boolean isEnd;
    private final Map<Character, TrieNode> children;

    public TrieNode(char value) {
        this.value = value;
        this.isEnd = false;
        this.children = new HashMap<>();
    }

    public char getValue() {
        return value;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }
}
