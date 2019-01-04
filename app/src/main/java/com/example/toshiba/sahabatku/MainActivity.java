package com.example.toshiba.sahabatku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.toshiba.sahabatku.adapter.SahabatAdapter;
import com.example.toshiba.sahabatku.model.SahabatModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<SahabatModel> SahabatList;
    private static final String URL_PRODUCTS = "http://192.168.39.2/sahabatApi/tampil.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UNTUK TAMPIL
        recyclerView = findViewById(R.id.rvv_sahabat);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //DATA
        SahabatList = new ArrayList<>();

        loadData();
    }

    private void loadData()
    {

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_PRODUCTS,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            //converting the string to json array object
                            JSONArray array = new JSONArray(response);

                            //traversing through all the object
                            for (int i = 0; i < array.length(); i++) {

                                //getting product object from json array
                                JSONObject notif = array.getJSONObject(i);

                                //adding the product to product list
                                SahabatList.add(new SahabatModel(
                                        notif.getInt("id"),
                                        notif.getString("nama"),
                                        notif.getString("foto"),
                                        notif.getString("panggil"),
                                        notif.getString("tlp"),
                                        notif.getString("alamat"),
                                        notif.getString("desk"),
                                        notif.getString("ig")
                                ));
                            }
                            //creating adapter object and setting it to recyclerview
                            SahabatAdapter adapter = new SahabatAdapter(MainActivity.this, SahabatList);
                            recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        //adding our stringrequest to queue
        Volley.newRequestQueue(this).add(stringRequest);
    }
}
