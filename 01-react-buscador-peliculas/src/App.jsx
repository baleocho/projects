import React, { useEffect, useRef, useState } from 'react'
import './App.css'
import { Movies } from "./components/movies"
import { useMovies } from "./hooks/useMovies"
import TodoAppFuntional from "./TodoAppFuntional";

const formStyle = { display: "flex", justifyContent: "center", alignItems: "center" }
const inputStyle = { width: "100%", marginRight: "0" }

function App() {
  const [sort, setSort] = useState(false)
  const [query, setQuery] = useState('')
  const {movies, getMovies} = useMovies({search:query, sort})
  const [error, setError] = useState(null)
  const isFirstInput = useRef(true)

  const handleSubmit = (event) => {
    event.preventDefault()
    //const { query } = Object.fromEntries(new window.FormData(event.target))
    getMovies()
  }

  const handleChange = (event) => {
    const newQuery = event.target.value
    setQuery(newQuery)
  }

  useEffect(() => {
    if (isFirstInput.current) {
      isFirstInput.current = query == ''
      return
    }
    if (query == '') {
      setError('The value is empty')
      return
    }

    //Invetigate
    //if(query.match())
    setError(null)
  }, [query])

  const handleSort = () => {
    setSort(!sort)
  }

  return (
    <div className='page'>
      <header>
        <h1>Search your movie by their title</h1>
        <form style={formStyle} onSubmit={handleSubmit}>
          <input onChange={handleChange} value={query} name="query" style={inputStyle} placeholder='The Office, Star Wars ...' />
          <button type='submit'>Search</button>
          <input type='checkbox' onChange={handleSort} checked={sort}/>
        </form>
        
          <p style={{ color: 'red', margin: 0 }}>
            {error ?? "."}
          </p>
        
      </header>
      <main className='main'>
        <Movies movies={movies} />
      </main>



      <TodoAppFuntional/>

    </div>
  )
}

export default App
