package com.example.wsrfood1.presentation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.wsrfood1.adapters.RecyclerViewAdapter
import com.example.wsrfood1.databinding.FragmentHomeBinding
import com.example.wsrfood1.models.Dish

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        _binding!!.recyclre.layoutManager = GridLayoutManager(context, 2)

        val list = ArrayList<Dish>()
        _binding!!.recyclre.adapter = RecyclerViewAdapter(list)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}