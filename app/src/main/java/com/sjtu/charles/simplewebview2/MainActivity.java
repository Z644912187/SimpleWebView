package com.sjtu.charles.simplewebview2;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

import com.sjtu.charles.adapter.SampleRecyclerAdapter;
import com.sjtu.charles.view.SampleDivider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initWebview();
        initRecyclerview();
        initOther();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private void initOther() {
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById(R.id.nest_scrollview);
        nestedScrollView.setNestedScrollingEnabled(true);
        nestedScrollView.setSmoothScrollingEnabled(true);
    }

    private void initWebview() {
        WebView webView = (WebView) findViewById(R.id.wb_content);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            webView.setNestedScrollingEnabled(false);
//        }

        webView.loadUrl("http://downloads.jianshu.io/apps/haruki/test/article.html");
    }

    private void initRecyclerview() {
       /* RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setNestedScrollingEnabled(false);

        // RecyclerView ItemDecoration (divider)
        RecyclerView.ItemDecoration itemDecoration = new SampleDivider(this);
        recyclerView.addItemDecoration(itemDecoration);
        // RecyclerView layout manager
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        // RecyclerView adapter
        SampleRecyclerAdapter sampleRecyclerAdapter =
                new SampleRecyclerAdapter(DataHelp.getSampleData(30));
        recyclerView.setAdapter(sampleRecyclerAdapter);*/

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
