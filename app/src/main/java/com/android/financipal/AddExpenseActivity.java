package com.android.financipal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.android.financipal.databinding.ActivityAddExpenseBinding;
import com.google.firebase.Firebase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Calendar;
import java.util.UUID;

public class AddExpenseActivity extends AppCompatActivity {
    ActivityAddExpenseBinding  binding;
    private String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAddExpenseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        type= getIntent().getStringExtra("type");


    }


    //for menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.add_menu,menu);
        return true;
    }

    //if you select menu item, then clickreceiver will show
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.saveExpense){
            createExpense();
            return true;
        }
        return false;
    }

    private void createExpense() {
        String expenseId= UUID.randomUUID().toString();
        String amount=binding.amount.getText().toString();
        String note=binding.amount.getText().toString();
        String category=binding.amount.getText().toString();
        //check which radio button check
        String type;
        boolean incomeChecked =binding.incomeRadio.isChecked();

        if(incomeChecked){
            type="Income";
        }
        else{
            type="Expense";
        }

        if(amount.trim().length()==0){
            binding.amount.setError("Empty");
            return;

        }
        ExpenseMode expenseMode = new ExpenseMode(expenseId,note,category,type,Long.parseLong(amount), Calendar.getInstance().getTimeInMillis());

        FirebaseFirestore
                .getInstance()
                .collection("expense")
                .document(expenseId)
                .set(expenseMode);

                finish();

    }

}