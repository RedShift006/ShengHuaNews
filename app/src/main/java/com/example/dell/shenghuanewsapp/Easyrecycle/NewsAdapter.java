package com.example.dell.shenghuanewsapp.Easyrecycle;

import android.content.Context;
import android.view.ViewGroup;

import com.example.dell.shenghuanewsapp.HtmlData.News;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by Administrator on 2016/11/17.
 */
public class NewsAdapter extends RecyclerArrayAdapter<News> {


    public NewsAdapter(Context context) {
        super(context);
    }



    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new NewsViewHolder(parent);
    }
}
