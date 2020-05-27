package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.adapter.SupportAdapter;
import pradita.id.ac.submissiondicodingandroidpemula.model.Support;

public class SupportActivity extends AppCompatActivity {
    RecyclerView rvSup;
    private ArrayList<Support> sup = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        rvSup = findViewById(R.id.recyclerViewSup);
        rvSup.setHasFixedSize(true);

        sup.addAll(DataSupport.getListData());
        rvSupport();
    }

    private void rvSupport() {
        rvSup.setLayoutManager(new LinearLayoutManager(this));
        SupportAdapter supportAdapter = new SupportAdapter(sup);
        rvSup.setAdapter(supportAdapter);

        supportAdapter.setOnItemClickCallback(new SupportAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Support data) {
                showSelectedItem(data);
            }
        });
    }

    private void showSelectedItem(Support support) {
        Intent intentSupport = new Intent(SupportActivity.this, DetailHeroSupportActivity.class);
        intentSupport.putExtra("img", support.getSupportImage());
        intentSupport.putExtra("support", support.getNamaHeroSup());
        intentSupport.putExtra("roles", support.getRoleHeroSup());
        intentSupport.putExtra("kisah", support.getStoryHeroSup());
        startActivity(intentSupport);
    }
}
