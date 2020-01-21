package com.example.chilldrenofpatria;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Chapter1Activity extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);
        // the support toolbar is for elements in the menu bar
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // set the title of the tool bar as Chapter 1
        // the beauty of this part is that I only have one toolbar resource file (toolbar.xml) that I will use again and again
        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
//
        setTitle("Chapter 1");

//        textViewChapter1.setTextColor(Color.parseColor("#fff"));

        // Write the first message using text scroll
        // cast the text view

        TextView textViewScroll = (TextView) findViewById(R.id.text_scrollChapter1);

        String noonGiftPart1 = "A tall pale woman draped in a thin white cloak levitates in the air above the center of town. A fairy flutters just above her shoulder. \n" +
                "\t“No. She just doesn’t have the intelligence, otherwise she would work fine.” The fairy says.\n" +
                "\t“Well, shit.” The women says. “What are we going to do then?”\n" +
                "\t“I’ve already told you, the only person capable of what you want here, is that one.” The fairy says, pointing out a young man selling bread in front of the bakery.\n" +
                "\t“It’s a shame, I was hoping for a women.” She says.\n" +
                "\t“You’re lucky you got anything. He’s the only one here.” Says the fairy. “He’ll fit right in he was orphaned at seven…”\n" +
                "\t“Fine, fine. You’ve convinced me. How much time do we have?” She asks.\n" +
                "\t“None at all. They’re already here.” Says the fairy.\n" +
                "\tThe sound of a bell reverberates in the air. The bustling people stop. They look at the bell above the town hall. Abandoning their tasks, they all file into the town hall.\n" +
                "\t“Hmm, seems like they’ve already started killing people.\n";

        textViewScroll.setText(noonGiftPart1);

        Button  butonContinue= findViewById(R.id.button_continueChapter1);


        butonContinue.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.button_continueChapter1:
                intent= new Intent(this, Chapter1Contiinue.class);
                startActivity(intent);
                break;

        }

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_book1, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.goback:
                intent= new Intent(this, Book1Activity.class);
                startActivity(intent);
                break;
        }



        return true;
    }
}
