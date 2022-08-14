public class Main
{
    public static void main(String[] args)
    {
        CardStack stack = new CardStack();

        stack.pushDeck(new Card(1, "Thirty"));
        stack.pushDeck(new Card(2, "TwentyNine"));
        stack.pushDeck(new Card(3, "TwentyEight"));
        stack.pushDeck(new Card(4, "TwentySeven"));
        stack.pushDeck(new Card(5, "TwentySix"));
        stack.pushDeck(new Card(6, "TwentyFive"));
        stack.pushDeck(new Card(7, "TwentyFour"));
        stack.pushDeck(new Card(8, "TwentyThree"));
        stack.pushDeck(new Card(9, "TwentyTwo"));
        stack.pushDeck(new Card(10, "TwentyOne"));
        stack.pushDeck(new Card(11, "Twenty"));
        stack.pushDeck(new Card(12, "Nineteen"));
        stack.pushDeck(new Card(13, "Eighteen"));
        stack.pushDeck(new Card(14, "Seventeen"));
        stack.pushDeck(new Card(15, "Sixteen"));
        stack.pushDeck(new Card(16, "Fifteen"));
        stack.pushDeck(new Card(17, "Fourteen"));
        stack.pushDeck(new Card(18, "Thirteen"));
        stack.pushDeck(new Card(19, "Twelve"));
        stack.pushDeck(new Card(20, "Eleven"));
        stack.pushDeck(new Card(21, "Ten"));
        stack.pushDeck(new Card(22, "Nine"));
        stack.pushDeck(new Card(23, "Eight"));
        stack.pushDeck(new Card(24, "Seven"));
        stack.pushDeck(new Card(25, "Six"));
        stack.pushDeck(new Card(26, "Five"));
        stack.pushDeck(new Card(27, "Four"));
        stack.pushDeck(new Card(28, "Three"));
        stack.pushDeck(new Card(29, "Two"));
        stack.pushDeck(new Card(30, "One"));

//        System.out.println();
//        stack.printPlayerDeck();
        for(int i = 0; i < 5; i++);
        {
            System.out.println("\nDraw: " + stack.drawDeck());
        }
        System.out.println("\nDraw: " + stack.drawDeck());
        System.out.println("      " + stack.drawDeck());
        System.out.println("      " + stack.drawDeck());
        System.out.println("\nCards remaining in the Player Deck: " +stack.deckSize());
        System.out.println("\nCards in the Discard Pile: " +stack.pileSize());
        System.out.println("\nDiscard: " + stack.discardDeck());
        System.out.println("         " + stack.discardDeck());
        System.out.println("\nCards remaining in the Player Deck: " +stack.deckSize());
        System.out.println("\nCards in the Discard Pile: " +stack.pileSize());

//        System.out.println();
//        stack.printPlayerHand();
//        stack.printPlayerDeck();
//        stack.printDiscardedPile();
    }
}