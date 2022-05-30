package com.badri.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView lvDataCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvDataCity = findViewById(R.id.lv_kota);

        String cityList[]
                = {"Tangerang Selatan", "Jakarta", "Serang", "Cilegon",
                "Bogor", "Depok","Tangerang", "Bekasi", "Sukabumi", "Cirebon", "Surabaya", "Yogyakarta", "Semarang"};


        ArrayAdapter<String> cityListAdapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,
                cityList);
        lvDataCity.setAdapter(cityListAdapter);
    }


}