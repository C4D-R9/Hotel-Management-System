package com.hotel.model;

import java.time.LocalDateTime;

public class Invoice {

    private int invoiceId;
    private int bookingId;
    private LocalDateTime invoiceDate;
    private double discount;
    private double totalAmount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Invoice() {}

    public Invoice(int invoiceId, int bookingId, LocalDateTime invoiceDate,
                   double discount, double totalAmount,
                   LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.invoiceId = invoiceId;
        this.bookingId = bookingId;
        this.invoiceDate = invoiceDate;
        this.discount = discount;
        this.totalAmount = totalAmount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getInvoiceId() { return invoiceId; }
    public void setInvoiceId(int invoiceId) { this.invoiceId = invoiceId; }

    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }

    public LocalDateTime getInvoiceDate() { return invoiceDate; }
    public void setInvoiceDate(LocalDateTime invoiceDate) { this.invoiceDate = invoiceDate; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}