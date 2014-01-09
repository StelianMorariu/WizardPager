package ro.stemo.wizardpager.model;

import android.support.v4.app.Fragment;

import java.util.ArrayList;

import ro.stemo.wizardpager.ui.NumberFragment;


public class NumberPage extends TextPage {

	public NumberPage(ModelCallbacks callbacks, String title) {
		super(callbacks, title);
	}

	@Override
	public Fragment createFragment() {
		return NumberFragment.create(getKey());
	}

    @Override
    public void getReviewItems(ArrayList<ReviewItem> dest) {

    }

}
