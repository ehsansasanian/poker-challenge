package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards;

    public Hand(String[] arr) {
        if (arr == null || arr.length != 5) throw new IllegalStateException("Hand size is wrong");
        cards = new ArrayList<>();
        for (String s : arr) {
            this.cards.add(new Card(s));
        }
    }

    public String evaluate() {
        HandEvaluatorFactory evaluatorFactory = new HandEvaluatorFactory();
        return evaluatorFactory.evaluateHand(cards);
    }
}
