package com.example.tablayout

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter (fragment:FragmentActivity, private val pageList:MutableList<Page>):FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = pageList.size

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("page" to pageList[position])
        return fragment
    }
}