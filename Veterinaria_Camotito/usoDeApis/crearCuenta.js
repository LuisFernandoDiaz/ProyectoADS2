
let booton = document.getElementById("btn");

booton.addEventListener("click", evento => {
    registrarCliente();
    redireccion();
})


let registrarCliente = async () => {

    let campos = {};


    campos.nombresCompleto = document.getElementById("nombresCompleto").value;
    campos.numero = document.getElementById("numero").value;
    campos.correo = document.getElementById("correo").value;
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

function redireccion() {
    location.href = "index.html"
}