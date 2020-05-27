package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailHeroWarriorActivity extends AppCompatActivity {

    ImageView picHero;
    TextView nama_hero, role, story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero_warrior);

        nama_hero = findViewById(R.id.hero_warrior);
        role = findViewById(R.id.rolehero_warrior);
        story = findViewById(R.id.storyhero_warrior);
        picHero = findViewById(R.id.image_warrior);

        nama_hero.setText(getIntent().getStringExtra("naamahero"));
        role.setText(getIntent().getStringExtra("role"));
        story.setText(getIntent().getStringExtra("story"));

        Glide.with(this)
                .load(getIntent().getIntExtra("gambar", -1))
                .into(picHero);
    }
}
