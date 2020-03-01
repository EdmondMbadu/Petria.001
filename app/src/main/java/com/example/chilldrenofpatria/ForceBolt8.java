package com.example.chilldrenofpatria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ForceBolt8 extends AppCompatActivity  implements View.OnClickListener {

    Intent intent;
    Chapter1Activity sch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_bolt8);

        TextView textViewChapter1 = findViewById(R.id.toolbar_textview);
        sch1 = new Chapter1Activity();
        textViewChapter1.setTextSize(15);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textViewChapter1.setText(Html.fromHtml("HP: " + sch1.health + "  SS: " + sch1.spellSlot + "<sup><small>1st<small><sup>"));

        TextView textView = (TextView) findViewById(R.id.text_scrollForceBolt8);
        String text ="“Dole Kakaw.”\n" +
                "The bolt smashes against the man’s face. His head flies back and you hear a snap. The sword clatters to the floor and the man falls on you. Blood streams from his shattered cheek, speckling your face. You push him off of you and clamber to your feet. As you stand, you look at the man, his broken face in a pool of blood.\n" +
                "“Oh fuck... Now what?” you think.\n";
        textView.setText(sch1.Format(text), TextView.BufferType.SPANNABLE);

        // if the button on Go to town hall continue
        // is clicked, go to the meet 5 intent
        Button buttonFollowTheLIght = findViewById(R.id.button_FollowTheLight1611);
        Button buttonCheckTheBody = findViewById(R.id.button_CheckTheBody1612);


        // when the button is clicked
        //15.1.1.4
        buttonFollowTheLIght.setOnClickListener(this);
        buttonCheckTheBody.setOnClickListener(this);
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
        switch (item.getItemId()) {
            case R.id.goback:
                intent = new Intent(this, Book1Activity.class);
                startActivity(intent);
                break;
        }


        return true;
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.button_FollowTheLight1611:
                intent = new Intent(this,FollowTheLIght1611.class);
                startActivity(intent);
                break;
            case R.id.button_CheckTheBody1612:
                intent = new Intent(this, CheckTheBody1612.class);
                startActivity(intent);
                break;


        }

    }

    // if the button back button pressed
    public void onBackPressed() {
        // if the back button is pressed, the home activity is summoned

        intent = new Intent(this, Book1Activity.class);
        startActivity(intent);

    }

}
