import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack
{
    private LinkedList<Card> stack;

        public CardStack()
    {
        stack = new LinkedList<Card>();
    }

    private int deckTop;

    private int pileTop;

    public void pushDeck(Card card)
    {
        stack.push(card);
        deckTop++;
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

//    public Card drawDeck()
//    {
//        deckTop--;
//        return stack.pop();
//    }

    public Card drawDeck()
    {
        deckTop--;
        return stack.pop();
    }

    public Card discardDeck()
    {
        deckTop--;
        pileTop++;
        return stack.pop();
    }

    public int deckSize()
    {
        return deckTop;
    }

    public int pileSize()
    {
        return pileTop;
    }

    public void printPlayerDeck()
    {
        ListIterator<Card> iterator = stack.listIterator();
        System.out.println("Player's Hand: ");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
