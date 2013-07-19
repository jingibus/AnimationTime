package com.bignerdranch.android.animationtime;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AnimationFragment extends Fragment {
	private static final String TAG = "AnimationFragment";

	View animView, hidingView, showView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_animation, container, false);
		
		animView = v.findViewById(R.id.animView);
		hidingView = v.findViewById(R.id.hidingView);
		showView = v.findViewById(R.id.showView);
		
		animView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.i(TAG, "Animating, start!");

				float targetTranslationY = animView.getWidth();
				
				ObjectAnimator anim;
				if (animView.getTranslationY() == targetTranslationY) {
					anim = ObjectAnimator.ofFloat(animView, "translationY", targetTranslationY, 0);
				} else {
					anim = ObjectAnimator.ofFloat(animView, "translationY", 0, targetTranslationY);
				}
				
				anim.setDuration(2000);
				anim.start();
			}
		});
		
		hidingView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				hidingView.setVisibility(View.GONE);
			}
		});
		
		showView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				hidingView.setVisibility(View.VISIBLE);
			}
		});
		
		return v;
	}
}
