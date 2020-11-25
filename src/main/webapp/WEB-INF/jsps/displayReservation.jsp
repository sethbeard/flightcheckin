<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation</title>
</head>
<body>
<h2>Flight Details</h2>
Airline: ${reservation.flight.operatingAirlines }<br>
Flight Number: ${reservation.flight.flightNumber}<br>
Departure City: ${reservation.flight. departureCity }<br>
Arrival City: ${reservation.flight.arrivalCity }<br>
Departure Date: ${reservation.flight.dateOfDeparture }<br>


<br>
<h2>Passenger Details</h2>
First Name: ${reservation.passenger.firstName } <br>
Last Name:  ${reservation.passenger.lastName }<br>
Email:  ${reservation.passenger.email }<br>
Phone:  ${reservation.passenger.phone }<br>
<form action="completeCheckIn" method="post">
Enter Number of Bags to Check In: <input type="text" name="numberOfBags"/>
<input type="hidden" name="reservationId" value="${reservation.id }">
<input type="submit" value="Check In">
</form>
</body>
</html>
