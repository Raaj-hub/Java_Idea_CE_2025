package practiceHere;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckCards {
    public static void main(String[] args) {
        List<String> deck = creatDecks();
        Collections.shuffle(deck);

        for (int i=1; i<=13; i++)
        {
            System.out.println(deck.get(i));
        }

    }

    private static List<String> creatDecks() {

        String[] suits = {"♠", "♥", "♦", "♣"};
        List<String> deck = new ArrayList<>();
String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

for(String suit : suits)
{
    for (String rank : ranks)
    {
        deck.add(suit +" of " + rank);
    }
}
 return deck;
    }
}
