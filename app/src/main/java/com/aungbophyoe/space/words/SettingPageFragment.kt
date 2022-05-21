package com.aungbophyoe.space.words

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.aungbophyoe.space.words.databinding.FragmentSettingPageBinding

class SettingPageFragment : Fragment() {
    private var _binding : FragmentSettingPageBinding? = null
    private val binding get() = _binding!!
    private val viewModel : MainViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater,R.layout.fragment_setting_page,container,false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            viewModelData = viewModel
            lifecycleOwner = viewLifecycleOwner
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

    }
}