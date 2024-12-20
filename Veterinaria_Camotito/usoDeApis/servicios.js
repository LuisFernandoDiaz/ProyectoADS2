
const guardarBtn = document.getElementById('guardarBtn')
const regresarBtn = document.getElementById('regresarBtn')


regresarBtn.addEventListener('click', (e) => {
    e.preventDefault()
    redireccion();
})


guardarBtn.addEventListener('click', (e) => {
    e.preventDefault()
    registrarServicios();
    redireccion();
})

let registrarServicios = async () => {

    let campos = {};

    campos.nomMascota = document.getElementById('nomMascota').value;
    campos.servicio = document.getElementById('servicio').value;
    campos.fecha = document.getElementById('fecha').value;
    campos.hora = document.getElementById('hora').value;

    const peticion = await fetch("http://localhost:8086/servicio/crearServis",
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
    location.href = "pgServicio.html"
}




