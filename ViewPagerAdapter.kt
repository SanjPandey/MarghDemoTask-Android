package com.example.demotask.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(supportFragmentManager: FragmentManager):FragmentPagerAdapter(supportFragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val fragmentList=ArrayList<Fragment>()
    var fragmentTitle=ArrayList<String>()



    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }
    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitle[position]
    }
    fun addFragment(fragment:Fragment,title:String){
        fragmentList.add(fragment)
        fragmentTitle.add(title)
    }
}