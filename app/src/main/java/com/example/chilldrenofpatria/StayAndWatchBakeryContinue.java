package com.example.chilldrenofpatria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class StayAndWatchBakeryContinue extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay_and_watch_bakery_continue);

        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
//        textViewChapter1.setText("Chapter 1");

        setTitle("Chapter 1");

        TextView textView = (TextView) findViewById(R.id.text_scrollChapter1StayBakeryContinue);
        String stayBakery="You do as David says; you close up the shop. You finish as the last of the sunlight disappears. The town bell rings again. \n" +
                "“Why is it ringing again?” You think. \n" +
                "The bell rings 15 times.\n" +
                "“Curfew?” You think. “What happened to make them change the curfew?”\n" +
                "You lock the doors to the bakery.\n" +
                "“Make sure the windows are locked too Ben.” David says.\n" +
                "“Shit.” You say.\n" +
                "You lock all the windows and then rush upstairs to ask David what happened. He’s talking in a whisper to Hilda. \n" +
                "“So what happened?” You ask. “Why did they make the curfew night fall?”\n" +
                "David looks at you; he’s holding Hilda’s hand. “A few people have gone missing; one of them was your mother’s friend Elena.” He says. “I want the shop closed and you inside before night fall from now on until I say otherwise. If someone wants to do business during, or after, closing come and get me no matter who it is. Understand?”\n" +
                "“Yes father.” You say.\n" +
                "You look down at the ground.\n" +
                "David gives a melancholy smile. “Good, thank you.” He says “Now, one question before you go. Have you seen anything odd that we should know about?”\n" +
                "You think to the man wandering around while everyone was in the town hall. \n" +
                "“Uhh, yeah.” You say. “There was a man walking around the edges of town when everyone was in the meeting. When he realized I saw him he just kind of looked at me for a while, then he slipped behind the tannery.”\n" +
                "David looks at Hilda, then back at you. “Thank you.” He says. “Go get some food, then go to bed early. We have a lot to talk about.”\n" +
                "“Have a good night Ben.” Hilda says.\n" +
                "You do as they say and once you finish eating you go to your room, not much larger than a closet, and lay on your bed. Every so often you hear them talking as you drift to asleep.\n";
        textView.setText(stayBakery);
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
