package com.example.educacionit.myapplication;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class ListProduct extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);

        TextView productTextView = (TextView) findViewById(R.id.productList);
        TextView pricetTextView = (TextView) findViewById(R.id.priceList);
        TextView quantityTextView = (TextView) findViewById(R.id.quantityList);

        SharedPreferences shared = PreferenceManager.getDefaultSharedPreferences(this);

        productTextView.setText(shared.getString("Product", "Producto No encontrado"));
        pricetTextView.setText(shared.getString("Price","Precio No encontrado"));
        quantityTextView.setText(shared.getString("Quantity","Cantidad No encontrada"));




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_product, menu);
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
}
