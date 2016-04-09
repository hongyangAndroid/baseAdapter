package com.zhy.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.zhy.base.adapter.ViewHolder;
import com.zhy.base.adapter.recyclerview.DividerItemDecoration;
import com.zhy.base.adapter.recyclerview.OnItemClickListener;
import com.zhy.base.adapter.recyclerview.support.SectionAdapter;
import com.zhy.base.adapter.recyclerview.support.SectionSupport;

import java.util.ArrayList;
import java.util.List;

public class RvWidthHeaderActivity extends AppCompatActivity
{

    private RecyclerView mRecyclerView;
    private List<String> mDatas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        initDatas();
        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));

        SectionSupport<String> sectionSupport = new SectionSupport<String>()
        {
            @Override
            public int sectionHeaderLayoutId()
            {
                return R.layout.header;
            }

            @Override
            public int sectionTitleTextViewId()
            {
                return R.id.id_header_title;
            }

            @Override
            public String getTitle(String s)
            {
                return s.substring(0, 1);
            }
        };
        SectionAdapter<String> adapter = new SectionAdapter<String>(this, R.layout.item_list, mDatas, sectionSupport)
        {

            @Override
            public void convert(ViewHolder holder, String s)
            {
                holder.setText(R.id.id_item_list_title, s);
            }
        };
        adapter.setOnItemClickListener(new OnItemClickListener<String>()
        {
            @Override
            public void onItemClick(ViewGroup parent, View view, String o, int position)
            {
                Toast.makeText(RvWidthHeaderActivity.this, "Click:" + position + " => " + o, Toast.LENGTH_SHORT).show();
            }

            @Override
            public boolean onItemLongClick(ViewGroup parent, View view, String o, int position)
            {
                return false;
            }
        });
        mRecyclerView.setAdapter(adapter);
    }

    private void initDatas()
    {
        for (int i = 1; i < 3; i++)
        {
            mDatas.add("A" + i);
        }

        for (int i = 1; i < 6; i++)
        {
            mDatas.add("B" + i);
        }

        for (int i = 1; i < 7; i++)
        {
            mDatas.add("C" + i);
        }

        for (int i = 1; i < 9; i++)
        {
            mDatas.add("D" + i);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rv_width_header, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
