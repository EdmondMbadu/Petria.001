package com.example.chilldrenofpatria;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Book1Activity extends AppCompatActivity implements View.OnClickListener {


    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);



        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
         setTitle("Book of Bennet Baker");


        toolbar.setBackgroundColor((Color.parseColor("#262626")));
        // to make the back arrow available (do not forget to go to manifest to set the parent of the activity)
//        getSupportActionBar().setTitle("The Book of Bennett Baker");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);  // Not working


        // Implement the Onclick listener so that only one method will take care of everything
        Button buttonChapter1 = findViewById(R.id.button_chapter1);
        Button buttonChapter2 = findViewById(R.id.button_chapter2);
        Button buttonChapter3 = findViewById(R.id.button_chapter3);

        buttonChapter1.setOnClickListener(this);
        buttonChapter2.setOnClickListener(this);
        buttonChapter3.setOnClickListener(this);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_book1, menu);
        return true;
    }
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button_chapter1:
                intent = new Intent(this, Chapter1Activity.class);
                startActivity(intent);
                break;
            case R.id.button_chapter2:
                Toast.makeText(this, "Coming soon!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_chapter3:
                Toast.makeText(this, "Coming very soon!", Toast.LENGTH_SHORT).show();
                break;


        }
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.goback:
                intent= new Intent(this, HomeActivity.class);
                startActivity(intent);
                break;
        }



        return true;
    }




}
