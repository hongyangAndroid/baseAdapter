# base-adapter
Android 万能的Adapter for ListView,GridView等，支持多种Item类型的情况。

[点击查看简单介绍](http://blog.csdn.net/lmj623565791/article/details/38902805)

可以直接导入项目参考，在Android Studio中，使用Import Module进行导入，如下图：

<img src="import_module.png" width="400px"/>

## 单种类型Item

```java
listView.setAdapter(new CommonAdapter<Bean>(getActivity(), mDatas,
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
```

只需要简单的将Adapter继承CommonAdapter，复写convert方法即可。省去了自己编写ViewHolder等大量的重复的代码。

* 可以通过holder.getView(id)拿到任何控件。
* ViewHolder中封装了大量的常用的方法，比如holder.setText(id,text)，holder.setOnClickListener(id,listener)等，可以支持使用。

效果图：

<img src="single.png" width="320px"/>


## 多种类型的Item

```java
package com.zhy.quickdev.adapter.sample.adapter;

import android.content.Context;

import com.zhy.base.adapter.abslistview.MultiItemCommonAdapter;
import com.zhy.base.adapter.abslistview.MultiItemTypeSupport;
import com.zhy.quickdev.adapter.R;
import com.zhy.base.adapter.ViewHolder;
import com.zhy.quickdev.adapter.sample.bean.ChatMessage;

import java.util.List;

/**
 * Created by zhy on 15/9/4.
 */
public class ChatAdapter extends MultiItemCommonAdapter<ChatMessage>
{
    public ChatAdapter(Context context, List<ChatMessage> datas)
    {
        super(context, datas, new MultiItemTypeSupport<ChatMessage>()
        {
            @Override
            public int getLayoutId(int position, ChatMessage msg)
            {
                if (msg.isComMeg())
                {
                    return R.layout.main_chat_from_msg;
                }
                return R.layout.main_chat_send_msg;
            }

            @Override
            public int getViewTypeCount()
            {
                return 2;
            }
            @Override
            public int getItemViewType(int postion, ChatMessage msg)
            {
                if (msg.isComMeg())
                {
                    return ChatMessage.RECIEVE_MSG;
                }
                return ChatMessage.SEND_MSG;
            }
        });
    }

    @Override
    public void convert(ViewHolder holder, ChatMessage chatMessage)
    {

        switch (holder.getLayoutId())
        {
            case R.layout.main_chat_from_msg:
                holder.setText(R.id.chat_from_content, chatMessage.getContent());
                holder.setText(R.id.chat_from_name, chatMessage.getName());
                holder.setImageResource(R.id.chat_from_icon, chatMessage.getIcon());
                break;
            case R.layout.main_chat_send_msg:
                holder.setText(R.id.chat_send_content, chatMessage.getContent());
                holder.setText(R.id.chat_send_name, chatMessage.getName());
                holder.setImageResource(R.id.chat_send_icon, chatMessage.getIcon());
                break;
        }
    }
}

```

需要在构造中传入MultiItemTypeSupport对象，然后在convert方法中，根据holder.getLayoutId()，根据不同的layoutId进行相应的控件初始化即可。

效果图：

<img src="multi.png" width="320px"/>
