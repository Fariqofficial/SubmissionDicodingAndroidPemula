package pradita.id.ac.submissiondicodingandroidpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    CardView cardViewArcher, cardViewMage, cardViewAssasin, cardViewSupport, cardViewTank, cardViewWarrior;
    ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardViewArcher = (CardView) findViewById(R.id.cv_archer);
        cardViewMage = (CardView) findViewById(R.id.cv_mage);
        cardViewAssasin = (CardView) findViewById(R.id.cv_assasin);
        cardViewSupport = (CardView) findViewById(R.id.cv_support);
        cardViewTank = (CardView) findViewById(R.id.cv_tank);
        cardViewWarrior = (CardView) findViewById(R.id.cv_warrior);
        icon = findViewById(R.id.icProfil);

        cardViewArcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProfil = new Intent(HomeActivity.this, ProfilActivity.class);
                startActivity(intentProfil);
            }
        });

        cardViewMage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mage = new Intent(HomeActivity.this, MageActivity.class);
                startActivity(mage);
            }
        });

        cardViewAssasin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cvAssasin = new Intent(HomeActivity.this, AssasinActivity.class);
                startActivity(cvAssasin);
            }
        });

        cardViewSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSupport = new Intent(HomeActivity.this, SupportActivity.class);
                startActivity(intentSupport);
            }
        });

        cardViewWarrior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWarrior = new Intent(HomeActivity.this, WarriorActivity.class);
                startActivity(intentWarrior);
            }
        });

        cardViewTank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTank = new Intent(HomeActivity.this, TankActivity.class);
                startActivity(intentTank);
            }
        });

    }
}
