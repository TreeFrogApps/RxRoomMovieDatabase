package innovation.com.moviedatabasetest.di.component;


import dagger.Subcomponent;
import innovation.com.moviedatabasetest.di.module.MovieFragmentDetailModule;
import innovation.com.moviedatabasetest.di.module.MovieFragmentListModule;
import innovation.com.moviedatabasetest.di.module.MovieFragmentSearchModule;
import innovation.com.moviedatabasetest.movie.MovieActivity;
import innovation.com.moviedatabasetest.di.module.MovieActivityModule;
import innovation.com.moviedatabasetest.di.scope.ActivityScope;

@ActivityScope
@Subcomponent(modules = MovieActivityModule.class)
public interface MovieActivityComponent {

    void inject(MovieActivity movieActivity);

    MovieFragmentDetailComponent addFragmentDetailComponent(MovieFragmentDetailModule fragmentModule);

    MovieFragmentListComponent addFragmentListComponent(MovieFragmentListModule fragmentModule);

    MovieFragmentSearchComponent addFragmentSearchComponent(MovieFragmentSearchModule fragmentModule);
}
