<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css"
            integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/style.css">

        <title>Sell Asset</title>
    </head>

    <body>

        <!-- nav -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">
                <a class="navbar-brand" href="dash.html"><b><b>Portfolio Manager</b></a>
            </div>
        </nav>
        <!-- nav -->


        <!-- Content -->
        <div class="container p-5">
            <div class="row">
                <div class="col-3">

                </div>
                <div class="col-5">
                    <div class="card" style="width:500px;">
                        <center>

                            <img class="card-img-top" style="height: 275px;"
                                src="https://images.unsplash.com/photo-1624996379697-f01d168b1a52?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"
                                alt="Card image" style="width:100%">
                            <div class="card-body">
                                <h1>Sell Assets</h1>
                                <p>Select the asset(s) you wish to sell.</p>
                                <hr>
                                <form action="">

                                    <table style="border: 1px;">

                                        <tr>
                                            <td>Asset Name</td>
                                            <td><input type="number" class="form-control form-control-sm"
                                                    placeholder="Units to be sold"></td>
                                        </tr>

                                    </table>
                                    <br>
                                    <input type="submit" class="btn btn-warning" value="Networth">

                                </form>
                            </div>
                        </center>
                    </div>

                </div>

                <div class="col-4">

                </div>
            </div>

        </div>





        <!-- Footer -->
        <footer class="mt-auto bg-primary text-white-50">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <center>
                            <p class="p-4">Copyrights <a href="https://getbootstrap.com/"
                                    class="text-white">Cognizant</a>, by <a href="https://twitter.com/mdo"
                                    class="text-white">@CodeCrunchers</a>.</p>
                        </center>
                    </div>
                </div>

            </div>

        </footer>

    </body>

    </html>