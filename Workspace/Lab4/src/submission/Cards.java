package submission;
/**.
 *This program displays a blackjack hand and then adds two cards
 *together
 * @author leonho A00879122 Set1B
 *
 */
public class Cards {
    enum rank { ace, two ,three, four, five, six, seven, eight, nine, ten, jack, queen, king };
    public static void main(String[] args) {
        rank highCard;
        rank faceCard;
        rank card1;
        rank card2;
        int card1Val;
        int card2Val;
        highCard = rank.ace;
        faceCard = rank.queen;
        card1 = rank.two;
        card2 = rank.three;

        System.out.println("A blackjack hand: " + highCard + " " + faceCard 
                + " " + card1 + " " + card2);
        card1Val = card1.ordinal() + 1;
        card2Val = card2.ordinal() + 1;
        System.out.println("Card 1 value: " + card1Val + "\nCard 2 Value: "
                + card2Val);
        System.out.println("\n A two card hand: " + card1Val 
                + " " + card2Val);
        System.out.println("\n Hand value: " + (card1Val + card2Val));
        
    }
}
