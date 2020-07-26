package com.example.project1.adapter;

//import android.app.Activity;
//import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;
//
//
//
//import java.util.ArrayList;
//
//public class MyAdapter extends ArrayAdapter {
//
//    Activity context;
//    int layoutID;
//    ArrayList<TrieuChung> list;
//
//    public MyAdapter(Activity context, int resource,ArrayList<TrieuChung> objects) {
//        super(context, resource, objects);
//        this.context = context;
//        this.layoutID = resource;
//        this.list = objects;
//    }
//
//    static class ViewHolder{
//       CheckBox cbTrieuChung;
//    }
//
//    @Override
//    public View getView(final int position, View convertView, ViewGroup parent) {
//        final ViewHolder viewHolder;
//        if (convertView == null)
//        {
//            //create new items for listview
//            viewHolder = new ViewHolder();
//            convertView = context.getLayoutInflater().inflate(layoutID, parent, false);
//            viewHolder.cbTrieuChung = convertView.findViewById(R.id.cbTrieuChung);
//
//
//            convertView.setTag(viewHolder);
//        }
//        else {
//            viewHolder = (ViewHolder) convertView.getTag();
//        }
//        //View view = null;
//
//        TrieuChung nhanSu = list.get(position);
//        viewHolder.cbTrieuChung.setText(nhanSu.getTenTC());
//
//
//
//
//        return convertView;
//    }
//}
//
