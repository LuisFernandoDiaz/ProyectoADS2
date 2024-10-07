const username = document.getElementById('username')
const password = document.getElementById('password')
const button = document.getElementById('button')

button.addEventListener('click', (e) => {
    e.preventDefault()

    listarAtencion();


})

let listarAtencion = async () => {
    const peticion = await fetch("http://localhost:8086/cliente/listadoClient",
        {
            method: "GET",
            headers: {
                "Accept": "application/json",
                "content-type": "application/json"
            }
        });

    const listado = await peticion.json();

    for (let hability of listado) {

        if ((username.value, password.value) === (`${hability.username}`, `${hability.password}`)) {

            redireccion();

        }

    }


}

function redireccion() {
    location.href = "pgPrincipal.html"
}