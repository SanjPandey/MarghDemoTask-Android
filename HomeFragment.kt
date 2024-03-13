package com.example.demotask.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.demotask.R
import com.example.demotask.adapter.ExploreAdapter
import com.example.demotask.databinding.FragmentHomeBinding
import com.example.demotask.model.ExploreModel


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    var exploreList: MutableList<ExploreModel> = mutableListOf()
    lateinit var exploreAdapter: ExploreAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        showExploreListData()
        replaceFragment(SavedFragment())


    }


    private fun replaceFragment(item: Fragment) {
        childFragmentManager.beginTransaction()
            .replace(
                R.id.myContainer,
                item
            )  // Replace R.id.fragmentContainer with your actual container ID
            .commit()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(context))
        val view: View = binding.root

        return view
    }


    private fun showExploreListData() {
        exploreList = ArrayList()
        exploreAdapter = ExploreAdapter(requireContext(), exploreList)
        binding.exploreRv.adapter = exploreAdapter


        exploreList.clear()
        exploreList.add(
            ExploreModel(

                R.drawable.image_four

            )
        )
        exploreList.add(
            ExploreModel(

                R.drawable.image_three

            )
        )
        exploreList.add(
            ExploreModel(

                R.drawable.image_two

            )
        )
        exploreList.add(
            ExploreModel(

                R.drawable.image_two

            )
        )
        exploreList.add(
            ExploreModel(

                R.drawable.image_four

            )
        )
        exploreList.add(
            ExploreModel(

                R.drawable.image_two

            )
        )
        exploreList.add(
            ExploreModel(

                R.drawable.image_three

            )
        )
        exploreList.add(
            ExploreModel(

                R.drawable.image_two

            )
        )
        exploreList.add(
            ExploreModel(

                R.drawable.image_four

            )
        )

    }

}

