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

public class StayInTheCover extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Chapter1Activity sch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay_in_the_cover);

        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
        sch1 = new Chapter1Activity();
        textViewChapter1.setTextSize(15);
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textViewChapter1.setText(Html.fromHtml("HP: "+sch1.health+"  SS: "+ sch1.spellSlot+"<sup><small>1st<small><sup>"));

        TextView textView = (TextView) findViewById(R.id.text_scrollStayInTheCover);
        String text="“I think lights would be alright,” you say.\n" +
                "\t“Tawlay geemmen”\n" +
                "\tA little blue ball of light appears. As you move, it doesn’t follow you. You concentrate on it, and after a little practice it moves nearly in sync with you.\n" +
                "\t“If the spell is called dancing lights, I wonder if I can cast more than one,” you think.\n" +
                "\t“Tawlay geemmen”\n" +
                "\tAnother blue light appears in front of you. You think for a moment then cast it again.\n" +
                "\t“Tawlay geemmen”\n" +
                "\tThis time four little lights appear. The other two flicker out.\n" +
                "\t“I guess I can only make four,” you say.\n" +
                "\tPaying attention to the lights has left you distracted. Not sure how long you’ve been following the little light you start to get nervous. Your feeling shifts to anticipation when you hear the beating of drums. This distracts you from the lights, and all five disappear. Once gone though, you can clearly make out the light of a fire. Noone’s light vanishes too.\n" +
                "\t“I guess this is where I’m supposed to be,” you say.\n";
        textView.setText(sch1.Format(text), TextView.BufferType.SPANNABLE);

        // if the button on Go to town hall continue
        // is clicked, go to the meet 5 intent
        Button buttonStay= findViewById(R.id.button_StayInTheCoverContinue);





        // when the button is clicked
        buttonStay.setOnClickListener(this);


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
                intent= new Intent(this, Book1Activity.class).putExtra("from", "StayInTheCover");
                startActivity(intent);
                break;
        }



        return true;
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()){
            case R.id.button_StayInTheCoverContinue:
                intent = new Intent(this, CastDancingLightsContinue.class).putExtra("from", "StayInTheCover");
                startActivity(intent);
                break;



        }

    }

    // if the button back button pressed
    public void onBackPressed(){
        // if the back button is pressed, the home activity is summoned

        intent= new Intent(this, Book1Activity.class).putExtra("from", "StayInTheCover");
        startActivity(intent);

    }

}
