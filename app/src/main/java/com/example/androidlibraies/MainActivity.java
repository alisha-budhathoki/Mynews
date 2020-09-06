package com.example.androidlibraies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Spinner spinner;
    Context mContext;
    private static final String[] paths = {"item 1", "item 2", "item 3", "item 4"};
    String item,types="",newdate="2019-09-26 ",nepdate="";
//    TextView text = findViewById(R.id.text1);
    RecyclerView hrecyclerView;
    HoroscopeAdapter horoscopeAdapter;
    TextView text, txtdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text1);
        txtdate = findViewById(R.id.txt_date);
        spinner = (Spinner)findViewById(R.id.spinner);
        hrecyclerView = findViewById(R.id.recyclerRasifal);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
//        showOurHoroscope();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                types = "day";
                System.out.println("123");
                showOurHoroscope();
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                System.out.println("1234");
                types = "week";
                showOurHoroscope();

                // Whatever you want to happen when the second item gets selected
                break;
            case 2:
                System.out.println("12345");
                types = "month";
                showOurHoroscope();

                // Whatever you want to happen when the thrid item gets selected
                break;
            case 3:
                System.out.println("12345");
                types = "year";
                showOurHoroscope();

                // Whatever you want to happen when the thrid item gets selected
                break;
        }
        }

    private void showOurHoroscope() {
        System.out.println("in show hor");
//        if(types!=null && newdate!=null) {
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
//            Date date = new Date();
//            newdate = formatter.format(date);
////            Log.v(TAG, "New Date " + newdate);
////            Log.v(TAG, "types " + types + "\n" + "date " + newdate);
//        }
        ApiInterface horoscopeAPI = APIClient.getApiClient().create(ApiInterface.class);
        Call<List<HoroscopeDatamodel>> call = horoscopeAPI.showHoroscope(types, newdate);

        call.enqueue(new Callback<List<HoroscopeDatamodel>>() {
            @Override
            public void onResponse(Call<List<HoroscopeDatamodel>> call, Response<List<HoroscopeDatamodel>> response) {

                try {

                    List<HoroscopeDatamodel> horoscope = response.body();
                    System.out.println(horoscope.get(0).getDescription());
                    System.out.println(horoscope.get(0).getId());

//                    Log.v(TAG, "Date: "+item);
//                    Log.v(TAG, "Nameid: " + horoscope.get(0).getId());
//                    Log.v(TAG, "Description: " + horoscope.get(0).getDescription());
                    System.out.println("ASAS");
                    txtdate.setVisibility(View.VISIBLE);
                    txtdate.setText(horoscope.get(0).getTitle());
//                    text.setText(horoscope.get(0).getDescription());
                    txtdate.setVisibility(View.VISIBLE);
                    txtdate.setText(horoscope.get(0).getTitle());
                    horoscopeAdapter = new HoroscopeAdapter(mContext, horoscope);
                    hrecyclerView.setAdapter(horoscopeAdapter);
                    hrecyclerView.setLayoutManager(new LinearLayoutManager(mContext));


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<List<HoroscopeDatamodel>> call, Throwable t) {
                t.printStackTrace();
//                Log.e(TAG, "horoscope error : " + t.getMessage());
                System.out.println("askana");
            }
        });

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}