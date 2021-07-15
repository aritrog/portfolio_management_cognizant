<%@ page language="java" contentType="text/html;  charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css"
	integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/home.css">

<title>View Networth</title>
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
		<div class="row">
			<div class="col-3"></div>
			<div class="col-5 ml-2 p-4">
				<div class="card shadow-lg" style="width: 600px;">
					<center>

						<img class="card-img-top" style="height: 300px;"
							src="img/networth2.jpg"
							alt="Card image" style="width:100%">
						<!-- card block -->
						<div class="card-body">
							<!-- <h1 class="card-title">Calculate Networth</h1> -->
							<p class="card-text" Style="color: green;font-size: 18pt;font-weight: bold">Your Current Networth is :
								${networth}</p>


							<c:if test="${assetMap != null}">

							<div class="container">
								<table class="table">
									<thead >
										<tr>
											<th>Asset</th>
											<th>Units Sold</th>
											
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${assetMap}" var="temp">
											<tr>
												<td>${asset.get(temp.key).getAssetName()}</td>
												<td>${temp.value}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>

							</div>
							</c:if>

						</div>
						<!-- card block -->
					</center>
				</div>

			</div>

			<div class="col-4"></div>
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

	<script>
		console.log("${asset.get('share2').getAssetName()}");
														</script>
</body>
</html>