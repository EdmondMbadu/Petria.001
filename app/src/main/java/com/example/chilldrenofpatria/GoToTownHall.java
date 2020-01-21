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

 public class GoToTownHall extends AppCompatActivity implements View.OnClickListener {


     Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_town_hall);

        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
//        textViewChapter1.setText("Chapter 1");
        setTitle("Chapter 1");

        TextView textView = (TextView) findViewById(R.id.text_scrollChapter1GoToTown);
        String stayBakery="Every other shop is abandoned, there no one here to steal anything. \n" +
                "“There’s no reason I can’t go and listen to what they have to say.” You think. “Just to be safe though, I should lock the doors and put the copper in my coin pouch.”\n" +
                "Once the doors are lock you put the key and the coin pouch inside your pants and walk into one of the servant doors on the side of the town hall.\n" +
                "\tAll the servants are in the main chamber of the town hall so no one is around to question what you’re doing. You slip through one of the doors that leads to the main chamber and stay in the back to avoid being seen. The mayor of the town, Godwin Clark, stands on a raised platform on the back wall of the hall. He has long peppered hair and a clean back robe. He raises his hands and waits for the crowd of people to quiet down.\n" +
                "“I’ve rung the bell to inform you that the curfew will come before sunset until told otherwise, and to explain my reasoning.” Says Clark.\n" +
                "The crowd erupts. They shout about business and the inconvenience of it all.\n" +
                "“Enough!” Clark says.\n" +
                "He raises his hands again and waits until the crowd quiets.\n" +
                "“We’ve had five people disappear within the week, and I don’t mean drunks and passersby neither. James Cook, Elena Tanner, Milo Fletcher, Ode Cook and Nathan Rolfe have all gone missing.” He continues.\n" +
                "\tWhispers fill the room. Clark lets the people talk amongst themselves for a while then razes his hands back in the air.\n" +
                "\t“We have no idea what has been happening, but from now on look after each other and go to your homes once the curfew bell is rung.” Clark Says.\n" +
                "\tYou realize now is when you had better leave, you start walking toward the exit.\n" +
                "\t“If you have any questions stay after, you are dismissed.” Says Clark.\n" +
                "\tYou make a dash for the servant entrance and run out toward the Bakery. You make it back and when you turn to look at the crowd you find David and Hilda speaking to each other intently. They walk to the bakery without talking to anyone else.\n" +
                "\t“What was that about?” You ask.\n" +
                "“Close the bakery first, I’ll tell you upstairs.” David says.\n" +
                "\tYou exhale once you see them walk up the stairs, looking down at the bread stand. \n" +
                "\t“That’s odd.” You think. Two loaves of bread are gone. “They won’t notice they’re too preoccupied: But who was here to take it?” You think.\n";
        textView.setText(stayBakery);
        Button button= findViewById(R.id.button_GoTownHallContinue);
        button.setOnClickListener(this);

    }

     @Override
     public void onClick(View view) {
         switch (view.getId()){
             case R.id.button_GoTownHallContinue:
                 intent= new Intent(this, GoToTownHallContinue.class);
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
