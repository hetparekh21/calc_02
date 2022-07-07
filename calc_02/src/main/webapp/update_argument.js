function check_input(value) {

	// length of the current arg
	var len = document.getElementById("argument").innerText.length ;
	// last char of current arg
	var last_char = document.getElementById("argument").innerText.charAt(len-1) ;



	console.log("value : " + value);

	if(value == -1){

		var sp = Array.from(document.getElementById("argument").innerText) ;

		sp[len-1] = ',' ;

		var final = "" ;
			for(var i = 0 ; i < sp.length ; i++){

				if(sp[i] == ','){

					continue ;

				}

				final = final + sp[i] ;

			}
		
			document.getElementById("argument").innerText = final ;
			
			document.getElementById("a").value = document.getElementById("argument").innerText.toString() ;
			
			return;
	}

	if(value == "CE" || value == "C"){

		document.getElementById("argument").innerText = "" ;

		document.getElementById("a").value = document.getElementById("argument").innerText.toString() ;
		
		return ;

	}
	
	if(value == '/' || value == '*' || value == '-' || value == '+' || value == '%'){

		if(last_char == '/' || last_char == '*' || last_char == '-' || last_char == '+' || last_char == '%'){

			var sp = Array.from(document.getElementById("argument").innerText) ;
			sp[len-1] = value ;
			// var semi_final = sp.toString().replace(/,/g,"\xa0").trim();
			var final = "" ;
			for(var i = 0 ; i < sp.length ; i++){

				if(sp[i] == ','){

					continue ;

				}

				final = final + sp[i] ;

			}

			document.getElementById("argument").innerText = final ;

		}else{

			document.getElementById("argument").innerText = document.getElementById("argument").innerText + value ;

		}
		
	}

	if(value == '0' || value == '1' || value == '2' || value == '3' || value == '4' || value == '5' || value == '6' || value == '7' || value == '8' || value == '9' ){

		// console.log(document.getElementById("argument").innerText);
		document.getElementById("argument").innerText = document.getElementById("argument").innerText + value ;
		// console.log(document.getElementById("argument").innerText);

	}

	console.log(document.getElementById("argument").innerText.toString());

	document.getElementById("a").value = document.getElementById("argument").innerText.toString() ;
	
}