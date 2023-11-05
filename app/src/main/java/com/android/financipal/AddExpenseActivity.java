package com.android.financipal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.android.financipal.databinding.ActivityAddExpenseBinding;

public class AddExpenseActivity extends AppCompatActivity {
    ActivityAddExpenseBinding  binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAddExpenseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
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
        string amount=binding.amount.getText().toString();
        string note=binding.amount.getText().toString();
        string category=binding.amount.getText().toString();
        //check which radio button check
        boolean incomeChecked =binding.incomeRadio.isChecked();


    }

}