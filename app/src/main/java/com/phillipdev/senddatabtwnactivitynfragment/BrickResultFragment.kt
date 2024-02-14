package com.phillipdev.senddatabtwnactivitynfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class BrickResultFragment : Fragment() {
    lateinit var tvReults : TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_brick_result, container, false)
        tvReults = view.findViewById(R.id.textViewResult)

        val length : Double = arguments?.getDouble("length").toString().toDouble()
        val width: Double = arguments?.getDouble("width").toString().toDouble()
        val result : Int = ((length*width) * 60).toInt()
        tvReults.text = "You need $result Bricks"
        // Inflate the layout for this fragment
        return view
    }


}