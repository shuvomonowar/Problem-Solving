package Learning.Advanced.Lambda;

import java.util.ArrayList;

class Lambda_Exp_1 {
    void show() {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(100);
        num.add(200);
        num.add(300);
        num.add(400);
        num.add(500);

        // Lambda expression
        num.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Lambda_Exp_1 obj = new Lambda_Exp_1();
        obj.show();
    }
}