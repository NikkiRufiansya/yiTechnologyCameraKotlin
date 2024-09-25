package com.yitechnology

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import com.yitechnology.databinding.ActivityMainBinding
import com.yitechnology.fragment.HomeFragment
import com.yitechnology.fragment.SettingsFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var menu: Menu = binding.bottomView.menu
        selectedMenu(menu.getItem(0))
        binding.bottomView.setOnNavigationItemSelectedListener { item: MenuItem ->
            selectedMenu(item)
            false
        }
        binding.bottomView.textAlignment = View.TEXT_ALIGNMENT_CENTER

    }

    private fun selectedMenu(item: MenuItem){
        item.isChecked = true
        when(item.itemId){
            R.id.home_menu -> setCurrentFragment(HomeFragment())
            R.id.settings_menu -> setCurrentFragment(SettingsFragment())
        }
    }

    private fun setCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.rootFragment, fragment).commit()
        }
    }
}