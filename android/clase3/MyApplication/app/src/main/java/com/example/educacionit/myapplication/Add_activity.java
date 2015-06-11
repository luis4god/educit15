package com.example.educacionit.myapplication;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Add_activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_activity);

       getSupportActionBar().setTitle(getIntent().getStringExtra("title"));

        Button btnList = (Button) findViewById(R.id.btn_save);

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText productoText = (EditText) findViewById(R.id.productText);
                EditText priceText = (EditText) findViewById(R.id.priceText);
                EditText quantityText = (EditText) findViewById(R.id.quantityText);
                String product = productoText.getText().toString();
                String price = productoText.getText().toString();
                String quantity = productoText.getText().toString();
                SharedPreferences shared = PreferenceManager.getDefaultSharedPreferences(v.getContext());
                shared.edit().putString("Product",product)
                        .putString("Price",price)
                        .putString("Quantity",quantity)
                        .apply();
            }
        });


        EditText productoText = (EditText) findViewById(R.id.productText);
        EditText priceText = (EditText) findViewById(R.id.priceText);
        EditText quantityText = (EditText) findViewById(R.id.quantityText);
        String product = productoText.getText().toString();
        String price = productoText.getText().toString();
        String quantity = productoText.getText().toString();
        SharedPreferences shared = PreferenceManager.getDefaultSharedPreferences(this);
        shared.edit().putString("Product",product)
                .putString("Price",price)
                .putString("Quantity",quantity)
                .apply();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //if(newConfig.)
    }




}
