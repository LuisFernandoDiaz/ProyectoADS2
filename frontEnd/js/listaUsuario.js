window.onload = function () {
    listarServicio();
}



let listarServicio = async () => {
    const peticion = await fetch("http://localhost:8086/cliente/listadoClient",
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
        <td>${hability.nombres}</td>
        <td>${hability.apellido}</td>
        <td>${hability.dni}</td>
        <td>${hability.numero}</td>
        <td>${hability.correo}</td>
        <td>${hability.direccion}</td>
        <td>${hability.username}</td>
        <td>${hability.password}</td>
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
    const peticion = await fetch("http://localhost:8086/cliente/eliminarClient/" + id,
        {
            method: "DELETE",
            headers: {
                "Accept": "application/json",
                "content-type": "application/json"
            }
        });

    listarServicio();

}