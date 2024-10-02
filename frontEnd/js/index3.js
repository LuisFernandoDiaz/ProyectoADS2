
let booton = document.getElementById("btnRegistrar");

booton.addEventListener("click", evento => {
    registrarPelicula();
})


let registrarPelicula = async () => {

    let campos = {};


    campos.nombre = document.getElementById("nombre").value;
    campos.lengPro1 = document.getElementById("lengPro1").value;
    campos.lengPro2 = document.getElementById("lengPro2").value;
    campos.lengPro3 = document.getElementById("lengPro3").value;
    campos.baseDato = document.getElementById("baseDato").value;


    const peticion = await fetch("http://localhost:8080/guardar",
        {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(campos)

        });

}