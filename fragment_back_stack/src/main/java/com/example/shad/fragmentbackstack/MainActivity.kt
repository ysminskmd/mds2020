package com.example.shad.fragmentbackstack

import android.os.Bundle

import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(this::onNavigationItemSelected)

        if (savedInstanceState != null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, FirstFragment()).commit()
        }
    }

    private fun onNavigationItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.navigation_home -> {
            replaceFragment(FirstFragment())
            true
        }
        R.id.navigation_dashboard -> {
            replaceFragment(SecondFragment())
            true
        }
        R.id.navigation_notifications -> {
            replaceFragment(ThirdFragment())
            true
        }
        else -> false
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
