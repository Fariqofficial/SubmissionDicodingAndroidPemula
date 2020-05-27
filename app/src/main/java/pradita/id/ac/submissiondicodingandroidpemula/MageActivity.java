package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.adapter.MageAdapter;
import pradita.id.ac.submissiondicodingandroidpemula.model.Mage;

public class MageActivity extends AppCompatActivity {

    RecyclerView rvMage;
    private ArrayList<Mage> mages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mage);

        rvMage = findViewById(R.id.rvMage);
        rvMage.setHasFixedSize(true);

        mages.addAll(DataMage.getListData());
        tampilkanRecyclerViewMage();
    }

    private void tampilkanRecyclerViewMage() {
        rvMage.setLayoutManager(new LinearLayoutManager(this));
        MageAdapter mageAdapter = new MageAdapter(mages);
        rvMage.setAdapter(mageAdapter);

        mageAdapter.setOnItemClickCallback(new MageAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Mage data) {
                showSelectItem(data);
            }
        });
    }

    private void showSelectItem(Mage mage) {
        Intent mageIntent = new Intent(MageActivity.this, DetailHeroMageActivity.class);
        mageIntent.putExtra("images", mage.getGambarMage());
        mageIntent.putExtra("hero", mage.getHero_mage());
        mageIntent.putExtra("role", mage.getRole_mage());
        mageIntent.putExtra("kisah", mage.getKisah_mage());
        startActivity(mageIntent);
    }
}