package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailHeroMageActivity extends AppCompatActivity {

    ImageView pctMage;
    TextView namaMage, roleMage, kisahMage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero_mage);

        pctMage = findViewById(R.id.gambarHeroMage);
        namaMage = findViewById(R.id.nama_hero_mage);
        roleMage = findViewById(R.id.role_hero_mage);
        kisahMage = findViewById(R.id.kisah_hero_mage);

        namaMage.setText(getIntent().getStringExtra("hero"));
        roleMage.setText(getIntent().getStringExtra("role"));
        kisahMage.setText(getIntent().getStringExtra("kisah"));

        Glide.with(this)
                .load(getIntent().getIntExtra("images", -1))
                .into(pctMage);
    }
}
