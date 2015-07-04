package littlechi.dyc.com.littlechi.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import littlechi.dyc.com.littlechi.entity.BaseEntity;

/**
 * Created by Administrator on 2015/6/26.
 */
public abstract class MyBaseAdapter extends android.widget.BaseAdapter {


    private Context context;
    private ArrayList<BaseEntity> entitys;
    private LayoutInflater mInflater;
    public void MyBaseAdapter(Context context, ArrayList<BaseEntity> entitys) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return null == entitys ? 0 : entitys.size();
    }

    @Override
    public Object getItem(int position) {
        return null == entitys ? null : entitys.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if (null == convertView) {
            vh = new ViewHolder();
            convertView = mInflater.inflate(getLayoutId(),null);

        }

        return null;
    }
   public abstract int getLayoutId();

    class ViewHolder {
        SparseArray<View> viewArray = new SparseArray<View>();

        public void addViews(View convertView, int id) {
            View contentView = convertView.findViewById(id);
            viewArray.put(id, contentView);
        }
    }


}
