public class Television {

    private int currentChanel;
    private int maxChannels;
    private String[] array;


    public Television(int currentChanel, int maxChannels, String[] array) {

        this.currentChanel = currentChanel;
        this.maxChannels = maxChannels;
        this.array=array;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setMaxChannels(int maxChannels) {
        this.maxChannels = maxChannels;
    }

    public int getMaxChannels() {
        return maxChannels;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    void nextChannel() {
        if (currentChanel == maxChannels) {
            currentChanel = 0;
        } else {
            currentChanel++;
        }
        System.out.println(currentChanel + "-chanel");
    }

    void previousChannel() {
        if (currentChanel == 0) {
            currentChanel = maxChannels;
        } else {
            currentChanel--;
        }
        System.out.println(currentChanel + "-channel");
    }

    void specificChannel(int scan) {
        if (scan < 0) {
            System.out.println("does not exist!");
        } else if (scan > maxChannels) {
            System.out.println("does not exist!");
        } else {
            currentChanel = scan;
            System.out.println(currentChanel + "-channel");
        }
    }

    public String getCurrentChanelName() {
        for (int i = 0; i < array.length; i++) {
            if (i == currentChanel) {
                return array[i];
            }
        }
        return "does not exist!";
    }
void allChannels(){
    for (String x:array) {
        System.out.println(x);
    }
}

}
