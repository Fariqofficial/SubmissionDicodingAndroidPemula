package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailHeroAssasinActivity extends AppCompatActivity {

    ImageView pctHero;
    TextView hero_assasin, role_assasin, story_assasin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero_assasin);

        hero_assasin = findViewById(R.id.hero_assasin);
        role_assasin = findViewById(R.id.role_assasin);
        story_assasin = findViewById(R.id.storyHeroAssasin);
        pctHero = findViewById(R.id.gambarHeroAssasin);

        hero_assasin.setText(getIntent().getStringExtra("nama"));
        role_assasin.setText(getIntent().getStringExtra("role"));
        story_assasin.setText(getIntent().getStringExtra("story"));

        Glide.with(this)
                .load(getIntent().getIntExtra("gambar", -1))
                .into(pctHero);
    }
}
