import java.util.Scanner;

public class RefactoringNumberGuessing {

    public static void main(String[] args) {

        int win = 0, N = 10000;
        Player player = new BinarySearchAI();
        for (int i = 0 ; i <= N ; i++) {
            Game game = new Game(player, 10);
            if (game.run()) win++;
        }
        System.out.println("Win rate: " + 100.0 * win / N + "%");
    }
    
}

class Game {

    private int a = 0, b = 99;
    private final int num;
    private final Player player;
    private int limit = Integer.MAX_VALUE;

    Game(Player player, int limit) {
        this(player);
        this.limit = limit;
    }

    Game(Player player) {
        num = (int) (Math.random() * 100);
        this.player = player;
    }


    public boolean run() {

        int rounds = 0;

        while (true) {

            rounds++;
            if (rounds > limit) {
                return false;
            }

            if (a != b) {
                int response = player.next(a, b);

                if (response < num) {
                    a = response + 1;
                }
                else if (response > num) {
                    b = response - 1;
                }
                
                else if (response == num) {
                    return true;
                }
                    
            }

            else if (a == b) {
                return false;
            }
        }
    }
}

class Player {

    public int next(int a, int b) {
        return 0; 
    }

}

class NaiveAI extends Player {

    @Override
    public int next(int a, int b) {
        return (int) (Math.random() * (b - a + 1) + a);
    }

}


class SuperAI extends NaiveAI {
    
    @Override
    public int next(int a, int b) {
        return b;
    }
}

class BinarySearchAI extends Player {

    @Override
    public int next(int a, int b) {
        return (a + b) / 2;
    }
}


class HumanPlayer extends Player {

    private final Scanner input = new Scanner(System.in);

    @Override
    public int next(int a, int b) {
        return input.nextInt();
    }
}