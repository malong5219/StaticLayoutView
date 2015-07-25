package com.ragnarok.staticlayouttest.ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.ragnarok.staticlayouttest.app.R;
import com.ragnarok.staticlayouttest.util.FpsCalculator;

public class StaticLongStringUI extends ActionBarActivity {

    private StaticLayoutView staticLayoutView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_long_string_ui);
        
        staticLayoutView = (StaticLayoutView) findViewById(R.id.static_layout_view);
        
        staticLayoutView.setLayout(StaticLayoutManager.getInstance().getLongStringLayout());

        FpsCalculator.instance().start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        FpsCalculator.instance().stop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_static_long_string_ui, menu);
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
