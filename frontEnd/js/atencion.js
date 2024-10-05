window.onload = function () {
    listarAtencion();
}



let listarAtencion = async () => {
    const peticion = await fetch("http://localhost:8086/mascota/listadoMascot",
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
        <td>${hability.nomDueño}</td>
        <td>${hability.nomMascota}</td>
        <td>${hability.edad}</td>
        <td>${hability.peso}</td>
        <td>${hability.raza}</td>
        <td>${hability.especie}</td>
        <td>
            <svg  onClick="BorrarFilas(${hability.id})" xmlns="http://www.w3.org/2000/svg" width="15" height="15" viewBox="0 0 24 24">
                        <path fill="#ffffff"
                            d="M7 6V3a1 1 0 0 1 1-1h8a1 1 0 0 1 1 1v3h5v2h-2v13a1 1 0 0 1-1 1H5a1 1 0 0 1-1-1V8H2V6zm2-2v2h6V4z" />
                    </svg>
                    /
                    <svg  onClick="editarHabilidades(${hability.id})" xmlns="http://www.w3.org/2000/svg" width="15" height="15" viewBox="0 0 1025 1023">
                        <path fill="#ffffff"
                            d="M896.428 1023h-768q-53 0-90.5-37.5T.428 895V127q0-53 37.5-90t90.5-37h576l-128 127h-384q-27 0-45.5 19t-18.5 45v640q0 27 19 45.5t45 18.5h640q27 0 45.5-18.5t18.5-45.5V447l128-128v576q0 53-37.5 90.5t-90.5 37.5m-576-464l144 144l-208 64zm208 96l-160-159l479-480q17-16 40.5-16t40.5 16l79 80q16 16 16.5 39.5t-16.5 40.5z" />
                    </svg>
        </td>
        </tr>
        `
        contenidoTabla += contenidoFila;
    }

    document.querySelector("#tablaa tbody").outerHTML = contenidoTabla;

}