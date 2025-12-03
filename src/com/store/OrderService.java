package com.store;

public class OrderService {
    public static float applyDiscount(float total, float discountRate){
        return total - (total * discountRate);
    }

    static void main() {
        float subTotal = 100f;
        float discount = 0.10f;
        subTotal = applyDiscount(subTotal, discount);
        IO.println(String.format("£ %.2f",subTotal));
        IO.println(start());
    }

    public static String start(){
        return stepOne();
    }

    public static String stepOne() {
        return stepTwo();

    }

    public static String stepTwo() {
        return "Executing";
    }
}
