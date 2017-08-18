package innovation.com.moviedatabasetest.movie;


import java.util.List;

import innovation.com.moviedatabasetest.provider.db.Movie;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.subjects.PublishSubject;

public interface IMovieSharedModel {

    Single<Movie> getMovie(long movieId);

    Flowable<List<Movie>> getMovieList(int id);

    void updateMovies();

    void performMovieSearch(String query);

    Flowable<List<Movie>> subscribeToSearchResults();

    void updateMovie(Movie movie);

}
