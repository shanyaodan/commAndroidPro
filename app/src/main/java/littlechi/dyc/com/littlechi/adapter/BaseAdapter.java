package littlechi.dyc.com.littlechi.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import littlechi.dyc.com.littlechi.entity.BaseEntity;

/**
 * Created by Administrator on 2015/6/26.
 */
class MyBaseAdapter extends android.widget.BaseAdapter {


    private   Context context;
    private ArrayList<BaseEntity> entitys;
    public void MyBaseAdapter(Context context,ArrayList<BaseEntity> entitys) {


    }
    @Override
    public int getCount() {
        return null==entitys?0:entitys.size();
    }

    @Override
    public Object getItem(int position) {
        return null== entitys?null:entitys.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
