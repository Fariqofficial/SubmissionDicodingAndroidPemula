package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.adapter.ArcherAdapter;
import pradita.id.ac.submissiondicodingandroidpemula.model.Archer;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewArcher;
    private ArrayList<Archer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewArcher = findViewById(R.id.rv_heroArcher);
        recyclerViewArcher.setHasFixedSize(true);

        list.addAll(DataArcher.getListData());
        tampilkanRecyclerView();
    }

    private void tampilkanRecyclerView() {
        recyclerViewArcher.setLayoutManager(new LinearLayoutManager(this));
        ArcherAdapter archerAdapter = new ArcherAdapter(list);
        recyclerViewArcher.setAdapter(archerAdapter);

        archerAdapter.setOnItemClickCallback(new ArcherAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Archer archer) {
                showSelectedItem(archer);
            }
        });
    }

    private void showSelectedItem(Archer archer) {
        Intent archer_intent = new Intent(MainActivity.this, DetailHeroArcher.class);
        archer_intent.putExtra("pict", archer.getImage_hero());
        archer_intent.putExtra("name", archer.getNama_archer());
        archer_intent.putExtra("roles", archer.getRole_hero());
        archer_intent.putExtra("kisah", archer.getStory_archer());
        startActivity(archer_intent);
    }
}
