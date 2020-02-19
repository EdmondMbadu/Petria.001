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

public class StayAndWatchBakeryContinue extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Chapter1Activity sch1= new Chapter1Activity();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay_and_watch_bakery_continue);

        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
//        textViewChapter1.setText("Chapter 1");
        textViewChapter1.setTextSize(15);

        TextView textView = (TextView) findViewById(R.id.text_scrollChapter1StayBakeryContinue);
        String stayBakery="You do as David says and close up the shop. You finish as the last of the sunlight disappears. The town bell rings again. \n" +
                "“Why is it ringing again?” you think. \n" +
                "The bell rings fifteen times.\n" +
                "“Curfew?” you think. “Why did they change the curfew?”\n" +
                "You lock the doors to the bakery.\n" +
                "“Make sure the windows are locked too, Ben,” David says.\n" +
                "“Shit,” You say.\n" +
                "You lock all the windows and then rush upstairs to ask David what happened. He’s talking in a whisper to Hilda. \n" +
                "“So what happened?” You ask. “Why did they make the curfew night fall?”\n" +
                "David looks at you, holding Hilda’s hand. “A few people have gone missing; one of them was your mother’s friend Elena,” he says. “I want the shop closed and you inside before night fall from now on until I say otherwise. If someone wants to do business during, or after, closing come and get me no matter who it is. Understand?”\n" +
                "“Yes, Father,” You say.\n" +
                "You look down at the ground.\n" +
                "David gives a melancholy smile. “Thank you,” he sighs, then looks at you. “Have you seen anything out of ordinary?”\n" +
                "You think to the man wandering around while everyone was in the town hall. \n" +
                "“Uh, yeah,” you say. “There was a man walking around the edges of town when everyone was in the meeting. When he realized I saw him, he just kind of looked at me for a while, then he slipped behind the tannery.”\n" +
                "David glances at Hilda, then back at you. “Thank you,” he says. “Go get some food, then go to bed early. We have a lot to talk about.”\n" +
                "“Have a good night, Ben,” Hilda calls after you.\n" +
                "You do as they say and once you finish eating, you go to your room, not much larger than a closet, and lay on your bed. Every so often, their voices echo in the house as you drift to sleep.\n";

        textView.setText(sch1.Format(stayBakery), TextView.BufferType.SPANNABLE);
        Button button= findViewById(R.id.button_stayWatchBakeryContinue2);
        button.setOnClickListener(this);
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

    // if the back button is pressed, go to home activity
    public void onBackPressed(){
        // if the back button is pressed more than once, at the home activity
        // get out of the screen
        intent= new Intent(this, Book1Activity.class);
        startActivity(intent);


    }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_stayWatchBakeryContinue2:
                intent= new Intent(this, Meet_5.class);
                startActivity(intent);
                break;
        }

    }
}
