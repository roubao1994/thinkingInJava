package chapter13;

import java.util.Formatter;

/**
 * Created by lulei on 2017/6/1.
 */
public class Receipt {
    private double total = 0;
    private Formatter formatter = new Formatter(System.err);

    public void printTitle() {
        formatter.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        formatter.format("%-15s %5s %10s\n", "----", "--", "----");
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
    }
}
