package com.amazon.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] appNames = {
                "Sunshine",
                "Spotify Streamer",
                "Scores App",
                "Library App",
                "Build it Bigger",
                "XYZ Reader",
                "Capstone: My Own App"
        };
        ArrayAdapter appItemListAdapter = new ArrayAdapter(
                this,
                R.layout.appitem,
                R.id.appitem,
                appNames);
        ListView appItemList = (ListView) findViewById(R.id.list_of_appitems);
        appItemList.setAdapter(appItemListAdapter);
    }
}
