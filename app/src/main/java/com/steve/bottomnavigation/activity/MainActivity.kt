package com.steve.bottomnavigation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.steve.bottomnavigation.R
import com.steve.bottomnavigation.databinding.ActivityMainBinding
import com.steve.bottomnavigation.fragment.HomeFragment
import com.steve.bottomnavigation.fragment.MessageFragment
import com.steve.bottomnavigation.fragment.NotificationFragment
import com.steve.bottomnavigation.fragment.SearchFragment

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val homeFragment =HomeFragment()
        val searchFragment=SearchFragment()
        val notificationFragment=NotificationFragment()
        val messageFragment=MessageFragment()

        setCurrentFragment(homeFragment)
       binding?.bottomNavigationView?.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.home ->setCurrentFragment(homeFragment)
                R.id.search ->setCurrentFragment(searchFragment)
                R.id.notification ->setCurrentFragment(notificationFragment)
                R.id.message ->setCurrentFragment(messageFragment)
            }
            true
        }
        binding?.bottomNavigationView?.getOrCreateBadge(R.id.message)?.apply {
            number=10
            isVisible=true
        }
    }
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.buttomFragment,fragment)
            commit()
        }
}