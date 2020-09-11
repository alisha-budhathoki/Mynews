package com.example.androidlibraies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidlibraies.adapter.RecentNewsAdapter;
import com.example.androidlibraies.model.RecentNewsDataModel;
import com.example.androidlibraies.model.RecentNewsModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchingActivity extends AppCompatActivity {
    private ListView lv;
    private EditText editText;
    private ArrayAdapter<String> adapter;
    private RecentNewsAdapter newsAdapter;

    private String products[] = {"Apple cider", "Banana","Pinapple", "Orange", "Papaya", "Melon",
            "Grapes bat", "Water Melon","Lychee", "Guava", "Mango", "Kivi", "My Favourites"};

    private String product1[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);
        lv = (ListView) findViewById(R.id.listView);
        editText = (EditText) findViewById(R.id.editText);
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, products);
        lv.setAdapter(adapter);
        loadData();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //skmkgit
                Toast.makeText(getApplicationContext(),"before text change", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
                Toast.makeText(getApplicationContext(),"after text change",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void loadData() {
        System.out.println("in show recent news");
        ApiInterface recentNewsAPI = APIClient.getApiClient().create(ApiInterface.class);
        Call<RecentNewsModel> call = recentNewsAPI.showRecentNews();
        call.enqueue(new Callback<RecentNewsModel>() {
            @Override
            public void onResponse(Call<RecentNewsModel> call, Response<RecentNewsModel> response) {
                System.out.println("success news");
                RecentNewsModel recentNews = response.body();
                System.out.println("hor"+recentNews.getRecentNewsDataModel());
                System.out.println(recentNews.getRecentNewsDataModel().get(0).getHeadline());
                ArrayList<RecentNewsDataModel> recentNewsDataModelArrayList = recentNews.getRecentNewsDataModel();
                adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_item, R.id.product_name,products);
//                lv.setAdapter(adapter);
                }

            @Override
            public void onFailure(Call<RecentNewsModel> call, Throwable t) {
                System.out.println("Unsuccess news");
            }
        });
    }
}