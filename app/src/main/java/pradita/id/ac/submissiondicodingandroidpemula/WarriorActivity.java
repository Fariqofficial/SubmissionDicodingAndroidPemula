package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.adapter.WarriorAdapter;
import pradita.id.ac.submissiondicodingandroidpemula.model.Warrior;

public class WarriorActivity extends AppCompatActivity {
    RecyclerView rvWarrior;
    private ArrayList<Warrior> warriors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warrior);

        rvWarrior = findViewById(R.id.rvWarrior);
        rvWarrior.setHasFixedSize(true);

        warriors.addAll(DataWarrior.getListData());
        recyclerViewWarrior();
    }

    private void recyclerViewWarrior() {
        rvWarrior.setLayoutManager(new LinearLayoutManager(this));
        WarriorAdapter warriorAdapter = new WarriorAdapter(warriors);
        rvWarrior.setAdapter(warriorAdapter);

        warriorAdapter.setOnItemClickCallback(new WarriorAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Warrior data) {
                ketikaItemDipilih(data);
            }
        });
    }

    private void ketikaItemDipilih(Warrior warrior) {
        Intent warrior_intent = new Intent(WarriorActivity.this, DetailHeroWarriorActivity.class);
        warrior_intent.putExtra("gambar", warrior.getGambarHeroWarrior());
        warrior_intent.putExtra("naamahero", warrior.getHeroWarrior());
        warrior_intent.putExtra("role", warrior.getRoleWarrior());
        warrior_intent.putExtra("story", warrior.getStoryHeroWarrior());
        startActivity(warrior_intent);
    }
}
