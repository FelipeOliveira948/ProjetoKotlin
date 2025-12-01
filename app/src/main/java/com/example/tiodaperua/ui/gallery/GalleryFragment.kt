package com.example.tiodaperua.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tiodaperua.R
import com.example.tiodaperua.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonAlunos.setOnClickListener {
            findNavController().navigate(R.id.action_nav_gallery_to_alunosFragment)
        }

        binding.buttonResponsaveis.setOnClickListener {
            findNavController().navigate(R.id.action_nav_gallery_to_responsaveisFragment)
        }

        binding.buttonTurma.setOnClickListener {
            findNavController().navigate(R.id.action_nav_gallery_to_turmaFragment)
        }

        binding.buttonEscola.setOnClickListener {
            findNavController().navigate(R.id.action_nav_gallery_to_escolaFragment)
        }

        binding.buttonCondutores.setOnClickListener {
            findNavController().navigate(R.id.action_nav_gallery_to_condutoresFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}