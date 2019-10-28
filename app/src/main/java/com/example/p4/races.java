package com.example.p4;


import android.content.Context;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class races extends AppCompatActivity {


    ListView listView2;
    String mTitle2[] = {"Australia 15-17 MAR",
            "Bahrain 29-31 MAR",
            "China 12-14 APR",
            "Azerbaijan 26-28 APR",
            "Spain 10-12 MAY",
            "Monaco 23-26 MAY",
            "Canada 07-09 JUN",
            "France 21-23 JUN",
            "Great Britain 12-14 JUL",
            "Germany 26-28 JUL",
            "Hungary 02-04 AUG",
            "Belgium 30-01 SEP",
            "Italy 06-08 SEP",
            "Singapore 20-22 SEP",
            "Russia 27-29 SEP",
            "Japan 11-13 OCT",


    };
    String mDescription2[] = {"Winner : Bottas ",
            "Winner : Hamilton",
            "Winner : Hamilton",
            "Winner : Bottas",
            "Winner : Hamilton",
            "Winner : Hamilton",
            "Winner : Hamilton",
            "Winner : Hamilton",
            "Winner : Verstappen",
            "Winner : Hamilton",
            "Winner : Verstappen",
            "Winner : Hamilton",
            "Winner : Leclerc",
            "Winner : Leclerc",
            "Winner : Vettel",
            "Winner : Hamilton",
            "Winner : Bottas",



    };

    int images2[] = {R.drawable.australia,
            R.drawable.bahrain,
            R.drawable.china,
            R.drawable.azerbaijan,
            R.drawable.spain, R.drawable.monaco,
            R.drawable.canada, R.drawable.france,
            R.drawable.austria, R.drawable.britain,
            R.drawable.germany, R.drawable.hungary,
            R.drawable.belgium, R.drawable.italy,
            R.drawable.singapore, R.drawable.russia,
            R.drawable.japan
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers);

        listView2 = findViewById(R.id.listview2);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle2, mDescription2, images2);
        listView2.setAdapter(adapter);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Toast.makeText(races.this, "Winner : Bottas ", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,   "Winner : Hamilton", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,  "Winner : Hamilton", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,    "Winner : Bottas", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this, "Winner : Hamilton", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,  "Winner : Hamilton", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this, "Winner : Hamilton", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,  "Winner : Hamilton", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,  "Winner : Verstappen", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,   "Winner : Hamilton", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,    "Winner : Verstappen", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,    "Winner : Hamilton", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,   "Winner : Leclerc", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,   "Winner : Leclerc", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,   "Winner : Vettel", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,    "Winner : Hamilton", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(races.this,   "Winner : Bottas", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }


    class MyAdapter extends ArrayAdapter<String> {
        Context context1;
        String rTitle2[];
        String rDescription2[];
        int rImgs2[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row2, R.id.textView2, title);
            this.context1 = c;
            this.rTitle2 = title;
            this.rDescription2 = description;
            this.rImgs2 = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row1 = layoutInflater.inflate(R.layout.row2, parent, false);

            ImageView images = row1.findViewById(R.id.image12);
            TextView myTitle = row1.findViewById(R.id.textView21);
            TextView myDescription = row1.findViewById(R.id.textView22);

            images.setImageResource(rImgs2[position]);
            myTitle.setText(rTitle2[position]);
            myDescription.setText(rDescription2[position]);

            return row1;
        }
    }
}