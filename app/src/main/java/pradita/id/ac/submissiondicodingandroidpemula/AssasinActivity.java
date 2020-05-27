package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.adapter.AssasinAdapter;
import pradita.id.ac.submissiondicodingandroidpemula.model.Assasin;

public class AssasinActivity extends AppCompatActivity {

    RecyclerView rv_Assasin;
    private ArrayList<Assasin> assasins = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assasin);

        rv_Assasin = findViewById(R.id.rvAssasin);
        rv_Assasin.setHasFixedSize(true);

        assasins.addAll(DataAssasin.getListData());
        tampilkanRvAssasin();
    }

    private void tampilkanRvAssasin() {
        rv_Assasin.setLayoutManager(new LinearLayoutManager(this));
        AssasinAdapter assasinAdapter = new AssasinAdapter(assasins);
        rv_Assasin.setAdapter(assasinAdapter);

        assasinAdapter.setOnItemClickCallback(new AssasinAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Assasin data) {
                showSelectedItem(data);
            }
        });
    }

    private void showSelectedItem(Assasin assasin) {
        Intent assasinIntent = new Intent(AssasinActivity.this, DetailHeroAssasinActivity.class);
        assasinIntent.putExtra("gambar", assasin.getAssasin_image());
        assasinIntent.putExtra("nama", assasin.getAssain_name());
        assasinIntent.putExtra("role", assasin.getRole_assasin());
        assasinIntent.putExtra("story", assasin.getStory_assasin());
        startActivity(assasinIntent);
    }
}
