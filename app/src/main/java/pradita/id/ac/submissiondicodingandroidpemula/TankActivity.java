package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.adapter.TankAdapter;
import pradita.id.ac.submissiondicodingandroidpemula.model.Tank;

public class TankActivity extends AppCompatActivity {

    RecyclerView recyclerView_tank;
    private ArrayList<Tank> tankList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tank);

        recyclerView_tank = findViewById(R.id.rvHeroTank);
        recyclerView_tank.setHasFixedSize(true);

        tankList.addAll(DataTank.getListData());
        rvTank();
    }

    private void rvTank() {
        recyclerView_tank.setLayoutManager(new LinearLayoutManager(this));
        TankAdapter tankAdapter = new TankAdapter(tankList);
        recyclerView_tank.setAdapter(tankAdapter);

        tankAdapter.setOnItemClickCallback(new TankAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Tank data) {
                showSelectedItem(data);
            }
        });
    }

    private void showSelectedItem(Tank tank) {
        Intent intentTank = new Intent(TankActivity.this, DetailHeroTankActivity.class);
        intentTank.putExtra("picture", tank.getPictHeroTank());
        intentTank.putExtra("nama", tank.getHeroTank());
        intentTank.putExtra("role", tank.getRoleTank());
        intentTank.putExtra("story", tank.getStoryHeroTank());
        startActivity(intentTank);
    }
}
