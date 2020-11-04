package com.android.gabriel.appletimeline.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.android.gabriel.appletimeline.R
import com.android.gabriel.appletimeline.databinding.FragmentDeviceBinding
import com.android.gabriel.appletimeline.databinding.FragmentHomeBinding
import com.android.gabriel.appletimeline.ui.device.DeviceFragment


class HomeFragment : Fragment() {

    private lateinit var iphoneBtn: Button
    private lateinit var ipadBtn: Button
    private lateinit var macBtn: Button
    private lateinit var watchBtn: Button

    private lateinit var fragmentDevice: DeviceFragment

    private lateinit var deviceFragmentContainer: LinearLayout

    private var button = 1


    private fun setListeners() {

        val clickableViews: List<Button> =
            listOf(
                iphoneBtn, ipadBtn, macBtn,
                watchBtn
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeNavigate(it) }
        }
    }

    private fun makeNavigate(view: View) {
        when (view.id) {
            R.id.iphone -> {
                button = 0
                var mFragmentManager = getChildFragmentManager()

                mFragmentManager.beginTransaction()
                    ?.replace(R.id.nav_host_fragment, fragmentDevice, "")?.run {
                        if (true) addToBackStack("")
                        else this
                    }
                    ?.commitAllowingStateLoss()
            }
            R.id.ipad -> ipadBtn.text = "Clicked"
            R.id.mac -> macBtn.text = "Clicked"
            R.id.watch -> watchBtn.text = "Clicked"
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentHomeBinding.inflate(layoutInflater)
        val bindingDevice = FragmentDeviceBinding.inflate(layoutInflater)

        iphoneBtn = binding.iphone
        ipadBtn = binding.ipad
        macBtn = binding.mac
        watchBtn = binding.watch

        deviceFragmentContainer = bindingDevice.devicefragmentContainer

        fragmentDevice = DeviceFragment()


        setListeners()

        if(button==1){
            return binding.root
        }
        else{
            return bindingDevice.root
        }
    }
}