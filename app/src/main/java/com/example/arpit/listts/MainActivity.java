package com.example.arpit.listts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listView;
    String pro_name[]={"ABC","ABC","ABC","ABC","ABC","ABC","ABC","ABC"};
    String pro_price[]={"500 gm","500 gm","500 gm","500 gm","500 gm","500 gm","500 gm","500 gm"};
    Integer item[]={0,0,0,0,0,0,0,0};
    Integer add[]={R.drawable.add,R.drawable.add,R.drawable.add,R.drawable.add,R.drawable.add,R.drawable.add,R.drawable.add,R.drawable.add,};
    Integer minus[]={R.drawable.minus,R.drawable.minus,R.drawable.minus,R.drawable.minus,R.drawable.minus,R.drawable.minus,R.drawable.minus,R.drawable.minus,};
    Integer imgid[]={R.drawable.aquatone,R.drawable.aquatone,R.drawable.aquatone,R.drawable.aquatone,R.drawable.aquatone,R.drawable.aquatone,R.drawable.aquatone,R.drawable.aquatone,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);
        customList customList=new customList(this,pro_name,pro_price,imgid,add,item,minus);
        listView.setAdapter(customList);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
