package interviewQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOf_cards {
    public static void main(String[] args) {
        List<String> deck= creatDeck();
        Collections.shuffle(deck);
        for (int i=0; i<=13; i++)
        {
            System.out.println(deck.get(i));
        }
    }

    private static List<String> creatDeck()
    {
        String[] shapes = {"hearts", "diamonds","spades","clubs"};
        List<String> deck = new ArrayList<>();

        String[] ranks = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (String rank : ranks)
            for (String shape : shapes) {
                deck.add(rank + " of " + shape);
            }
        return deck;
    }
}
