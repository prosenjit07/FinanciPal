package com.android.financipal;

public class ExpenseMode {

    private String expenseId;
    private String note;
    private String category;
    private long amount;
    private long time;

    public ExpenseMode() {
    }

    public ExpenseMode(String expenseId, String note, String category, long amount, long time) {
        this.expenseId = expenseId;
        this.note = note;
        this.category = category;
        this.amount = amount;
        this.time = time;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }
}
