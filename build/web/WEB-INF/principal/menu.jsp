<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>Actualizacion Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="./assets/css/reset.css">
        <link rel="stylesheet" href="./assets/css/supersized.css">
        <link rel="stylesheet" href="./assets/css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>

        <div class="page-container">
            <h1>Bienvenido</h1>

            <% String msg = (String) request.getAttribute("msgError");%>
            <div class="connect">
                <%if (msg != null) {
                        out.println(msg);
                    }%>
            </div>
           
            <form action="cargarVentas" method="post">

                <button type="submit">Actualizar Ventas</button>
                <div class="error"><span>+</span></div>
            </form>
            <form action="login" method="post">

                <button type="submit">Actualizar Precios</button>
                <div class="error"><span>+</span></div>
            </form>

            <div class="connect">
                <p>Si presenta inconvenientes comunicar al Soporte Tecnico</p>

            </div>
        </div>

        <!-- Javascript -->
        <script src="./assets/js/jquery-1.8.2.min.js"></script>
        <script src="./assets/js/supersized.3.2.7.min.js"></script>
        <script src="./assets/js/supersized-init.js"></script>
        <script src="./assets/js/scripts.js"></script>

    </body>

</html>

