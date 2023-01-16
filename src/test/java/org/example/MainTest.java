package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {
    @Test
    public void testCard_correctType_shouldInitializeClass() {
        Card c1 = new Card("2c");
        Card c2 = new Card("Ts");
        Card c3 = new Card("Qd");
        Card c4 = new Card("Ah");

        assertThat(c1.getSuit()).isEqualTo('c');
        assertThat(c1.getRank()).isEqualTo(2);

        assertThat(c2.getSuit()).isEqualTo('s');
        assertThat(c2.getRank()).isEqualTo(10);

        assertThat(c3.getSuit()).isEqualTo('d');
        assertThat(c3.getRank()).isEqualTo(12);

        assertThat(c4.getSuit()).isEqualTo('h');
        assertThat(c4.getRank()).isEqualTo(14);
    }

    @Test
    public void testCard_wrongType_shouldThrowIllegalArgumentException() {
        assertThrows(IllegalStateException.class, () -> new Card("0c"));
        assertThrows(IllegalStateException.class, () -> new Card(""));
        assertThrows(IllegalStateException.class, () -> new Card("2cs"));
        assertThrows(IllegalStateException.class, () -> new Card("2b"));
    }
}