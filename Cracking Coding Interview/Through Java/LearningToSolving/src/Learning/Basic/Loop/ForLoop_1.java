package Learning.Basic.Loop;

public class ForLoop_1 {
    void loop() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1 + " ");
        }
    }

    public static void main(String[] args) {
        ForLoop_1 obj = new ForLoop_1();
        obj.loop();
    }
}
