package lcgr.projectkulot.Controllers;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


import lcgr.projectkulot.R;

import static lcgr.projectkulot.R.id.imageView;

/**
 * Created by PB5N0203 on 10/25/2016.
 */

public class ImageAdapter extends BaseAdapter {
    private Activity activity;
    public Integer[] mThumbsIds = {R.drawable.lyan,
            R.drawable.faye,
            R.drawable.isa,
            R.drawable.gerson};
    public String[] pictureNames = {"Lyan",
            "Faye",
            "Isa",
            "Gerson"};

    public ImageAdapter(Activity activity){
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return mThumbsIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbsIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public static class ViewHolder
    {
        public ImageView imgViewFlag;
        public TextView txtViewTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder view;
        LayoutInflater inflator = activity.getLayoutInflater();
        if(convertView==null) {
            view = new ViewHolder();
            convertView = inflator.inflate(R.layout.grid_layout,null);

            view.txtViewTitle = (TextView) convertView.findViewById(R.id.textViewer);
            view.imgViewFlag = (ImageView) convertView.findViewById(R.id.imageviewer);

            convertView.setTag(view);
        }else{
            view = (ViewHolder) convertView.getTag();
        }

        view.imgViewFlag.setImageResource(mThumbsIds[position]);
        view.imgViewFlag.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //view.imgViewFlag.setLayoutParams(new GridView.LayoutParams(370,370));
        ViewGroup.LayoutParams lp = view.imgViewFlag.getLayoutParams();
        lp.width = 370;
        lp.height = 370;
        view.imgViewFlag.requestLayout();

        view.txtViewTitle.setText(pictureNames[position]);
        return convertView;
    }
}
