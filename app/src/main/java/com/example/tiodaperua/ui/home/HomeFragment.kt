package com.example.tiodaperua.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tiodaperua.LoginActivity
import com.example.tiodaperua.R
import com.example.tiodaperua.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {

    private lateinit var edtCep: EditText
    private lateinit var txtLogradouro: TextView
    private lateinit var txtBairro: TextView
    private lateinit var txtCidade: TextView
    private lateinit var txtUf: TextView
    private lateinit var btnBuscarCep: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // --- Botão Logout ---
        val btnLogout = view.findViewById<Button>(R.id.btn_logout)
        btnLogout.setOnClickListener {
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

        // --- Via CEP ---
        edtCep = view.findViewById(R.id.edtCep)
        btnBuscarCep = view.findViewById(R.id.btnBuscarCep)
        txtLogradouro = view.findViewById(R.id.txtLogradouro)
        txtBairro = view.findViewById(R.id.txtBairro)
        txtCidade = view.findViewById(R.id.txtCidade)
        txtUf = view.findViewById(R.id.txtUf)

        btnBuscarCep.setOnClickListener {
            val cep = edtCep.text.toString()

            if (cep.length != 8) {
                Toast.makeText(requireContext(), "Digite um CEP válido (8 dígitos)", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            buscarCep(cep)
        }
    }

    private fun buscarCep(cep: String) {
        RetrofitClient.instance.buscarCep(cep).enqueue(object : Callback<com.example.tiodaperua.model.ViaCepResponse> {
            override fun onResponse(
                call: Call<com.example.tiodaperua.model.ViaCepResponse>,
                response: Response<com.example.tiodaperua.model.ViaCepResponse>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    val dados = response.body()!!
                    txtLogradouro.text = "Logradouro: ${dados.logradouro ?: "-"}"
                    txtBairro.text = "Bairro: ${dados.bairro ?: "-"}"
                    txtCidade.text = "Cidade: ${dados.localidade ?: "-"}"
                    txtUf.text = "UF: ${dados.uf ?: "-"}"
                } else {
                    Toast.makeText(requireContext(), "CEP não encontrado", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<com.example.tiodaperua.model.ViaCepResponse>, t: Throwable) {
                Toast.makeText(requireContext(), "Erro ao consultar CEP", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
