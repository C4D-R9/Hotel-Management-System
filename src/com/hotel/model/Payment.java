package com.hotel.model;

import java.time.LocalDateTime;

public class Payment {

    private int paymentId;
    private int invoiceId;
    private LocalDateTime paymentDate;
    private double amount;
    private String paymentMethod;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Payment() {}

    public Payment(int paymentId, int invoiceId, LocalDateTime paymentDate,
                   double amount, String paymentMethod,
                   LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.paymentId = paymentId;
        this.invoiceId = invoiceId;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getPaymentId() { return paymentId; }
    public void setPaymentId(int paymentId) { this.paymentId = paymentId; }

    public int getInvoiceId() { return invoiceId; }
    public void setInvoiceId(int invoiceId) { this.invoiceId = invoiceId; }

    public LocalDateTime getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDateTime paymentDate) { this.paymentDate = paymentDate; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
