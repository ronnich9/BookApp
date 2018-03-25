package com.feriramara.alex.book_app;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    WebView mWb;
    TextView mTextView;
    String file = "file:///android_asset/Capital Volume I_split_000.htm";
    boolean hideToolBar = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        if(Build.VERSION.SDK_INT>=24){
            try{
                Method m = StrictMode.class.getMethod("disableDeathOnFileUriExposure");
                m.invoke(null);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        loadText(file);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        mWb.goBack();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        } else

        if (id == R.id.rate) {
            rateMe();
        } else if (id == R.id.exit) {
            this.finishAffinity();
        }

        return super.onOptionsItemSelected(item);
    }

    private void rateMe() {

        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" +getPackageName())));
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.start) {

            file = "file:///android_asset/Capital Volume I_split_001.htm";
            loadText(file);

        } else if (id == R.id.chapter1) {

            file = "file:///android_asset/Capital Volume I_split_010.htm";
            loadText(file);

        } else if (id == R.id.chapter2) {

            file = "file:///android_asset/Capital Volume I_split_011.htm";
            loadText(file);

        } else if (id == R.id.chapter3) {

            file = "file:///android_asset/Capital Volume I_split_012.htm";
            loadText(file);

        } else if (id == R.id.chapter4) {

            file = "file:///android_asset/Capital Volume I_split_014.htm";
            loadText(file);

        } else if (id == R.id.chapter5) {

            file = "file:///android_asset/Capital Volume I_split_015.htm";
            loadText(file);

        } else if (id == R.id.chapter6) {

            file = "file:///android_asset/Capital Volume I_split_016.htm";
            loadText(file);

        } else if (id == R.id.chapter7) {

            file = "file:///android_asset/Capital Volume I_split_018.htm";
            loadText(file);

        } else if (id == R.id.chapter8) {

            file = "file:///android_asset/Capital Volume I_split_019.htm";
            loadText(file);

        } else if (id == R.id.chapter9) {

            file = "file:///android_asset/Capital Volume I_split_020.htm";
            loadText(file);

        } else if (id == R.id.chapter10) {

            file = "file:///android_asset/Capital Volume I_split_021.htm";
            loadText(file);

        } else if (id == R.id.chapter11) {

            file = "file:///android_asset/Capital Volume I_split_022.htm";
            loadText(file);

        } else if (id == R.id.chapter12) {

            file = "file:///android_asset/Capital Volume I_split_024.htm";
            loadText(file);

        } else if (id == R.id.chapter13) {

            file = "file:///android_asset/Capital Volume I_split_025.htm";
            loadText(file);

        } else if (id == R.id.chapter14) {

            file = "file:///android_asset/Capital Volume I_split_026.htm";
            loadText(file);

        } else if (id == R.id.chapter15) {

            file = "file:///android_asset/Capital Volume I_split_027.htm";
            loadText(file);

        } else if (id == R.id.chapter16) {

            file = "file:///android_asset/Capital Volume I_split_030.htm";
            loadText(file);

        } else if (id == R.id.chapter17) {

            file = "file:///android_asset/Capital Volume I_split_031.htm";
            loadText(file);

        } else if (id == R.id.chapter18) {

            file = "file:///android_asset/Capital Volume I_split_032.htm";
            loadText(file);

        } else if (id == R.id.chapter19) {

            file = "file:///android_asset/Capital Volume I_split_034.htm";
            loadText(file);

        } else if (id == R.id.chapter20) {

            file = "file:///android_asset/Capital Volume I_split_035.htm";
            loadText(file);

        } else if (id == R.id.chapter21) {

            file = "file:///android_asset/Capital Volume I_split_036.htm";
            loadText(file);

        } else if (id == R.id.chapter22) {

            file = "file:///android_asset/Capital Volume I_split_037.htm";
            loadText(file);

        } else if (id == R.id.chapter23) {

            file = "file:///android_asset/Capital Volume I_split_039.htm";
            loadText(file);

        } else if (id == R.id.chapter24) {

            file = "file:///android_asset/Capital Volume I_split_040.htm";
            loadText(file);

        } else if (id == R.id.chapter25) {

            file = "file:///android_asset/Capital Volume I_split_041.htm";
            loadText(file);

        } else if (id == R.id.chapter26) {

            file = "file:///android_asset/Capital Volume I_split_044.htm";
            loadText(file);

        } else if (id == R.id.chapter27) {

            file = "file:///android_asset/Capital Volume I_split_045.htm";
            loadText(file);

        } else if (id == R.id.chapter28) {

            file = "file:///android_asset/Capital Volume I_split_046.htm";
            loadText(file);

        } else if (id == R.id.chapter29) {

            file = "file:///android_asset/Capital Volume I_split_047.htm";
            loadText(file);

        } else if (id == R.id.chapter30) {

            file = "file:///android_asset/Capital Volume I_split_048.htm";
            loadText(file);

        } else if (id == R.id.chapter31) {

            file = "file:///android_asset/Capital Volume I_split_049.htm";
            loadText(file);

        } else if (id == R.id.chapter32) {

            file = "file:///android_asset/Capital Volume I_split_050.htm";
            loadText(file);

        } else if (id == R.id.chapter33) {

            file = "file:///android_asset/Capital Volume I_split_051.htm";
            loadText(file);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void loadText (String file) {
        mWb = (WebView) findViewById(R.id.wv_Tab1);
        mWb.loadUrl(file);
        mWb.getSettings().setJavaScriptEnabled(true);
    }
}
