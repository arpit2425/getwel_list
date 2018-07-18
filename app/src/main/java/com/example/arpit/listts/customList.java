package com.example.arpit.listts;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customList extends ArrayAdapter<String> {
    private String pro_name[];
    private String pro_price[];
    private  Integer imgid[];
    private Integer add[];
    private  Integer minus[];
    private Integer item[];
    private Activity context;
    public customList(@NonNull Activity context, String pro_name[], String pro_price[], Integer imgid[],Integer add[],Integer item[],Integer minus[]) {
        super(context,R.layout.single_list,pro_name);
        this.context=context;
        this.pro_name=pro_name;
        this.pro_price=pro_price;
        this.imgid=imgid;
        this.add=add;
        this.minus=minus;
        this.item=item;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r=convertView;
        viewHolder viewHolder=null;
        if(r==null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.single_list,null,true);
            viewHolder=new viewHolder(r);
            r.setTag(viewHolder);
        }
        else
        {
            viewHolder=(viewHolder)r.getTag();
        }
        viewHolder.imageView.setImageResource(imgid[position]);
        viewHolder.icon.setImageResource(add[position]);
        viewHolder.icon2.setImageResource(minus[position]);

        viewHolder.txt1.setText(pro_name[position]);
        viewHolder.txt2.setText(pro_price[position]);
        viewHolder.txt3.setText((item[position]).toString());






        return r;
    }
    class viewHolder
    {
        TextView txt1,txt2,txt3;
        ImageView imageView,icon,icon2;
        viewHolder(View v)
        {
            txt1=(TextView)v.findViewById(R.id.pro_name);
            txt2=(TextView)v.findViewById(R.id.pro_price);
            imageView=(ImageView)v.findViewById(R.id.image);
            icon=(ImageView)v.findViewById(R.id.add);
            icon2=(ImageView)v.findViewById(R.id.minus);
            txt3=(TextView)v.findViewById(R.id.item);




        }
    }
}
