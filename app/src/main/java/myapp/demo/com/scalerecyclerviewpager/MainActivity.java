package myapp.demo.com.scalerecyclerviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.jinqiu.view.scalerecyclerpager.ScaleRecyclerViewPager;
import com.jinqiu.view.scaleviewpager.ScaleViewPager;

import myapp.demo.com.scalerecyclerviewpager.adapter.RecyclerLayoutAdapter;
import myapp.demo.com.scalerecyclerviewpager.adapter.ViewPagerAdapter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //**** it is just commented because viewpager doesnt work in nested scroll view simply
        //you have to make a work around this example is to use them inside a nested scroll view
   /*     //ScaleViewPager
    //***************************this code works generally ********************************************************
        ScaleViewPager scaleViewPager = (ScaleViewPager) findViewById(R.id.scaleViewPager);
        scaleViewPager.setAdapter(new ViewPagerAdapter());*/

        //ScaleRecyclerViewPager
        ScaleRecyclerViewPager mRecyclerView = (ScaleRecyclerViewPager) findViewById(R.id.viewpager);
        LinearLayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
                false);
        layout.setAutoMeasureEnabled(true);
        mRecyclerView.setLayoutManager(layout);
        mRecyclerView.setAdapter(new RecyclerLayoutAdapter(this, mRecyclerView));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLongClickable(true);

        //************* make sure to put it to false to make recyclerview work under the nested scrollview**********
        mRecyclerView.setNestedScrollingEnabled(false);

    }
}
