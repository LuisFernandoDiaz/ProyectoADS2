
let booton = document.getElementById("btn");

booton.addEventListener("click", evento => {
    registrarCliente();
})


let registrarCliente = async () => {

    let campos = {};


    campos.nombres = document.getElementById("nombres").value;
    campos.apellido = document.getElementById("apellido").value;
    campos.dni = document.getElementById("dni").value;
    campos.numero = document.getElementById("numero").value;
    campos.correo = document.getElementById("correo").value;
    campos.direccion = document.getElementById("direccion").value;
    campos.username = document.getElementById("username").value;
    campos.password = document.getElementById("password").value;



    const peticion = await fetch("http://localhost:8086/cliente/crearClient",
        {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)

        });

}