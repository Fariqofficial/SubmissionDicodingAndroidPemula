package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailHeroArcher extends AppCompatActivity {
    ImageView picHero;
    TextView hero_archer, role_archer, story_archer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero_archer);

        hero_archer = findViewById(R.id.nama_archer);
        role_archer = findViewById(R.id.rolehero_archer);
        story_archer = findViewById(R.id.storyhero_archer);
        picHero = findViewById(R.id.pic_archer);

        hero_archer.setText(getIntent().getStringExtra("name"));
        role_archer.setText(getIntent().getStringExtra("roles"));
        story_archer.setText(getIntent().getStringExtra("kisah"));

        Glide.with(this)
                .load(getIntent().getIntExtra("pict", -1))
                .into(picHero);
    }
}
