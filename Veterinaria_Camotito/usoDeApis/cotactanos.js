
let booton = document.getElementById("btnContactanos");

booton.addEventListener("click", evento => {
    registrarContactanos();
})


let registrarContactanos = async () => {

    let campos = {};


    campos.nombre = document.getElementById("nombre").value;
    campos.gmail = document.getElementById("gmail").value;
    campos.numTelefono = document.getElementById("numTelefono").value;
    campos.mensaje = document.getElementById("mensaje").value;


    const peticion = await fetch("http://localhost:8086/contactanos/crearContact",
        {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)

        });

}