package com.example.chilldrenofpatria;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ComponentActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Book1Activity extends AppCompatActivity implements View.OnClickListener {


    Intent intent;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);


        dbHandler = new DBHandler(this, null);
        dbHandler.updateChapter("1",5,2,"Book1Activity","HomeActivity");

        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView textViewChapter1=findViewById(R.id.toolbar_textview);
         setTitle("Book of Bennet Baker");


        toolbar.setBackgroundColor((Color.parseColor("#262626")));
        // to make the back arrow available (do not forget to go to manifest to set the parent of the activity)
//        getSupportActionBar().setTitle("The Book of Bennett Baker");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);  // Not working


        // Implement the Onclick listener so that only one method will take care of everything
        Button buttonChapter1 = findViewById(R.id.button_chapter1);
        Button buttonChapter2 = findViewById(R.id.button_chapter2);
        Button buttonChapter3 = findViewById(R.id.button_chapter3);

        buttonChapter1.setOnClickListener(this);
        buttonChapter2.setOnClickListener(this);
        buttonChapter3.setOnClickListener(this);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_book1, menu);
        return true;
    }
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button_chapter1:
                if(getIntent().getStringExtra("from").equalsIgnoreCase("Home")) {
                    intent = new Intent(this, Chapter1Activity.class);
                    startActivity(intent);
                }
                else if(getIntent().getStringExtra("from").equalsIgnoreCase("Chapter1Activity")) {
                    intent = new Intent(this, Chapter1Activity.class);
                    startActivity(intent);
                }

                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("CastDancingLights")) {
                    intent = new Intent(this, CastDancingLights.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("CastDancingLightsContinue")) {
                    intent = new Intent(this, CastDancingLightsContinue.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("Chapter1Contiinue")) {
                    intent = new Intent(this, Chapter1Contiinue.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("CheckTheBody")) {
                    intent = new Intent(this, CheckTheBody.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("CheckTheBody1612")) {
                    intent = new Intent(this, CheckTheBody1612.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("CheckTheBody1612Continue")) {
                    intent = new Intent(this, CheckTheBody1612Continue.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("DancingLights")) {
                    intent = new Intent(this, DancingLights.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("DoleKakaw")) {
                    intent = new Intent(this, DoleKakaw.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("DoleKakawContinue")) {
                    intent = new Intent(this, DoleKakawContinue.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("DoNothing")) {
                    intent = new Intent(this, DoNothing.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("FollowHer")) {
                    intent = new Intent(this, FollowHer.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("FollowTheLight")) {
                    intent = new Intent(this, FollowTheLight.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("FollowTheLIght1611")) {
                    intent = new Intent(this, FollowTheLIght1611.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("FollowTheLight1611Continue")) {
                    intent = new Intent(this, FollowTheLight1611Continue.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("FollowTheLightAgain")) {
                    intent = new Intent(this, FollowTheLightAgain.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ForceBolt")) {
                    intent = new Intent(this, ForceBolt.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ForceBolt6")) {
                    intent = new Intent(this, ForceBolt6.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ForceBolt8")) {
                    intent = new Intent(this, ForceBolt8.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ForceBolt201")) {
                    intent = new Intent(this, ForceBolt201.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ForceBotCantrip")) {
                    intent = new Intent(this, ForceBotCantrip.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ForceStrike")) {
                    intent = new Intent(this, ForceStrike.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ForceStrike2")) {
                    intent = new Intent(this, ForceStrike2.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ForceStrike9")) {
                    intent = new Intent(this, ForceStrike9.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ForceStrike202")) {
                    intent = new Intent(this, ForceStrike202.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("forceStrikeBolt")) {
                    intent = new Intent(this, forceStrikeBolt.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("GoToSleep")) {
                    intent = new Intent(this, GoToSleep.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("GoToTownHall")) {
                    intent = new Intent(this, GoToTownHall.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("GoToTownHallContinue")) {
                    intent = new Intent(this, GoToTownHallContinue.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("HelpMeeNoone")) {
                    intent = new Intent(this, HelpMeeNoone.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("KillSomeone")) {
                    intent = new Intent(this, KillSomeone.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("Meet_5")) {
                    intent = new Intent(this, Meet_5.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("NO")) {
                    intent = new Intent(this, NO.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ReachWithShield15131")) {
                    intent = new Intent(this, ReachWithShield15131.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("ReactWithShield")) {
                    intent = new Intent(this, ReactWithShield.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("RunOutAndSee")) {
                    intent = new Intent(this, RunOutAndSee.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("SitAndWait")) {
                    intent = new Intent(this, SitAndWait.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("SpeakToTheMan")) {
                    intent = new Intent(this, SpeakToTheMan.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("StayAndWatchBakery")) {
                    intent = new Intent(this, StayAndWatchBakery.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("StayAndWatchBakeryContinue")) {
                    intent = new Intent(this, StayAndWatchBakeryContinue.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("StayInBed")) {
                    intent = new Intent(this, StayInBed.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("StayInTheCover")) {
                    intent = new Intent(this, StayInTheCover.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("StayInTheCoverContinue")) {
                    intent = new Intent(this, StayInTheCoverContinue.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("TryToDodge")) {
                    intent = new Intent(this, TryToDodge.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("TryToDodge15132")) {
                    intent = new Intent(this, TryToDodge15132.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("TryToRunOut")) {
                    intent = new Intent(this, TryToRunOut.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("TryToSpeakToHim")) {
                    intent = new Intent(this, TryToSpeakToHim.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("WhatDoYouWantFromME")) {
                    intent = new Intent(this, WhatDoYouWantFromME.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("WhatIsThat")) {
                    intent = new Intent(this, WhatIsThat.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("WhatIsThatContinue")) {
                    intent = new Intent(this, WhatIsThatContinue.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("WhoAreYou")) {
                    intent = new Intent(this, WhoAreYou.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("WhoAreYouContinue")) {
                    intent = new Intent(this, WhoAreYouContinue.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("WhyAreYouHelping")) {
                    intent = new Intent(this, WhyAreYouHelping.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("YesIDo")) {
                    intent = new Intent(this, YesIDo.class);
                    startActivity(intent);
                }
                else  if(getIntent().getStringExtra("from").equalsIgnoreCase("YesIDoContinue")) {
                    intent = new Intent(this, YesIDoContinue.class);
                    startActivity(intent);
                }
                break;
            case R.id.button_chapter2:
                Toast.makeText(this, "Coming soon!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_chapter3:
                Toast.makeText(this, "Coming very soon!", Toast.LENGTH_SHORT).show();
                break;


        }
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.goback:
                intent= new Intent(this, HomeActivity.class);
                startActivity(intent);
                break;
        }



        return true;
    }
    public void onBackPressed(){
        // if the back button is pressed more than once, at the home activity
        // get out of the screen
        intent= new Intent(this, HomeActivity.class);
        startActivity(intent);


    }





}
