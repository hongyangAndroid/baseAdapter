package com.zhy.quickdev.adapter.sample;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListAdapter;

import com.zhy.quickdev.adapter.MultiItemCommonAdapter;
import com.zhy.quickdev.adapter.MultiItemTypeSupport;
import com.zhy.quickdev.adapter.R;
import com.zhy.quickdev.adapter.ViewHolder;
import com.zhy.quickdev.adapter.sample.adapter.ChatAdapter;
import com.zhy.quickdev.adapter.sample.bean.ChatMessage;

import java.util.ArrayList;

/**
 * Created by zhy on 15/9/4.
 */
public class MutliItemTypeFragment extends ListFragment
{
    private ArrayList<ChatMessage> mDatas = new ArrayList<ChatMessage>();


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

        getListView().setDivider(null);


        setListAdapter(new ChatAdapter(getActivity(),mDatas));
    }

    private void initDatas()
    {

        ChatMessage msg = null;
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
                null, true);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
                null, true);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);

        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
                null, true);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
                null, true);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
                null, true);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
                null, true);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
                null, true);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
                null, true);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
                null, true);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
                null, true);
        mDatas.add(msg);
        msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
                null, false);
        mDatas.add(msg);

    }
}
