package com.zenglb.framework.di.module;

import com.zenglb.framework.demo.main.AreUSleepFragmentList;
import com.zenglb.framework.di.scope.FragmentScope;
import com.zenglb.framework.navigation.fragment.MeProfileFragment;
import com.zenglb.framework.navigation.fragment.Rxjava2DemoFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 *
 *
 */
@Module
public abstract class MainActivityNaviModule {
    // Rather than having the activity deal with getting the intent extra and passing it to the presenter
    // we will provide the taskId directly into the AddEditTaskActivitySubcomponent
    // which is what gets generated for us by Dagger.Android.
    // We can then inject our TaskId and state into our Presenter without having pass through dependency from
    // the Activity. Each UI object gets the dependency it needs and nothing else.

//    @Provides
//    static AreUSleepFragmentList provideAreUSleepFragment(){
//        return new AreUSleepFragmentList();
//    };

    @FragmentScope
    @ContributesAndroidInjector
    abstract AreUSleepFragmentList provideAreUSleepFragment();

    @FragmentScope
    @ContributesAndroidInjector
    abstract Rxjava2DemoFragment provideRxjava2DemoFragment();


    @FragmentScope
    @ContributesAndroidInjector
    abstract MeProfileFragment provideMeProfileFragment();


//    @Provides
//    @ActivityScope
//    @Nullable
//    static String provideTaskId(MainActivityBottomNavi activity) {
//        return activity.getIntent().getStringExtra(MainActivityBottomNavi.);
//    }

//    @Provides
//    @ActivityScope
//    static boolean provideStatusDataMissing(AddEditTaskActivity activity) {
//        return activity.isDataMissing();
//    }


//    @ActivityScope
//    @Binds
//    abstract AddEditTaskContract.Presenter taskPresenter(AddEditTaskPresenter presenter);

    //NOTE:  IF you want to have something be only in the Fragment scope but not activity mark a
    //@provides or @Binds method as @FragmentScoped.  Use case is when there are multiple fragments
    //in an activity but you do not want them to share all the same objects.
}