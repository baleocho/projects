let gloablaData = null;
// fetch('google.com').then(result => { result.json()}).then(data => gloablaData = data).catch(e => {
//     console.log(e)
// }).finally(){
    
// }

const getGoogle = async () =>{
try{
    let result = await fetch('google.com');
    gloablaData = await result.json()
}catch(error){
    console.log(error);
}finally{
    console.log("Fetch done")
}
}
class MyClass{
    MyClass(number){
        this.number = number
    }
}
const newObject = new MyClass('123')

newObject.number

const COmponent = () => {
    const [value, setValue] = useState(0)
     const foo = () => {}
    return <button onClick={() => setValue(value => value + 1}>button</button>
}
