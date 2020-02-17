package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom);
        ListView listView1 = (ListView) findViewById(R.id.listView1);
        customadapter ca = new customadapter();
        listView1.setAdapter(ca);

        but = findViewById(R.id.but);

    }

    class customadapter extends BaseAdapter implements View.OnClickListener {

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return images.length;
        }

        @Override
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub

            return null;
        }

        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public View getView(final int position, View convertview, ViewGroup arg2) {
            // TODO Auto-generated method stub
            LayoutInflater inflater = getLayoutInflater();
            convertview = inflater.inflate(R.layout.custom, null);
            TextView textView1 = (TextView) convertview.findViewById(R.id.textView1);
            TextView textView2 = (TextView) convertview.findViewById(R.id.textView2);
            ImageView imageView1 = (ImageView) convertview
                    .findViewById(R.id.imageView1);
            textView1.setText(names[position]);
            textView2.setText(locations[position]);
            imageView1.setImageResource(images[position]);

            but.setOnClickListener(this);

            return convertview;
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.but:
                    Intent intent = new Intent(MainActivity.this, shoping.class);
                    setContentView(R.layout.custom);
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    break;
            }
        }

        String[] names = {"name1", "name2", "name3"};
        String[] locations = {"location1", "location2", "location3"};
        int[] images = {R.drawable.demo, R.drawable.grey, R.drawable.nike};

    }
}

