package org.example;

import java.util.List;

public interface HandRanking {
    boolean evaluate(List<Card> cards);

    String getName();

}

class StraightFlush implements HandRanking {
    @Override
    public boolean evaluate(List<Card> cards) {

        if (cards.size() < 5) {
            return false;
        }

        // Suit
        long suit = cards.stream()
                .map(Card::getSuit)
                .distinct()
                .count();

        if (suit != 1) {
            return false;
        }

        //TODO: Test ME
        List<Integer> ranks = cards.stream()
                .map(Card::getRank)
                .sorted()
                .toList();


        int start = ranks.get(0);

        for (int i = 1; i < ranks.size(); i++) {
            int r = ranks.get(i);
            if (r != ++start) return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Straight Flush";
    }
}

class HighCard implements HandRanking {

    @Override
    public boolean evaluate(List<Card> cards) {
        return false;
    }

    @Override
    public String getName() {
        return "";
    }
}

class Pair implements HandRanking {

    @Override
    public boolean evaluate(List<Card> cards) {
        return false;
    }

    @Override
    public String getName() {
        return "";
    }
}

class TwoPair implements HandRanking {

    @Override
    public boolean evaluate(List<Card> cards) {
        return false;
    }

    @Override
    public String getName() {
        return "";
    }
}

class ThreeOfAKind implements HandRanking {

    @Override
    public boolean evaluate(List<Card> cards) {
        return false;
    }

    @Override
    public String getName() {
        return "";
    }
}

class Straight implements HandRanking {

    @Override
    public boolean evaluate(List<Card> cards) {
        return false;
    }

    @Override
    public String getName() {
        return "";
    }
}

class Flush implements HandRanking {

    @Override
    public boolean evaluate(List<Card> cards) {
        return false;
    }

    @Override
    public String getName() {
        return "";
    }
}

class FullHouse implements HandRanking {

    @Override
    public boolean evaluate(List<Card> cards) {
        return false;
    }

    @Override
    public String getName() {
        return "";
    }
}

class FourOfAKind implements HandRanking {

    @Override
    public boolean evaluate(List<Card> cards) {
        return false;
    }

    @Override
    public String getName() {
        return "";
    }
}