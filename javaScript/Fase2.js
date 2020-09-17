function funcionFase2(){
	
	var city1="", city2="", city3="", city4="", city5="", city6="", arrayCities=[""];
	
	city1=prompt("Introduzca ciudad: ");
	city2=prompt("Introduzca ciudad: ");
	city3=prompt("Introduzca ciudad: ");
	city4=prompt("Introduzca ciudad: ");
	city5=prompt("Introduzca ciudad: ");
	city6=prompt("Introduzca ciudad: ");
		
	arrayCities[0]=city1;
	arrayCities[1]=city2;
	arrayCities[2]=city3;
	arrayCities[3]=city4;
	arrayCities[4]=city5;
	arrayCities[5]=city6;

	document.getElementById("show1").innerHTML= "Ciudades introducidas: <br>" + arrayCities + 
	 "<br><br> Ciudades ordenadas por orden alfabetica: <br>" + arrayCities.sort(); 
}