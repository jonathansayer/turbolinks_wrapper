package com.example.turbolinkswrapper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.basecamp.turbolinks.TurbolinksSession;
import com.basecamp.turbolinks.TurbolinksView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assumes an instance variable is defined. Find the view you added to your
        // layout in step 1.

        turbolinksView = (TurbolinksView) findViewById(R.id.turbolinks_view);

        TurbolinksSession.getDefault(this)
                .activity(this)
                .adapter(this)
                .view(turbolinksView)
                .visit("https://basecamp.com");
    }
}






