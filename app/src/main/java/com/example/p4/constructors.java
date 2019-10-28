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

public class constructors extends AppCompatActivity {


    ListView listView;
    String mTitle[] = {"Mercedes", "Ferrari", "Red Bull Racing", "McLaren", "Renault", "Toro Rosso", "Racing Point", "Alfa Romeo Racing", "Haas F1 Team", "Williams"};
    String mDescription[] = {"Pod Finishes:189, championship titles:5",

            "Pod Finishes:780, championship titles:16",
            "Pod Finishes:167, championship titles:4",
            "Pod Finishes:485, championship titles:8",
            "Pod Finishes:59, championship titles:2",
            "Pod Finishes:2, championship titles:N/A",
            "Pod Finishes:N/A, championship titles:N/A",
            "Pod Finishes:27, championship titles:N/A",
            "Pod Finishes:N/A, championship titles:N/A",
            "Pod Finishes:311, championship titles:9"};

    int images[] = {R.drawable.mercedesconst,
            R.drawable.sfconst,
            R.drawable.rbconst,
            R.drawable.mclarenconst,
            R.drawable.renaultconst, R.drawable.trconst,
            R.drawable.racingpointconst, R.drawable.alfaromeoconst,
            R.drawable.haasconst, R.drawable.williamsconst
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructors);

        listView = findViewById(R.id.listview);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Toast.makeText(constructors.this, "Pod Finishes:189, championship titles:5", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(constructors.this, "Pod Finishes:780, championship titles:16", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(constructors.this,  "Pod Finishes:167, championship titles:4", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(constructors.this,   "Pod Finishes:485, championship titles:8", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(constructors.this, "Pod Finishes:59, championship titles:2", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(constructors.this, "Pod Finishes:2, championship titles:N/A", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(constructors.this, "Pod Finishes:N/A, championship titles:N/A", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(constructors.this, "Pod Finishes:27, championship titles:N/A", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(constructors.this, "Pod Finishes:N/A, championship titles:N/A", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(constructors.this,  "Pod Finishes:311, championship titles:9", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}



