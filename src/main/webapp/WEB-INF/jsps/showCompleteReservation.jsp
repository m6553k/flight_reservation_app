<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation</title>
</head>
<body>
	<h2>Flight Details</h2>
	Flight Number:			 ${flights.flightNumber} <br/>
	Operating Airlines:		 ${flights.operatingAirlines} <br/>
	Departure City:			 ${flights.departureCity} <br/>
	Arrival City:			 ${flights.arrivalCity} <br/>
	Date Of Departure:		 ${flights.dateOfDeparture} <br/>
	Estimated DepartureTime: ${flights.estimatedDepartureTime} <br/>
	
	<h2>Passenger Details</h2>
	<form action="confirmRegistration" method="post">
	<pre>
		FIRST NAME	<input type="text" name="firstName"/><br/>
		LAST NAME	<input type="text" name="lastName"/><br/>
		MIDDLE NAME	<input type="text" name="middleName"/><br/>
		EMAIL		<input type="text" name="Email"/><br/>
		PHONE		<input type="text" name="Phone"/><br/>
		<input type="hidden" name="id" value="${flights.id}"/>
		
	<h2>ENTER THE CARD DETAILS HERE .....</h2>
	
		Card Number		<input type="text" name="cardnumber" /><br/>
		CVV 			<input type="text" name="cvv"/><br/>
		Expiry Date		<input type="text" name="expirydate"/><br/>
		Amount			<input type="text" name="amount"/><br/>
					<input type="Submit" value="proceed"/>	
	</pre>
	</form>
</body>
</html>