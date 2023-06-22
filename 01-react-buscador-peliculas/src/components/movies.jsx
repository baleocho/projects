export const ListOfMovies = ({ movies }) => {
    return (
        <ul className="movies">
            {movies.map(movie => (
                <li className="movie" key={movie.id}>
                    <h3>{movie.title}</h3>
                    <p>{movie.year}</p>
                    <img src={movie.poster} alt={movie.Poster} />
                </li>
            ))}
        </ul>
    )
}

export const NoMoviesResults = () => {
    return (
        <h4>Movie not found!</h4>
    )
}

export const Movies = ({ movies }) => {
    const hasMovies = movies?.length > 0;

    return (
        hasMovies
            ? <ListOfMovies movies={movies} />
            : <NoMoviesResults />
    )
}