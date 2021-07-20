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
        <link rel="stylesheet" href="css/home.css"> 

        <title>Portfolio Manager</title>
        <style>
        	
        </style>
    </head>

    <body>

        <!-- nav -->
        <nav class="navbar navbar-expand-lg navbar-custom ">
            <div class="container-fluid">
            
               <a class="navbar-brand" href="dash.html" style="color:#384B42"><b>Portfolio Manager</b></a>
                <form action="/logout" method="GET"><button type="button float-right" class="btn btn-dark">Logout</button></form>
            </div>
        </nav>
        <!-- nav -->


        <!-- Content -->
        <div class="container p-5">
            <div class="row p-4 ml-4">
                <div class="col pl-5">
                    <div class="card shadow-lg" style="width:450px">
                       <!--  <img class="card-img-top"
                            src="https://images.unsplash.com/photo-1624996379697-f01d168b1a52?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"
                            alt="Card image" style="width:100%">-->
                            
                            <img class="card-img-top"
                            src="img/inv1.gif"
                            alt="Card image" style="width:100%">
                            
                        <div class="card-body">
                        	<center>
                            <h4 class="card-title">View Networth</h4>
                            <p class="card-text text-secondary">Check your networth by clicking here</p>
                            <a href="/viewNetworth" class="btn btn-warning btn-lg shadow">View Networth</a>
                            </center>
                        </div>
                    </div>

                </div>

                <div class="col pl-5">
                    <div class="card shadow-lg" style="width:450px">
                        <!-- <img class="card-img-top"
                            src="https://images.unsplash.com/photo-1620266757065-5814239881fd?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=752&q=80"
                            alt="Card image" style="width:100%"> -->
                            
                            <img class="card-img-top"
                            src="img/inv2.gif"
                            alt="Card image" style="width:100%">
                            
                        <div class="card-body">
                        <center>
                            <h4 class="card-title">Sell Asset</h4>
                            <p class="card-text text-secondary">Click here to sell you asset(s).</p>
                            <a href="/sellAsset" class="btn btn-warning btn-lg shadow">Sell Asset</a>
                        </center>
                        </div>
                    </div>

                </div>
            </div>

        </div>


        <!-- Footer -->
        <footer class="mt-auto navbar-custom" id="footer">
		<div class="container justify-content-end ">
			<div class="row">
				<div class="col">
					<center>
						<p class="p-4 pr-5 ">
							Copyright © 2021 <a href="#"
								style="text-decoration: none; color: black">| CodeCrunchers</a>.
						</p>
					</center>
				</div>
			</div>

		</div>

	</footer>
        
        

    </body>

    </html>
