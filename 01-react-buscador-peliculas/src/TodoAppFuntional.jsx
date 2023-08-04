import React, { useState } from 'react'

const TodoAppFuntional = () => {
  const [inputText, setInputText] = useState("")
  const [items, setItems] = useState([
    { id: "1", text: "Learn JavaScript", done: false },
    { id: "2", text: "Learn React", done: false },
    { id: "3", text: "Play around in JSFiddle", done: true },
    { id: "4", text: "Build something awesome", done: true }
  ])

  const handleAddNewItem = (isFrominpuText = false, event) => {
    event.preventDefault()
    if (isFrominpuText) {
      setItems([...items, { text: inputText, done: true }])
      setInputText("")
    } else {
      setItems([...items, { text: "Build something awesome", done: true }])
    }
  }

  const handleChangeChecket = (index) => {
    const localItems = [...items]
    localItems[index].done = !localItems[index].done
    setItems(localItems)
  }

  const handleAddItem = () => {
    handleAddNewItem
  }



  return (
    <div>
      <h2>Todos:</h2>
      <form>
        <input value={inputText} onChange={(e) => setInputText(e.target.value)}></input>
        <button onClick={(e) => handleAddNewItem(true, e)}>Add +</button>
        <ol>
          {items.map((item, index) => (
            <li key={index}>
              <label>
                <input type="checkbox" onChange={() => handleChangeChecket(index)} checked={item.done} />
                <span className={item.done ? "done" : ""}>{item.text}</span>
              </label>
            </li>
          ))}
        </ol>
        <button type="button" onClick={(e) => handleAddNewItem(false, e)}> Add new item </button>
      </form>
    </div>
  )
}

export default TodoAppFuntional;