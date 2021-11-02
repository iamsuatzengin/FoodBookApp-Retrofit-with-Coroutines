package com.suatzengin.foodbookapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.suatzengin.foodbookapp.adapter.FoodAdapter
import com.suatzengin.foodbookapp.databinding.FragmentFoodListBinding
import com.suatzengin.foodbookapp.viewmodel.FoodListViewModel


class FoodListFragment : Fragment() {
    private lateinit var binding: FragmentFoodListBinding
    private val adapter = FoodAdapter()
    private lateinit var viewModel: FoodListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFoodListBinding.inflate(inflater, container, false)

        binding.rvFoodItems.adapter = adapter

        viewModel = ViewModelProvider(this).get(FoodListViewModel::class.java)

        viewModel.getFoodList()

        viewModel.foodList.observe(viewLifecycleOwner, {
            adapter.foodList = it
        })
        return binding.root
    }

}