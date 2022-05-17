package com.aungbophyoe.space.words

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.aungbophyoe.space.words.databinding.FragmentDataChangeBinding

class DataChange : Fragment() {
    private var _binding : FragmentDataChangeBinding? = null
    private val binding get() = _binding!!
    private val viewModel : MainViewModel by viewModels()
    private var key : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDataChangeBinding.inflate(inflater,container,false)
        val view = _binding!!.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            btnAdd.setOnClickListener {
                key++
                viewModel.setKey(key)
            }

            btnMinus.setOnClickListener {
                key--
                viewModel.setKey(key)
            }

            viewModel.key.observe(viewLifecycleOwner){
                key = it
                tvKey.text = "$key"
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

    }
}