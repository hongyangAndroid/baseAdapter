package com.zhy.quickdev.adapter.sample;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.Toast;

import com.zhy.quickdev.adapter.CommonAdapter;
import com.zhy.quickdev.adapter.R;
import com.zhy.quickdev.adapter.ViewHolder;
import com.zhy.quickdev.adapter.sample.bean.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhy on 15/9/4.
 */
public class SingleItemTypeFragment extends ListFragment
{
    private List<Bean> mDatas;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        initDatas();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        setListAdapter(new CommonAdapter<Bean>(getActivity(), mDatas,
                R.layout.item_single_listview)
        {
            @Override
            public void convert(final ViewHolder holder, final Bean bean)
            {
                holder.setText(R.id.id_title, bean.getTitle())
                        .setText(R.id.id_desc, bean.getDesc())
                        .setText(R.id.id_time, bean.getTime())
                        .setText(R.id.id_phone, bean.getPhone());

                holder.setOnClickListener(R.id.id_title, new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Toast.makeText(getActivity(), bean.getTitle(), Toast.LENGTH_SHORT).show();
                    }
                });
            }

        });

    }

    private void initDatas()
    {
        mDatas = new ArrayList<Bean>();

        Bean bean = new Bean("Android新技能Get 1",
                "Android打造万能的ListView和GridView适配器", "2014-12-12", "10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能Get 2", "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能Get 3", "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能Get 4", "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能Get 5", "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能Get 6", "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能Get 7", "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能Get 8", "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);
        bean = new Bean("Android新技能Get 9", "Android打造万能的ListView和GridView适配器",
                "2014-12-12", "10086");
        mDatas.add(bean);

    }
}
