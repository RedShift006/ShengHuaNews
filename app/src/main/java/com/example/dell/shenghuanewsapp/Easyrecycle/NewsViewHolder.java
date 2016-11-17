package com.example.dell.shenghuanewsapp.Easyrecycle;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.example.dell.shenghuanewsapp.HtmlData.MeiNv;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

/**
 * Created by Administrator on 2016/11/17.
 */
public class NewsViewHolder extends BaseViewHolder<MeiNv> {
    ImageView imgPicture;


    public NewsViewHolder(ViewGroup parent) {
        super(new ImageView(parent.getContext()));
        imgPicture = (ImageView) itemView;
        imgPicture.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        imgPicture.setScaleType(ImageView.ScaleType.CENTER_CROP);

    }

    @Override
    public void setData(MeiNv data) {
        //super.setData(data);
        final DisplayMetrics dm = getContext().getResources().getDisplayMetrics();
        Glide.with(getContext())
                .load(data.getPicUrl())
                .asBitmap()
                .into(new SimpleTarget<Bitmap>(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL) {
                    @Override
                    public void onResourceReady(Bitmap bitmap, GlideAnimation glideAnimation) {
                        int width = dm.widthPixels / 2 - 10;
                        int height = bitmap.getHeight() * width / bitmap.getWidth();

                        ViewGroup.LayoutParams params = imgPicture.getLayoutParams();
                        params.height = height;
                        params.width = width;
                        imgPicture.setLayoutParams(params);
                        imgPicture.setScaleType(ImageView.ScaleType.FIT_XY);
                        imgPicture.setImageBitmap(bitmap);
                    }
                });


    }
}
