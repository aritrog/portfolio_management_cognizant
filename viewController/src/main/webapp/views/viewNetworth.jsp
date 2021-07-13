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

        <title>View Networth</title>
    </head>
<body >
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
                                src="https://th.bing.com/th/id/OIP.R6Ipz-EkfHnYF-uOnzciQwHaEc?w=265&h=180&c=7&o=5&dpr=1.38&pid=1.7"
                                alt="Card image" style="width:100%">
                            <!-- card block -->
					<div class="card-body">
						<h1 class="card-title">Calculate Networth</h1>
						
						<p class="card-text" Style="color:green;">Your Networth is : ${networth}</p>
						
					 
						<c:if test="${assetMap != null}" >
						<br>
						<div class="container">
							<table class="table" style="align:center">
							<center>
								<thead >
									<tr>
										<th style="text-align:center">Asset</th>
										<th style="text-align:center">Units Sold</th>
									</tr>
								</thead>
								<tbody>
										


										<c:forEach items="${assetMap}" var="temp">
										<tr>
											<td style="text-align:center;font-weight: normal">JIO</td>
											<td style="text-align:center;font-weight: normal">12</td>
										</tr>
										<tr>
											<td style="text-align:center;font-weight: normal">AXIS</td>
											<td style="text-align:center;font-weight: normal">25</td>
										</tr>
										<tr>
										<td style="text-align:center;font-weight: normal">${temp.key}</td>
										<td style="text-align:center;font-weight: normal">${temp.value}</td>
									</tr>
										</c:forEach>
								</tbody>
								</center>
							</table>
							
						</div>
						</c:if>

					</div>
					<!-- card block -->
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