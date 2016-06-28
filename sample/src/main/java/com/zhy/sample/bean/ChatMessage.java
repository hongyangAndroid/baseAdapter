package com.zhy.sample.bean;

import com.zhy.sample.R;

import java.util.ArrayList;
import java.util.List;

public class ChatMessage
{
	private int icon;
	private String name;
	private String content;
	private String createDate;
	private boolean isComMeg;

	public final static int RECIEVE_MSG = 0;
	public final static int SEND_MSG = 1;

	public ChatMessage(int icon, String name, String content,
			String createDate, boolean isComMeg)
	{
		this.icon = icon;
		this.name = name;
		this.content = content;
		this.createDate = createDate;
		this.isComMeg = isComMeg;
	}

	public boolean isComMeg()
	{
		return isComMeg;
	}

	public void setComMeg(boolean isComMeg)
	{
		this.isComMeg = isComMeg;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public int getIcon()
	{
		return icon;
	}

	public void setIcon(int icon)
	{
		this.icon = icon;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(String createDate)
	{
		this.createDate = createDate;
	}

	@Override
	public String toString()
	{
		return "ChatMessage [icon=" + icon + ", name=" + name + ", content="
				+ content + ", createDate=" + createDate +", isComing = "+ isComMeg()+ "]";
	}

	public static List<ChatMessage> MOCK_DATAS = new ArrayList<>();

	static {
		ChatMessage msg = null;
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, true);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, true);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);

		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, true);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, true);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, true);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, true);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, true);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, true);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, true);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.renma, "renma", "where are you ",
				null, true);
		MOCK_DATAS.add(msg);
		msg = new ChatMessage(R.drawable.xiaohei, "xiaohei", "where are you ",
				null, false);
		MOCK_DATAS.add(msg);
	}


}
