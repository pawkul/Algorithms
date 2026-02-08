package com.pawkul.datastructures.trie;

import java.util.Map;

public class Trie {
    public static class Node {
        char character;
        boolean isWord;
        Map<Character, Node> children;

        public Node(char c) {
            this.character = c;
        }
    }

    private final char ROOT_CHAR = '\0';
    private Node root = new Node(ROOT_CHAR);

    public boolean insert(String key) {
        return true;
    }

    public boolean delete(String key) {
        return true;
    }

    public boolean contains(String key) {
        return true;
    }
}
