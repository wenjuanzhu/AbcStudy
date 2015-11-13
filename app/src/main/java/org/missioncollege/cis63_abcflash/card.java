package org.missioncollege.cis63_abcflash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class card extends Activity {
    Activity thisAppCompatActivity=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        thisAppCompatActivity = this;
        Intent intent= getIntent();
        int resid = intent.getIntExtra("picname", R.drawable.flashcarda);
        ImageView view = (ImageView) findViewById(R.id.imageView);
        view.setImageResource(resid);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thisAppCompatActivity.finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_card, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
