package com.example.w_loading_spinkit;



import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.RotatingPlane;
import com.github.ybq.android.spinkit.style.WanderingCubes;

//3.繼承DialogFragment
public class LoadingDialogFrgamnent  extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //4.onCreateView時抓到要顯示的item
        getDialog()//取得現在這個顯示的fragment
            .getWindow() //取得Window物件
                .setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //設定背景為透明
        return LayoutInflater.from(getContext()).inflate(R.layout.dialog_loading,container,false);
    }

    ////5.再來就看你要表現什麼在此Fragment呈現
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //6.有view時產生特效
        ProgressBar progressBar = view.findViewById(R.id.spin_kit);
        Sprite doubleBounce = new DoubleBounce();
        Sprite wanderingCubes = new WanderingCubes();
        Sprite cubeGrid =  new CubeGrid();

        Sprite rotatingPlane  = new RotatingPlane();
        progressBar.setIndeterminateDrawable(wanderingCubes);


    }
}
