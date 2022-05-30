package com.badri.optionsmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionsmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
                Toast.makeText(getApplicationContext(),"Anda telah memilih Profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(getApplicationContext(),"Anda telah memilih Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.signout:
                // finish(); digunakan untuk menutup halaman/aplkasi
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}