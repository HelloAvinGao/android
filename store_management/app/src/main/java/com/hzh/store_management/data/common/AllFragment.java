package com.hzh.store_management.data.common;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class AllFragment {
    // replace fragment
    public static void replaceFragment(Fragment fragment, FragmentActivity activity, int fragmentId) {
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(fragmentId, fragment);
        transaction.commit();
    }
}
