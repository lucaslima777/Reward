package reward.developer.lln.reward;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView animationView;
    ImageView reward;
    Button animate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Animation FadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        animationView = (LottieAnimationView) findViewById(R.id.animation_view);
        reward = (ImageView) findViewById(R.id.reward);
        animate = (Button) findViewById(R.id.animate);

        animate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reward.setVisibility(View.VISIBLE);
                reward.startAnimation(FadeInAnimation);
                animationView.setVisibility(View.VISIBLE);
                animationView.playAnimation();
            }
        });
    }
}
