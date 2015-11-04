package com.example.nmoya.tees;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<TShirt> allTShirts = new ArrayList<TShirt>();
        TShirt t = new TShirt("https://dov5cor25da49.cloudfront.net/products/5655/636x460design_01.jpg", "threadless.com", "@drawable/sample_store", 25, false);
        allTShirts.add(t);
        t = new TShirt("https://dov5cor25da49.cloudfront.net/products/5655/636x460design_01.jpg", "threadless.com.br", "@drawable/sample_store", 30, true);
        allTShirts.add(t);
        t = new TShirt("https://dov5cor25da49.cloudfront.net/products/5655/636x460design_01.jpg", "nikolasmoya.com", "@drawable/sample_store", 35, true);
        allTShirts.add(t);

        ListAdapter adapter = new AdapterListView(this, allTShirts);
        ListView listView = (ListView) findViewById(R.id.MainListView);
        listView.setAdapter(adapter);

//        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String picked = "You selected " + String.valueOf(parent.getItemAtPosition(position));
//                Toast.makeText(MainActivity.this, picked, Toast.LENGTH_SHORT).show();
//            }
//        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
