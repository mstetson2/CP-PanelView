package com.mstetson.panelview_alpha.Screens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mstetson.panelview_alpha.R;

public class InspectionsActivity extends Activity {

    Button insp1;
    Button insp2;
    Button insp2a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspections);

        TextView currentScreen = (TextView) findViewById(R.id.current_screen);
        currentScreen.setText("Inspections");

        makeFullscreen();
        buttonSetup();
    }

    private void buttonSetup() {
        insp1 = (Button) findViewById(R.id.insp_1_background);
        insp2 = (Button) findViewById(R.id.insp_2_background);
        insp2a = (Button) findViewById(R.id.insp_2_background_inner);

        insp1.setEnabled(false);
        insp2.setEnabled(false);
        insp2a.setEnabled(false);
    }
    //Hides nav and notification bar
    public void makeFullscreen() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
    }
    public void gotoError(View view) {
        Toast.makeText(getApplicationContext(),
                "Button is clicked", Toast.LENGTH_LONG).show();
    }
    public void gotoEstop(View view) {
        startActivity(new Intent(getApplicationContext(), EStopStatus.class));
    }
    public void returnPressed(View view) {
        onBackPressed();
        finish();
    }
}
