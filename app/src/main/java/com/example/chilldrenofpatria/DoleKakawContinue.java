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

public class DoleKakawContinue extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Chapter1Activity sch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dole_kakaw_continue);

        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
        sch1 = new Chapter1Activity();
        textViewChapter1.setTextSize(15);
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textViewChapter1.setText(Html.fromHtml("HP: "+sch1.health+"  SS: "+ sch1.spellSlot+"<sup><small>1st<small><sup>"));

        TextView textView = (TextView) findViewById(R.id.text_scrollDoleKakawContinue);
        String text="You open the door. The handle feels strange, the lack of noise makes you uneasy. It takes you back to your room. It feels odd though. Your bed is crooked, and the door to the walkway is open.\n" +
                "“Someone really was in here,” you think.\n" +
                "You look back at the phantom door, but it’s gone. What hasn’t disappeared is the faint light drifting slowly through the air. It hovers in the hallway just in sight. You look at the book in your hand, and the ring on your finger.\n" +
                "“Is this happening?” You think. “Maybe it’s just a dream.”\n";


        textView.setText(sch1.Format(text), TextView.BufferType.SPANNABLE);

        // if the button on Go to town hall continue
        // is clicked, go to the meet 5 intent
        Button buttonFollowLight= findViewById(R.id.button_FollowTheLight);
        Button buttongoToSleep= findViewById(R.id.button_GotoSleep);

        buttonFollowLight.setOnClickListener(this);
        buttongoToSleep.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {


        switch (view.getId()){
            case R.id.button_FollowTheLight:
                intent = new Intent(this, FollowTheLight.class);
                startActivity(intent);
                break;
            case R.id.button_GotoSleep:
                intent = new Intent(this,GoToSleep.class);
                startActivity(intent);
                break;
        }


    }

    // if the button back button pressed
    public void onBackPressed(){
        // if the back button is pressed, the home activity is summoned

        intent= new Intent(this, Book1Activity.class);
        startActivity(intent);

    }

}
