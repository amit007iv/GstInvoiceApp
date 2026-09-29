package com.shanInfotech.gstInvoiceApp;

import java.util.List;

public class InvoiceCalculator {

    public double lineAmount(InvoiceItem item) {
        return item.getUnitPrice() * item.getQuantity();
    }

    public double gstAmount(InvoiceItem item) {
        return lineAmount(item) * item.getGstPercent() / 100;
    }

    public double grandTotal(List<InvoiceItem> items) {
        double total = 0;
        for (InvoiceItem item : items) {
            total = total + lineAmount(item) + gstAmount(item);
        }
        return total;
    }
}
