import java.util.Random;
class HeadorTail {
    public static void main (String[] args) {
        Random rand = new Random();
        int headCnt = 0, tailCnt = 0;
        System.out.println("Tossing a coin...");
        for (int i = 0; i < 3; i++) {
            System.out.print("Round "+ (i + 1) +": ");
            int num = rand.nextInt(10) + 100;
            if (num % 2 == 0) {
                headCnt++;
                System.out.println("Heads");
            } else {
                tailCnt++;
                System.out.println("Tails");
            }
        }
        System.out.println("Head: "+headCnt+", "+"Tails: "+tailCnt);
        if (headCnt > tailCnt) System.out.println("You won");
        else System.out.println("You lost");
    }
}