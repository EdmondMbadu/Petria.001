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

public class FollowTheLight1611Continue extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Chapter1Activity sch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_the_light1611_continue);


        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
        sch1 = new Chapter1Activity();
        textViewChapter1.setTextSize(15);
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textViewChapter1.setText(Html.fromHtml("HP: "+sch1.health+"  SS: "+ sch1.spellSlot+"<sup><small>1st<small><sup>"));

        TextView textView = (TextView) findViewById(R.id.text_scrollFollowTheLight1611);
        String text="Slowly you take a breath. You look at the ball of light and begin to walk toward it. You get just close enough to touch it. It begins moving away from you. Down the stairway to the first floor, you follow the light. It takes you out into the town square.";
        textView.setText(sch1.Format(text), TextView.BufferType.SPANNABLE);

        // if the button on Go to town hall continue
        // is clicked, go to the meet 5 intent
        Button buttonCast= findViewById(R.id.button_CastDancingLights);
        Button buttonStay= findViewById(R.id.button_StayInTheCover);




        // when the button is clicked
        buttonCast.setOnClickListener(this);
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
                intent= new Intent(this, Book1Activity.class);
                startActivity(intent);
                break;
        }



        return true;
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()){
            case R.id.button_CastDancingLights:
                intent = new Intent(this, CastDancingLights.class);
                startActivity(intent);
                break;
            case R.id.button_StayInTheCover:
                intent = new Intent(this, StayInTheCover.class);
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
