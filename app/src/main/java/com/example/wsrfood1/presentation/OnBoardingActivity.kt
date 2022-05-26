package com.example.wsrfood1.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.wsrfood1.R
import com.example.wsrfood1.databinding.ActivityOnBoardingBinding
import com.example.wsrfood1.presentation.fragments.OnBoardingFragment1
import com.example.wsrfood1.presentation.fragments.OnBoardingFragment2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardingActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
//        binding = ActivityOnBoardingBinding.inflate(layoutInflater)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager2)
        val skip = findViewById<TextView>(R.id.textView_skip)

        skip.setOnClickListener{
            MainScreenActivity.startForResult(applicationContext)
        }

        viewPager.adapter = object : FragmentStateAdapter(this){
            override fun getItemCount(): Int {
                return 2
            }

            override fun createFragment(position: Int): Fragment {
                if (position == 0) return OnBoardingFragment1() else return OnBoardingFragment2()
            }

        }
    }

    companion object{
        fun startForResult (context:Context){
            val i = Intent(context,OnBoardingActivity::class.java)
            context.startActivity(i)
        }
    }
}