package com.mstetson.panelview_alpha.Screens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mstetson.panelview_alpha.MainMenu;
import com.mstetson.panelview_alpha.R;

public class ScreenSelect extends Activity {

    Button appendixA;
    Button appendixB;
    Button appendixC;
    Button appendixD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_select);

        TextView currentScreen = (TextView) findViewById(R.id.current_screen);
        currentScreen.setText("Screen Select");

       // appendixA = (Button) findViewById(R.id.appendix_a_background);
       // appendixB = (Button) findViewById(R.id.appendix_b_background);
       // appendixC = (Button) findViewById(R.id.appendix_c_background);
        ////appendixD = (Button) findViewById(R.id.appendix_d_background);

        makeFullscreen();

    }

    public void gotoInspections(View view) {
        startActivity(new Intent(getApplicationContext(), InspectionsActivity.class));
    }






    public void returnPressed(View view) {
        //startActivity(new Intent(getApplicationContext(), MainMenu.class));
        //finish();
        onBackPressed();
    }
    //Hides nav and notification bar
    public void makeFullscreen() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
    }
    public void gotoScreenSelect(View view) {
        startActivity(new Intent(getApplicationContext(), ScreenSelect.class));
        // finish();
    }
    public void gotoLogin(View view) {
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    }
    public void gotoLogout(View view) {

        Toast.makeText(getApplicationContext(),
                "Button is clicked", Toast.LENGTH_LONG).show();
    }
    public void gotoError(View view) {
        Toast.makeText(getApplicationContext(),
                "Button is clicked", Toast.LENGTH_LONG).show();
    }
    public void gotoEstop(View view) {
        startActivity(new Intent(getApplicationContext(), EStopStatus.class));
    }
}



