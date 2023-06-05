package br.com.fiapteam.seed.ui.panel

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import br.com.fiapteam.seed.databinding.FragmentPanelBinding

class PanelFragment : Fragment() {

    private var _binding: FragmentPanelBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPanelBinding.inflate(inflater, container, false)
        val root: View = binding.root
        view?.let { super.onViewCreated(it, savedInstanceState) }
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()
        val myWebView = binding.panelWebview
        myWebView.webViewClient  = WebViewClient()
        myWebView.loadUrl("https://global-solutions-webview.vercel.app/menu/painel")
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.settings.useWideViewPort = true
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}