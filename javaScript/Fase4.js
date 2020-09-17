function funcionFase4(){
	
	var city1="", city2="", city3="", city4="", city5="", city6="",
		arrayCity1 = [], arrayCity2 = [], arrayCity3 = [], arrayCity4 = [], arrayCity5 = [], arrayCity6 = [];
		
	city1=prompt("Introduzca ciudad: ");
	city2=prompt("Introduzca ciudad: ");
	city3=prompt("Introduzca ciudad: ");
	city4=prompt("Introduzca ciudad: ");
	city5=prompt("Introduzca ciudad: ");
	city6=prompt("Introduzca ciudad: ");

	arrayCity1= city1.split("");
	arrayCity2= city2.split("");
	arrayCity3= city3.split("");
	arrayCity4= city4.split("");
	arrayCity5= city5.split("");
	arrayCity6= city6.split("");

	document.getElementById("show1").innerHTML= "Ciudades introducidas: <br>" +
	arrayCity1 + " | "+ arrayCity2 + " | "+ arrayCity3 + " | "+ 
	arrayCity4 + " | "+ arrayCity5 + " | "+ arrayCity6 + "<br>" +
	"Ciudades con los nombres invertidos: <br> " + 
	arrayCity1.reverse() + " | "+ arrayCity2.reverse() + " | "+ arrayCity3.reverse() + " | "+ 
	arrayCity4.reverse() + " | "+ arrayCity5.reverse() + " | "+ arrayCity6.reverse();
}