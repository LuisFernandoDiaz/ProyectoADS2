
var link = document.createElement("link");
link.rel = "stylesheet";
link.href = "css/listaServicios.css";
link.type = "text/css";
document.getElementsByTagName("head")[0].appendChild(link);


const header = document.querySelector("header");


header.innerHTML =
    `
            <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Veterinaria Camotito</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">INICIO</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="listaUsuario.html">LISTA USUARIO</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="listaConsulta.html">LISTA CONSULTA</a>
                        </li>
                        <!--<li class="nav-item">
                            <a class="nav-link" href="listaServicios.html">LISTA SERVICIOS</a>
                        </li>-->
                        <li class="nav-item">
                            <a class="nav-link" href="registrarProducto.html">REGISTRAR PRODUCTO</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
`;