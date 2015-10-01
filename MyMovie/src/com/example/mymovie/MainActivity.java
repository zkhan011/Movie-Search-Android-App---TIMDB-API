package com.example.mymovie;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.*;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {
  
    private EditText searchEditText;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

       
        searchEditText = (EditText) findViewById(R.id.movieEditText);
     
        Button searchButton = (Button) findViewById(R.id.searchButton);

              searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	 ProgressDialog progressDialog = ProgressDialog.show(MainActivity.this,
                         "Please wait...", "Retrieving data...", true, true);
                String query = searchEditText.getText().toString();
               
                Intent intent = new Intent(MainActivity.this,SearchActivity.class);
                intent.putExtra("key", query);
                startActivity(intent);
              
            }
        });
    }

   
}
