const API_KEY = '4d1f5a98'

export const getMovies = async ({ search }) => {

    if (search == '')
        return null

    return fetch(`https://www.omdbapi.com/?apikey=${API_KEY}&s=${search}`)
        .then(response => response.json())
        .then(data => {
            if(data.Response)
                return data?.Search.map(movie => ({
                    id: movie.imdbID,
                    title: movie.Title,
                    year: movie.Year,
                    poster: movie.Poster
                }))
            else
                return alert("Error: Movie not found!")
        })
        .catch(error => {
            throw new Error('Error searching movies: ', error)
        })
}