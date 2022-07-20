package ag.sportradar.moviedatabase.presentation

import ag.sportradar.moviedatabase.databinding.FragmentSearchBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class SearchMoviesFragment : Fragment() {

    val searchViewModel: SearchMoviesViewModel by lazy {
        val viewModelProvider = ViewModelProvider(this)
        viewModelProvider[SearchMoviesViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSearchBinding.inflate(inflater)



        return binding.root
    }
}