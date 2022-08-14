import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RandomArrayQueue<Player> queue = new RandomArrayQueue<Player>();

        queue.enqueue(new Player(1, "aceu", 100));
        queue.enqueue(new Player(2, "Sinatraa", 100));
        queue.enqueue(new Player(3, "Subroza", 95));
        queue.enqueue(new Player(4, "ploo", 90));
        queue.enqueue(new Player(5, "TenZ", 99));
        queue.enqueue(new Player(6, "ShahZam", 95));
        queue.enqueue(new Player(7, "Shroud", 100));

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int players = 0;
        int games = 0;

        do {
            while (true) {
                System.out.println("\nPress Enter to initialize");
                scanner.nextLine();

                int randomNumber = r.nextInt(queue.size()) + 1;

                for (int i = 0; i < randomNumber; i++) {
                    System.out.println("Queueing: " + queue.randomDequeue());
                    players++;
                }

                System.out.println("\nPlayers: " + players);

                if (players >= 5) {
                    games++;
                    System.out.println("\nGame " + games + " complete");
                    players = 0;
                    queue.enqueue(new Player(1, "aceu", 100));
                    queue.enqueue(new Player(2, "Sinatraa", 100));
                    queue.enqueue(new Player(3, "Subroza", 95));
                    queue.enqueue(new Player(4, "ploo", 90));
                    queue.enqueue(new Player(5, "TenZ", 99));
                    queue.enqueue(new Player(6, "ShahZam", 95));
                    queue.enqueue(new Player(7, "Shroud", 100));
                    break;
                } else {
                    System.out.println("\nNeed more players");
                }
            }
        } while (games < 10);
    }
}