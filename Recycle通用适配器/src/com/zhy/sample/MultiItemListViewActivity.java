package com.zhy.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.zhy.sample.adapter.ChatAdapter;
import com.zhy.sample.bean.ChatMessage;

public class MultiItemListViewActivity extends Activity
{

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.id_listview_list);
        mListView.setDivider(null);
        mListView.setAdapter(new ChatAdapter(this, ChatMessage.MOCK_DATAS));

    }

}
