package com.example.chilldrenofpatria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StayAndWatchBakery extends AppCompatActivity implements View.OnClickListener {


    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay_and_watch_bakery);

        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // set the title of the tool bar as Chapter 1
        // the beauty of this part is that I only have one toolbar resource file (toolbar.xml) that I will use again and again
        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
//        textViewChapter1.setText("Chapter 1");
        setTitle("Chapter 1");

        TextView textView = (TextView) findViewById(R.id.text_scrollChapter1StayBakery);
        String stayBakery="They would be furious with you if you left the bakery and something was stolen. \n" +
                "“I’m sure whatever is going on David will let me know tonight after the bakery closes.” You think.\n" +
                "\tSo you stand in front of the bakery, filling your mind with all the things they might be talking about. Every so often you hear sounds of shouting voices, but with the doors closed and the bakery several buildings down there isn’t much to hear. \n" +
                "\tOut of the corner of your eye, you see a man wearing a brown cloak. You don’t recognize him. He must be a traveler. He looks around at the abandoned shops. He sees you. He stops and you lock eyes. A strange dizzy feeling comes over you for a moment, but the feeling passes as quickly as it arrives. For a while, you just stare at each other, but eventually he breaks your gaze, and slips behind the tannery.\n" +
                "\t“How odd, like when an animal sees you in the woods.” You think.\n" +
                "\tUnfortunately, that was the highlight of the rest of the day. The sun sinks below the town buildings when people finally start trickling out of the town hall. David and Hilda are some of the first to leave. They walk quickly to the bakery.\n" +
                "\t“What was that all about David?” You ask.\n" +
                "\t“Close the bakery first, I’ll tell you upstairs.” David says.\n";
        textView.setText(stayBakery);

        Button button= findViewById(R.id.button_stayWatchBakeryContinue);
        button.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_stayWatchBakeryContinue:
                intent = new Intent(this, StayAndWatchBakeryContinue.class);
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
