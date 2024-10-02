
let booton = document.getElementById("btnRegistrar");

booton.addEventListener("click", evento => {
    registrarMascota();
})


let registrarMascota = async () => {

    let campos = {};


    campos.nomDueño = document.getElementById("nomDueño").value;
    campos.nomMascota = document.getElementById("nomMascota").value;
    campos.edad = document.getElementById("edad").value;
    campos.peso = document.getElementById("peso").value;
    campos.raza = document.getElementById("raza").value;
    campos.especie = document.getElementById("especie").value;


    const peticion = await fetch("http://localhost:8080/mascota/crearMascot",
        {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)

        });

}