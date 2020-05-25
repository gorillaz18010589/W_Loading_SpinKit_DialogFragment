package com.example.w_loading_spinkit;
//目的:按下按鈕產生一個有特效的Loading_DialogFragment
//loading
//implementation 'com.github.ybq:Android-SpinKit:1.4.0'
//1.配置DialogFragment xml
//2.寫一個DialogFragment
//3.繼承DialogFragment
//4.onCreateView時抓到要顯示的item
//5.再來就看你要表現什麼在此Fragment呈現
//6.有view時產生特效
//7.修一下邊框
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.SpinKitView;
import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.WanderingCubes;

public class MainActivity extends AppCompatActivity {
    private LoadingDialogFrgamnent loadingDialogFrgamnent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void btn_text(View view) {
        loadingDialogFrgamnent = new LoadingDialogFrgamnent();
        FragmentManager fragmentManager = getSupportFragmentManager();
        loadingDialogFrgamnent.show(fragmentManager,"al");

    }
}
