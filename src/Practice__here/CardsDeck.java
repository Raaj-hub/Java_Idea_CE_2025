package Practice__here;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardsDeck {
    public static void main(String[] args) {
        List<String> deck = createDeck();

        Collections.shuffle(deck);

        for(int i=0; i<=13; i++)
        {
            System.out.println(deck.get(i));
            
        }

    }

    private static List<String> createDeck()
    {
        String shapes[] = {"hearts","spades","diamonds","clubs"};
        String ranks[] = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        List<String> deck = new ArrayList<>();

        for (String rank : ranks)
        {
            for (String shape : shapes)
            {
                deck.add(rank+ " of "+shape);
            }
        }

        return deck;
    }
}
