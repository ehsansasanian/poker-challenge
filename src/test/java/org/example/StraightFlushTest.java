package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StraightFlushTest {
    private final String expected = "Straight Flush";

    @Test
    public void testEvaluate_straightFlush_shouldReturnStraightFlush() {
        Hand handOne = new Hand(new String[]{"8d", "9d", "Td", "Jd", "Qd"});
        assertThat(handOne.evaluate()).isEqualTo(expected);

        Hand handTwo = new Hand(new String[]{"2h", "3h", "4h", "5h", "6h"});
        assertThat(handTwo.evaluate()).isEqualTo(expected);

        Hand handThree = new Hand(new String[]{"As", "Js", "Qs", "Ks", "Ts"});
        assertThat(handThree.evaluate()).isEqualTo(expected);

        Hand handFour = new Hand(new String[]{"Kc", "Jc", "9c", "Qc", "Tc"});
        assertThat(handFour.evaluate()).isEqualTo(expected);

    }

    @Test
    public void testEvaluate_notStraightFlush_shouldNotReturnStraightFlush() {
        Hand hand = new Hand(new String[]{"2h", "3h", "5h", "6h", "7h"});
        assertThat(hand.evaluate()).isNotEqualTo(expected);

        Hand handTwo = new Hand(new String[]{"2h", "3h", "4h", "5d", "6h"});
        assertThat(handTwo.evaluate()).isNotEqualTo(expected);


        Hand handThree = new Hand(new String[]{"2c", "3c", "4c", "5c", "8c"});
        assertThat(handThree.evaluate()).isNotEqualTo(expected);
    }
}