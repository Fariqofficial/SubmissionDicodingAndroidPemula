package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailHeroSupportActivity extends AppCompatActivity {

    ImageView imgHero;
    TextView heroSup, roleSup, storySup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero_support);

        heroSup = findViewById(R.id.nama_support);
        roleSup = findViewById(R.id.role_herosup);
        storySup = findViewById(R.id.story_herosupport);
        imgHero = findViewById(R.id.pictureSupport);

        heroSup.setText(getIntent().getStringExtra("support"));
        roleSup.setText(getIntent().getStringExtra("roles"));
        storySup.setText(getIntent().getStringExtra("kisah"));

        Glide.with(this)
                .load(getIntent().getIntExtra("img", -1))
                .into(imgHero);
    }
}
