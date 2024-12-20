const correo = document.getElementById('correo')
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

        if ((correo.value, password.value) === (`${hability.correo}`, `${hability.password}`)) {

            redireccion();

        }
    }


}

function redireccion() {
    location.href = "pgPrincipal.html"
}