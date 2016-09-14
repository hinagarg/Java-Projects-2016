/**
 * 
 */

var myfunction = function() {
	
	alert("Hi from annonymous function");
	
}

function greet(){
	
	return "Hello World";
	
}

function showGreeting(funRef){
	
	var msg = funRef(); 
	console.log(msg);
	
}
(function() {
	
	alert("Hi from Self Executing annonymous function");
	myfunction();
	//showGreeting(greet); 
	
	showGreeting(greet()); 
	//greet() becomes immediately invoked rather passing function 
	//return type of the function is passed.
	
})();