package hu.tvarga.popularmovies.dataaccess.database;

import android.net.Uri;
import android.provider.BaseColumns;

public class MovieContract {

	public static final String CONTENT_AUTHORITY = "hu.tvarga.popularmovies";

	public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

	public static final String PATH_MOVIE = "movie";

	public static final class MovieEntry implements BaseColumns {

		public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_MOVIE)
				.build();

		public static final String TABLE_NAME = "movie";

		public static final String COLUMN_MOVIE_ID = "movie_id";
		public static final String COLUMN_RELEASE_DATE = "release_date";
		public static final String COLUMN_VOTE_AVERAGE = "vote_average";
		public static final String COLUMN_POSTER_PATH = "poster_path";
		public static final String COLUMN_OVERVIEW = "overview";
		public static final String COLUMN_ORIGINAL_TITLE = "original_title";

		public static Uri buildMovieUriWithId(int id) {
			return CONTENT_URI.buildUpon().appendPath(Integer.toString(id)).build();
		}

	}

}
