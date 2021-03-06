package com.nxtty.nxttyapp;

import android.os.Bundle;
import android.view.ViewGroup;

import com.activeandroid.ActiveAndroid;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

/**
 * Created by Raymond on 02/03/2015.
 */
public class SettingsActivity extends BaseActivity {


    private ViewGroup profileSettings;
    private int REQUEST_IMAGE_CAPTURE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.settings_layout);
        ActiveAndroid.initialize(this);
        Utilities.getInstance().setActivity(this);
        SharedPref.getInstance().setContext(this);
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).threadPriority(Thread.NORM_PRIORITY - 2).denyCacheImageMultipleSizesInMemory()
                .discCacheFileNameGenerator(new Md5FileNameGenerator()).tasksProcessingOrder(QueueProcessingType.LIFO).build();
        ImageLoader.getInstance().init(config);
        super.onCreate(savedInstanceState);
    }

}
