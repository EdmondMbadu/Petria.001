package com.example.chilldrenofpatria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


// we implemented OnclickListener so that  only one method handles
// all the buttons.
public class HomeActivity extends AppCompatActivity implements View.OnClickListener {


    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Give the buttons functionality.
        Button button1 = findViewById(R.id.button_book1);
        Button button2 = findViewById(R.id.button_book2);
        Button button3 = findViewById(R.id.button_book3);


        // if button 1, 2, 3 is click
        // the listener will call initiate the Onclick method
        // and apply the transformation
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button_book1:
                intent = new Intent(this, Book1Activity.class);
                startActivity(intent);
                break;
            case R.id.button_book2:
                Toast.makeText(this, "Coming soon!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_book3:
                Toast.makeText(this, "Coming very soon!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
