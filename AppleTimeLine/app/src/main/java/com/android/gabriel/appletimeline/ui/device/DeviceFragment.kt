package com.android.gabriel.appletimeline.ui.device

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.gabriel.appletimeline.databinding.DataListItemBinding
import com.android.gabriel.appletimeline.databinding.FragmentDeviceBinding

class DeviceFragment : Fragment() {

    private val dataArray : ArrayList<String> = ArrayList()
    private lateinit var rvData: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = FragmentDeviceBinding.inflate(layoutInflater)
        val bindingData = DataListItemBinding.inflate(layoutInflater)
        addDataArray()
        var contextData = getActivity()?.getApplicationContext();

        rvData = binding.rvDataList

        rvData.layoutManager = LinearLayoutManager(contextData)
        rvData.adapter = contextData?.let { DataAdapter(dataArray, it, bindingData) }


        return binding.root
    }

    private fun addDataArray() {
        dataArray.add("오리")
        dataArray.add("호랑이")
        dataArray.add("여우")
        dataArray.add("늑대")
        dataArray.add("오소리")
        dataArray.add("원숭이")
        dataArray.add("물개")
        dataArray.add("펭귄")
        dataArray.add("하마")
        dataArray.add("미어캣")
        dataArray.add("타조")


    }
}