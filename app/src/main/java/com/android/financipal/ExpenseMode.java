package com.android.financipal;

public class ExpenseMode {

    private String expenseId;
    private String note;
    private String category;

    private String type;
    private long amount;
    private long time;

    public ExpenseMode() {

    }
    public ExpenseMode(String expenseId, String note, String category, String type, long parseLong, long timeInMillis) {

    }


    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }
}
