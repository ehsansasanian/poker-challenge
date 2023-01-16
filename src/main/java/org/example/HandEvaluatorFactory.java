package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HandEvaluatorFactory {
    private static final Map<Integer, HandRanking> handRankings;

    static {
        handRankings = new HashMap<>();
        handRankings.put(9, new StraightFlush());
        handRankings.put(8, new FourOfAKind());
        handRankings.put(7, new FullHouse());
        handRankings.put(6, new Flush());
        handRankings.put(5, new Straight());
        handRankings.put(4, new ThreeOfAKind());
        handRankings.put(2, new TwoPair());
        handRankings.put(3, new Pair());
        handRankings.put(1, new HighCard());
    }
    public String evaluateHand(List<Card> cards) {
        for (int i = handRankings.size(); i != 0; i--) {
            HandRanking handRanking = handRankings.get(i);
            if (handRanking.evaluate(cards)) {
                return handRanking.getName();
            }
        }
        return "NONE";
    }
}