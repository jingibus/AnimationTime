package com.bignerdranch.android.animationtime;

import android.support.v4.app.Fragment;

public class AnimationActivity extends SingleFragmentActivity {
	@Override
	protected Fragment createFragment() {
		return new AnimationFragment();
	}
}
