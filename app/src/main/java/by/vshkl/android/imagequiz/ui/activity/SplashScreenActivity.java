package by.vshkl.android.imagequiz.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import by.vshkl.android.imagequiz.mvp.presenter.SplashScreenPresenter;
import by.vshkl.android.imagequiz.mvp.view.ScpashScheenView;
import by.vshkl.android.imagequiz.utils.Navigator;

public class SplashScreenActivity extends MvpAppCompatActivity implements ScpashScheenView {

    @InjectPresenter SplashScreenPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.updateScores();
    }

    @Override
    protected void onStop() {
        presenter.onStop();
        super.onStop();
    }

    @Override
    public void scoresUpdated() {
        Navigator.showMainActivity(SplashScreenActivity.this);
    }
}
