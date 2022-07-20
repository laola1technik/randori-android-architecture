package ag.sportradar.moviedatabase.koin

import ag.sportradar.moviedatabase.presentation.SearchMoviesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

object ViewModelModule {
    val module = module {
        viewModel {
            SearchMoviesViewModel(
                get(),
                get(named("ioScheduler")),
                get(named("mainScheduler"))
            )
        }
    }
}