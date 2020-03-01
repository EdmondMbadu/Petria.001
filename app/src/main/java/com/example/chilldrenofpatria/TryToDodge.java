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
import android.widget.Toast;

public class TryToDodge extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Chapter1Activity sch1;
    //15.1.1.5
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_to_dodge);



        TextView textViewChapter1 = findViewById(R.id.toolbar_textview);
        sch1 = new Chapter1Activity();
        textViewChapter1.setTextSize(15);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textViewChapter1.setText(Html.fromHtml("HP: " + sch1.health + "  SS: " + sch1.spellSlot + "<sup><small>1st<small><sup>"));

        TextView textView = (TextView) findViewById(R.id.text_scrollTryToDodge);
        String text = "“Cha.”\n" +
                "\tA shield of energy surrounds you just as the man begins to swing. The sword breaks through the shield but misses, coming down on the floor next to you.\n" +
                "\tHe falls to the floor with his weapon, but begins to stagger back to his feet. He’s right in front of you now. He looks very weak.\n";
        textView.setText(sch1.Format(text), TextView.BufferType.SPANNABLE);

        // if the button on Go to town hall continue
        // is clicked, go to the meet 5 intent
        Button buttonForceBolt8 = findViewById(R.id.button_forceBolt8);
        Button buttonforceStrike9 = findViewById(R.id.button_ForceStrike9);


        // when the button is clicked
        //15.1.1.4
        buttonForceBolt8.setOnClickListener(this);
        buttonforceStrike9.setOnClickListener(this);
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
            case R.id.button_forceBolt8:
                //15.1.1.6
                intent = new Intent(this, ForceBolt8.class);
                startActivity(intent);

                break;
            case R.id.button_ForceStrike9:

                if(sch1.spellSlot<=0){
                    Toast.makeText(this, "You do not have enough spell slot!", Toast.LENGTH_SHORT).show();
                }
                else {
                    intent = new Intent(this, ForceStrike9.class);
                    startActivity(intent);
                }
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
