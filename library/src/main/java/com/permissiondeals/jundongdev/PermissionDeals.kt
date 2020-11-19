package com.permissiondeals.jundongdev

import androidx.fragment.app.FragmentActivity

/**
 * Basic interfaces for developers to use PermissionDeals functions
 * @author liujundong
 * @Date: 2020/11/19
 */
object PermissionDeals {

    private const val TAG = "Invisible Fragment"

    fun request(
        activity: FragmentActivity,
        vararg permissions: String,
        callback: PermissionCallback
    ) {
        val fragmentManger = activity.supportFragmentManager
        val existedFragment = fragmentManger.findFragmentByTag(TAG)
        val fragment = if (existedFragment != null) {
            existedFragment as InvisibleFragment
        } else {
            val invisibleFragment = InvisibleFragment()
            fragmentManger.beginTransaction().add(invisibleFragment, TAG).commitNow()
            invisibleFragment
        }
    }

}