package com.shanInfotech.gstInvoiceApp;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<InvoiceItem> items = new ArrayList<InvoiceItem>();
        items.add(new InvoiceItem("Notebook", 60.0, 10, 12.0));
        items.add(new InvoiceItem("Ball Pen", 10.0, 20, 18.0));

        InvoiceCalculator calculator = new InvoiceCalculator();

        System.out.println("Amit Stationers, Belgaum - Tax Invoice");
        System.out.println("Customer: Priya Kulkarni");
        System.out.println("-------------------------------------------");
        for (InvoiceItem item : items) {
            String name = item.getName();
            int quantity = item.getQuantity();
            double amount = calculator.lineAmount(item);
            double gst = calculator.gstAmount(item);
            String format = "%-10s x %3d   Amount: %8.2f   GST: %6.2f";
            System.out.println(String.format(format, name, quantity, amount, gst));
        }
        System.out.println("-------------------------------------------");
        double grandTotal = calculator.grandTotal(items);
        System.out.println(String.format("Grand Total (Rs.): %.2f", grandTotal));
    }
}
