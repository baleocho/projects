import React, {useState} from 'react'

const TodoAppFuntional = () => {

	const [items, setItems] = useState([
      	{ id:"1", text: "Learn JavaScript", done: false },
        { id:"2", text: "Learn React", done: false },
        { id:"3", text: "Play around in JSFiddle", done: true },
        { id:"4", text: "Build something awesome", done: true }
  ])
	 
  const handleAddNewItem = () => {
  	setItems([...items,  { text: "Build something awesome", done: true }])
  }
  const handleChangeChecket = (index) => {
    const localItems = [...items]
    localItems[index].done = !localItems[index].done
    setItems(localItems)
  }

  
  
return(
 		<div>
        <h2>Todos:</h2>
        <form>
        <ol>
        {items.map((item, index) => (
          <li key={index}>
            <label>
              <input type="checkbox" onChange={()=> handleChangeChecket(index)} checked={item.done} /> 
              <span className={item.done ? "done" : ""}>{item.text}</span>
            </label>
          </li>
        ))}
        </ol>
        <button type="button" onClick={handleAddNewItem}> Add new item </button>
        </form>
      </div>
)
}

export default TodoAppFuntional;