package org.example;

import java.util.Arrays;
import java.util.List;

public class Card {
    private final int rank;
    private final char suit;

    public Card(String card) {
        if (card.length() != 2) throw new IllegalStateException("Unexpected value: " + card);
        this.rank = getRank(card.charAt(0));
        this.suit = getSuit(card.charAt(1));
    }

    public int getRank() {
        return rank;
    }

    public char getSuit() {
        return suit;
    }

    private char getSuit(char c) {
        List<Character> allowedSuits = Arrays.asList('d', 'c', 's', 'h');
        if (!allowedSuits.contains(c)) throw new IllegalStateException("Unexpected value: " + c);
        return c;
    }

    private int getRank(char c) {
        return switch (c) {
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            case 'T' -> 10;
            case 'J' -> 11;
            case 'Q' -> 12;
            case 'K' -> 13;
            case 'A' -> 14;
            default -> throw new IllegalStateException("Unexpected value: " + c);
        };
    }
}