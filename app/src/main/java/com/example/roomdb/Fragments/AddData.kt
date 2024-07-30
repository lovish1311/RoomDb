package com.example.roomdb.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.roomdb.R
import com.example.roomdb.databinding.FragmentAddDataBinding


class AddData : Fragment() {
    private lateinit var dataArray: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentAddDataBinding.inflate(layoutInflater)
        // initialize the bundle
        val bundle = Bundle()
        // define all the values to be sent in listdata fragment
        var firstName = binding.tvFirstName.text.toString()
        var lastName = binding.tvLastName.text.toString()
        var age = binding.tvAge.text.toString()
        binding.btAddData.setOnClickListener {
            // putting the values in the array form
            dataArray = arrayOf(firstName, lastName, age)
            bundle.putStringArray("data", dataArray)
            listData().arguments = bundle
            // switch to listData Fragment
            switchFragment(listData())

        }

        binding.btSeeList.setOnClickListener {
            switchFragment(listData())
        }
        return binding.root

    }

    fun switchFragment(fragment: Fragment) {
        (context as AppCompatActivity).supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }


}