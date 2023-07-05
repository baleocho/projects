const carro = {
    numPlaca: "JLH8282",
    numSerie: "VF3CC5FS5ET002350",
    nomPropetario: "BRIAN ALEJANDRO OCHOA DURAN",
    numMotor: "10FHCA1920914"
}
let formData = new FormData();

formData.append('placa', 'JLH8282');
formData.append('numeroSerie', 'VF3CC5FS5ET002350');
formData.append('nombrePropietario', 'BRIAN ALEJANDRO OCHOA DURAN');
formData.append('numeroMotor', '10FHCA1920914');


const getMultas = (carro) => {
    fetch("https://gobiernoenlinea1.jalisco.gob.mx/serviciosVehiculares/adeudos",
        {
            method: 'POST',
            body: formData
        })
        .then(response =>  console.log(response))
        //.then(response => response.text())
        //.then(data => console.log(data))
        .catch(error => console.log("Error at get info: ", error))
}

getMultas(carro)