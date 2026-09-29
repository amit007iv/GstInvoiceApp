package com.shanInfotech.gstInvoiceApp;

public class InvoiceItem {

    private String name;
    private double unitPrice;
    private int quantity;
    private double gstPercent;

    public InvoiceItem(String name, double unitPrice, int quantity, double gstPercent) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.gstPercent = gstPercent;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getGstPercent() {
        return gstPercent;
    }
}