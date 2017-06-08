package com.perculacreative.peter.recyclerpinchzoom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int dimension = 10;

        PinchRecyclerView pinchRecyclerView = (PinchRecyclerView) findViewById(R.id.pinch_recycler_view);
        pinchRecyclerView.setLayoutManager(new GridLayoutManager(this, dimension));
        SimpleAdapter simpleAdapter = new SimpleAdapter(dimension * dimension);
        pinchRecyclerView.setAdapter(simpleAdapter);
    }
}
