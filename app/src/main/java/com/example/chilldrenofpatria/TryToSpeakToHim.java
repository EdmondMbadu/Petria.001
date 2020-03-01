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

public class TryToSpeakToHim extends AppCompatActivity  implements View.OnClickListener {

    Intent intent;
    Chapter1Activity sch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_to_speak_to_him);
        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
        sch1 = new Chapter1Activity();
        textViewChapter1.setTextSize(15);
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textViewChapter1.setText(Html.fromHtml("HP: "+sch1.health+"  SS: "+ sch1.spellSlot+"<sup><small>1st<small><sup>"));

        TextView textView = (TextView) findViewById(R.id.text_scrollForceStrikeBolt);
        String text="“Reshega Kakaw.”\n" +
                "A spear of energy launches from your mouth as you speak. It strikes the man in the chest. He flies backward hitting the wall then drops to the floor. For a few moments, you sit and watch his unmoving body. As you think about what to do next, you hear him gasp. His body begins stumbling to its feet. Blood is streaming from his chest. He begins stumbling towards the stairs.\n";

        textView.setText(sch1.Format(text), TextView.BufferType.SPANNABLE);

        // if the button on Go to town hall continue
        // is clicked, go to the meet 5 intent
        Button buttonfollowTheLight= findViewById(R.id.button_FollowTheLight);
        Button buttonCheckTheBody= findViewById(R.id.button_CheckTheBody);



        // when the button is clicked
        buttonfollowTheLight.setOnClickListener(this);
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
            case R.id.button_FollowTheLight1611:
                intent = new Intent(this, FollowTheLightAgain.class);
                startActivity(intent);
                break;
            case R.id.button_CheckTheBody1612:
                intent= new Intent(this, CheckTheBody.class);
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
