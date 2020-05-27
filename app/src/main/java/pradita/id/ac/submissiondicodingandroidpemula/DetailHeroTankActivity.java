package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailHeroTankActivity extends AppCompatActivity {
    ImageView pictureHero;
    TextView heroTankName, roleHeroTank, storyHeroTank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero_tank);

        heroTankName = findViewById(R.id.hero_tank);
        roleHeroTank = findViewById(R.id.role_hero);
        storyHeroTank = findViewById(R.id.kisah_hero);
        pictureHero = findViewById(R.id.pctHeroTank);

        heroTankName.setText(getIntent().getStringExtra("nama"));
        roleHeroTank.setText(getIntent().getStringExtra("role"));
        storyHeroTank.setText(getIntent().getStringExtra("story"));

        Glide.with(this)
                .load(getIntent().getIntExtra("picture", -1))
                .into(pictureHero);
    }
}
