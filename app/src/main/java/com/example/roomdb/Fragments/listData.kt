package com.example.roomdb.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.example.roomdb.R
import com.example.roomdb.RvAdaptar
import com.example.roomdb.content
import com.example.roomdb.databinding.FragmentListDataBinding


class listData : Fragment() {
    private var listener: AdapterView.OnItemClickListener? = null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is AdapterView.OnItemClickListener) {
            listener = context
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding = FragmentListDataBinding.inflate(layoutInflater)
        val adaptar = RvAdaptar(requireContext(),content.getList())
        binding.recyclerView.adapter=adaptar
        return binding.root
    }


}