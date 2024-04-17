package cutebaby.wallpapers.Activites;


import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cutebaby.wallpapers.Adapters.WallpaperAdapter;
import cutebaby.wallpapers.R;


public class Splash extends Activity {

    RecyclerView recycler;
    WallpaperAdapter adapter;
    List<String> itemList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        if (getActionBar() != null) {
            getActionBar().hide();
        }

        recycler = findViewById(R.id.recycler);
        setupList();
        recycler.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new WallpaperAdapter(this, itemList);
        recycler.setAdapter(adapter);

    }

    private void setupList() {
        for (int i = 1; i <= 34; i++) {
            itemList.add("https://firebasestorage.googleapis.com/v0/b/logoiq.appspot.com/o/baby%2F" + i + ".png?alt=media&token=b020e77b-a1a2-4266-9921-1bb6df46076f");
        }

    }
//babywallpapers

}

