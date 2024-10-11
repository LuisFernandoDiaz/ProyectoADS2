window.onload = function () {
    listarAtencion();
}



let listarAtencion = async () => {
    const peticion = await fetch("http://localhost:8086/servicio/listadoServis",
        {
            method: "GET",
            headers: {
                "Accept": "application/json",
                "content-type": "application/json"
            }
        });

    const listado = await peticion.json();

    let contenidoTabla = "";

    for (let hability of listado) {
        let contenidoFila = `<tr>
        <td>${hability.id}</td>
        <td>${hability.nomMascota}</td>
        <td>${hability.servicio}</td>
        <td>${hability.fecha}</td>
        <td>${hability.hora}</td>
        <td>
            <button onClick="BorrarFilas(${hability.id})" type="button" class="btn btn-dark">Dark</button>
        </td>
        </tr>
        `
        contenidoTabla += contenidoFila;
    }

    document.querySelector("#tablaa tbody").outerHTML = contenidoTabla;

}


//aqui viene el DELETE


let BorrarFilas = async (id) => {
    const peticion = await fetch("http://localhost:8086/servicio/eliminarServis/" + id,
        {
            method: "DELETE",
            headers: {
                "Accept": "application/json",
                "content-type": "application/json"
            }
        });

    listarAtencion();

}