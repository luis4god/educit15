package com.example.educacionit.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = (Button) findViewById(R.id.btn_add);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(v.getContext(),Add_activity.class);

                i.putExtra("title", "Agrega un Producto");

                startActivity(i);
            }
        });

        Button btnList = (Button) findViewById(R.id.btn_list);

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(v.getContext(),ListProduct.class);

                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        switch (id){
            case R.id.action_version:
                try {
                    String a = getPackageManager().getPackageInfo(getPackageName(),0).versionName;
                    Toast.makeText(this, "Version: " + a, Toast.LENGTH_LONG).show();
                }catch(PackageManager.NameNotFoundException e){
                    e.printStackTrace();
                }
               break;
            case R.id.action_settings:
                Toast.makeText(this, "Te debo los Settings", Toast.LENGTH_LONG).show();
                SharedPreferences shared = PreferenceManager.getDefaultSharedPreferences(this);

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
