<%@ page language="java" contentType="text/html;  charset=UTF-8"
import="java.util.*"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css"
            integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/sell.css"> 
</head>
<body>
 		<nav class="navbar navbar-expand-lg navbar-custom ">
            <div class="container-fluid">
            
               <a class="navbar-brand" href="dash.html" style="color:#384B42"><b>Portfolio Manager</b></a>
                <form action="/logout" method="GET"><button type="button float-right" class="btn btn-dark">Logout</button></form>
            </div>
        </nav>
      <br>
      <div class="container">
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6 ">
                <div class="card text-center shadow-lg" >
                    <!-- <img class="card-img-top img-fluid" src="https://images.unsplash.com/photo-1624996379697-f01d168b1a52?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"> -->
                    <div class="card-block p-4">
                        <h4 class="card-title">Sell Assets</h4>
                        <p class="card-text">Select the assets which you want to sell.</p><br><br>
                    
                         
                         <form method="post" onSubmit=" return checker();" action="/viewNetworth" >
                         <table  class=table style="margin-left: auto;margin-right: auto;">
                			<tr>
                    			<th scope=col>Asset Name</th>
                    			<th scope=col>Units Available</th>
                    			<th scope=col>Units to be sold</th>
                    			
                         	<tr>
                         	<c:forEach items="${asset}" var="temp" >
                        <tr>
                         <td scope=row><input type="checkbox" value="${temp.assetId}" name="selected">${temp.assetName } </td>
                         <td scope=row><p>${temp.units }</p></td>
                         <td scope=row><input  type="number" id="quantity" name="quantity" value="0" min="0" max="${temp.units}"></td> 
                         </c:forEach>
                         </tr>
                         </table>
                         <button type="submit" name="submit"  class="btn btn-black btn-primary"> Sell Assets</button>
                         </form>     
       
                         
                         
                         
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
            
            <script type="text/javascript" >
            	var a=document.getElementById("quantity")
            	function checker(){
            		console.log("hello");
                	var count=0;
					var l = document.getElementsByName("selected");
					for(var i=0;i<l.length;i++){
						if(l[i].checked){
							
							console.log("selected"+l[i]);
							count++;
						
							
						}
					}
					//console.log(count);
					 if(count==0){
						alert("Please select a value");
						return false;
					}else return true; 	
                }
            </script>
</body>
</html>