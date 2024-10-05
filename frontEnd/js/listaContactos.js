window.onload = function () {
    listarAtencion();
}



let listarAtencion = async () => {
    const peticion = await fetch("http://localhost:8086/contactanos/listadoContact",
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
        <td>${hability.nombre}</td>
        <td>${hability.gmail}</td>
        <td>${hability.numTelefono}</td>
        <td>${hability.mensaje}</td>
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
    const peticion = await fetch("http://localhost:8086/contactanos/eliminarContact/" + id,
        {
            method: "DELETE",
            headers: {
                "Accept": "application/json",
                "content-type": "application/json"
            }
        });

    listarAtencion();

}