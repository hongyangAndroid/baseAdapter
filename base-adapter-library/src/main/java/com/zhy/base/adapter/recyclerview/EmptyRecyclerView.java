package com.zhy.base.adapter.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

/**
 * https://gist.github.com/adelnizamutdinov/31c8f054d1af4588dc5c
 */
public class EmptyRecyclerView extends RecyclerView
{
    View emptyView;

    public EmptyRecyclerView(Context context)
    {
        super(context);
    }

    public EmptyRecyclerView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public EmptyRecyclerView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
    }

    void checkIfEmpty()
    {
        if (emptyView != null)
        {
            emptyView.setVisibility(getAdapter().getItemCount() > 0 ? GONE : VISIBLE);
        }
    }

    final AdapterDataObserver observer = new AdapterDataObserver()
    {
        @Override
        public void onChanged()
        {
            super.onChanged();
            checkIfEmpty();
        }
    };

    @Override
    public void swapAdapter(Adapter adapter, boolean removeAndRecycleExistingViews)
    {
        final Adapter oldAdapter = getAdapter();
        if (oldAdapter != null)
        {
            oldAdapter.unregisterAdapterDataObserver(observer);
        }

        if (adapter != null)
        {
            adapter.registerAdapterDataObserver(observer);
        }
        super.swapAdapter(adapter, removeAndRecycleExistingViews);
        checkIfEmpty();
    }

    @Override
    public void setAdapter(Adapter adapter)
    {
        final Adapter oldAdapter = getAdapter();
        if (oldAdapter != null)
        {
            oldAdapter.unregisterAdapterDataObserver(observer);
        }
        super.setAdapter(adapter);
        if (adapter != null)
        {
            adapter.registerAdapterDataObserver(observer);
        }
    }

    public void setEmptyView(View emptyView)
    {
        this.emptyView = emptyView;
        checkIfEmpty();
    }
}