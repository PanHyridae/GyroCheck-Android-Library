package com.marlonjones.gyrocheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;

import com.afollestad.materialdialogs.MaterialDialog;
import com.marlonjones.gyrochecklib.GyroCheck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        new MaterialDialog.Builder(this)
                .title(R.string.opening_title)
                .content(R.string.opening)
                .positiveText(R.string.ok)
                .show();

        /**
         * GyroCheck.addTo(this); - Adds the GyroCheck library to your current view.
         * BuildConfig.DEBUG - If the app is in DEBUG mode, it will show the library.
         **/

        if (BuildConfig.DEBUG) {
            GyroCheck.addTo(this);
        }
        else {
            GyroCheck.addTo(this);
            /**
             * Without using BuildConfig.DEBUG, the library will be shown
             * in the view you put it in, no matter the build type.
             **/
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
            new MaterialDialog.Builder(this)
                    .title(R.string.action_settings)
                    .content(Html.fromHtml(getString(R.string.about_body)))
                    .positiveText(R.string.dismiss)
                    .show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
