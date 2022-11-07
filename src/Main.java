import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = {"CTC", "NTK", "KTRK", "Ala-Too", "Balastan"};
        Television television = new Television(0, array.length, array);

        System.out.println("1-Next Channel   |||   2-Previous Channel   |||   3-Specific Channel  ||  4-Name Channel  || 5-");
        while (true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            int scan = scanner.nextInt();
            if (1 == scan) {
                television.nextChannel();
            } else if (2 == scan) {
                television.previousChannel();
            } else if (3 ==scan) {
             int num = scanner.nextInt();
                television.specificChannel(num);
            } else if (4 == scan) {
                System.out.println(television.getCurrentChanelName());
            } else if (5 == scan) {
                television.allChannels();
            } else {
                System.out.println("does not exist!");
            }
        }
    }
}