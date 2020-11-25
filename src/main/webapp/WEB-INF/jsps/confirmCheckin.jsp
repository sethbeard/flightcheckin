<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check In Successful</title>
</head>
<body>
<h2>Check in Successful!</h2>

<b>Passenger Name:</b> ${reservation.passenger.firstName}&nbsp${reservation.passenger.lastName}<br>
<b>Reservation Id:</b> ${reservation.id}<br> 
<b>Departure Date:</b> ${reservation.flight.dateOfDeparture}<br>
<b>Number Of Bags To Check:</b> ${reservation.numberOfBags }

<a href="/flightcheckin"><button name="Return To Homepage">Return To Homepage</button></a>
</body>
</html>