package com.d3if2089.galerihewan.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.d3if2089.galerihewan.model.Hewan
import com.d3if2089.galerihewan.R
import com.d3if2089.galerihewan.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        with(binding.recyclerView) {
            addItemDecoration(
                DividerItemDecoration(context, RecyclerView.HORIZONTAL)
            )
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
    }

    private fun getData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor", R.drawable.angsa),
            Hewan("Ayam", "Gallus gallus", R.drawable.ayam),
            Hewan("Bebek", "Cairina moschata", R.drawable.bebek),
            Hewan("Domba", "Ovis ammon", R.drawable.domba),
            Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun),
            Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing),
            Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci),
            Hewan("Kerbau", "Bubalus bubalis", R.drawable.kerbau),
            Hewan("Kuda", "Equus caballus", R.drawable.kuda),
            Hewan("Sapi", "Bos taurus", R.drawable.sapi)
        )
    }
}