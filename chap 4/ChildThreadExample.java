
//que 122
// Write a program to create a child thread to print integer 
// numbers 1 to 10
public class ChildThreadExample {
    public static void main(String[] args) {
        Thread childThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
            }
        });

        childThread.start();
    }
}
