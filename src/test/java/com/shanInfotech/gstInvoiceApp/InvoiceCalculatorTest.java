package com.shanInfotech.gstInvoiceApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class InvoiceCalculatorTest {

    private InvoiceCalculator calculator = new InvoiceCalculator();

    @Test
    public void lineAmountIsPriceTimesQuantity() {
        InvoiceItem notebook = new InvoiceItem("Notebook", 60.0, 10, 12.0);
        assertEquals(600.0, calculator.lineAmount(notebook), 0.001);
    }

    @Test
    public void gstAmountIsPercentOfLineAmount() {
        InvoiceItem notebook = new InvoiceItem("Notebook", 60.0, 10, 12.0);
        assertEquals(72.0, calculator.gstAmount(notebook), 0.001);
    }

    @Test
    public void grandTotalAddsAllLinesWithGst() {
        List<InvoiceItem> items = new ArrayList<InvoiceItem>();
        items.add(new InvoiceItem("Notebook", 60.0, 10, 12.0));
        items.add(new InvoiceItem("Ball Pen", 10.0, 20, 18.0));
        assertEquals(908.0, calculator.grandTotal(items), 0.001);
    }
}
