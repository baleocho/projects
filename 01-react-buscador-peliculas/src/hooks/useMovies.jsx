import { useState, useRef, useMemo } from "react"
import * as moviesServices from "../services/movies-service"

export const useMovies = (props) => {
  const [movies, setMovies] = useState({});
  const previousSearch = useRef(props.search)

  const getMovies = () => {
    if(props.search == previousSearch.current) return 

    previousSearch.current = props.search
    moviesServices.getMovies({search:props.search}).then(result => {
      setMovies(result)
    }).catch(error => alert("Movie not found!"))
  }

  const sortedMovies = useMemo(() => {
    return props.sort ? 
      [...movies].sort((a, b) => a.title.localeCompare(b.title))
      : movies
  }
  , [props.sort, movies])
  

  return { movies: sortedMovies, sortedMovies, getMovies }
}