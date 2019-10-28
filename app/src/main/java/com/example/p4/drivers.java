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

public class drivers extends AppCompatActivity {


    ListView listView1;
    String mTitle1[] = {"Lewis Hamilton", "Valtteri Bottas", "Sebastian Vettel", "Charles Leclerc", "Max Verstappen", "Alex Albon", "Daniel Riccardo", "Nico Hulkenberg", "Romain Grosjean", "Kevin Magnussen", "Antonio Givonnanzi", "Kimi Raikkonnen", "Sergio Perez", "Lance Stroll","Pierre Gasly","Daniil Kvyatt", "George Russel","Robert Kubica","Lando Norris", "Carlos Sainz"};
    String mDescription1[] = {"Team : Mercedes, Points : 3356",

            "Team : Mercedes, Points : 1237",
            "Team : Ferrari, Points : 2957",
            "Team : Ferrari, Points : 262",
            "Team : Red Bull Racing, Points : 882",
            "Team : Red Bull Racing, Points : 64",
            "Team : Renault, Points : 1020",
            "Team : Renault, Points : 508",
            "Team : Haas, Points : 389",
            "Team : Haas, Points : 157",
            "Team : Alfa Romeo, Points : 4",
            "Team : Alfa Romeo, Points : 1847","Team : Racing Point, Points : 566",
            "Team : Racing Point, Points : 67",
            "Team : Toro Rosso, Points : 105",
            "Team : Toro Rosso, Points : 167",
            "Team : Williams, Points : 0",
            "Team : Williams, Points : 274",
            "Team : Mclaren, Points : 35",
            "Team : Mclaren, Points : 247"
    };

    int images1[] = {R.drawable.lewis,
            R.drawable.bottas,
            R.drawable.vettel,
            R.drawable.leclerc,
            R.drawable.max, R.drawable.albon,
            R.drawable.ric, R.drawable.hulk,
            R.drawable.grosjean, R.drawable.kevin,
            R.drawable.giovananzi, R.drawable.kimi,
            R.drawable.perez, R.drawable.stroll,
            R.drawable.gasly, R.drawable.kvyat,
            R.drawable.russel, R.drawable.kubica,
            R.drawable.norris, R.drawable.carlos
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers);

        listView1 = findViewById(R.id.listview1);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle1, mDescription1, images1);
        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Toast.makeText(drivers.this, "Team : Mercedes, Points : 3356", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,  "Team : Mercedes, Points : 1237", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,  "Team : Ferrari, Points : 2957", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,   "Team : Ferrari, Points : 262", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this, "Team : Red Bull Racing, Points : 882", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,  "Team : Red Bull Racing, Points : 64", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this, "Team : Renault, Points : 1020", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,  "Team : Renault, Points : 508", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,  "Team : Haas, Points : 389", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,   "Team : Haas, Points : 157", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,    "Team : Alfa Romeo, Points : 4", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,    "Team : Alfa Romeo, Points : 1847", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,   "Team : Racing Point, Points : 566", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,   "Team : Racing Point, Points : 67", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,   "Team : Toro Rosso, Points : 105", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,    "Team : Toro Rosso, Points : 167", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,   "Team : Williams, Points : 0", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,   "Team : Williams, Points : 274", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,   "Team : Mclaren, Points : 35", Toast.LENGTH_SHORT).show();
                }
                if (position ==  0) {
                    Toast.makeText(drivers.this,   "Team : Mclaren, Points : 247", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


    class MyAdapter extends ArrayAdapter<String> {
        Context context1;
        String rTitle1[];
        String rDescription1[];
        int rImgs1[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row1, R.id.textView1, title);
            this.context1 = c;
            this.rTitle1 = title;
            this.rDescription1 = description;
            this.rImgs1 = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row1 = layoutInflater.inflate(R.layout.row1, parent, false);

            ImageView images = row1.findViewById(R.id.image1);
            TextView myTitle = row1.findViewById(R.id.textView11);
            TextView myDescription = row1.findViewById(R.id.textView12);

            images.setImageResource(rImgs1[position]);
            myTitle.setText(rTitle1[position]);
            myDescription.setText(rDescription1[position]);

            return row1;
        }
    }
}