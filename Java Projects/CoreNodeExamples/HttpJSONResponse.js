/**
 * 
 */

var http = require ('http');

var server = http.createServer(function(request, response){
	
	if(request.url === '/data'){
		
		response.writeHead(200, {'Content-Type':'application/json'});
		
		response.write(JSON.stringify({user:'ramesh', location:'Chennai'}));
		
		response.end();
	}
});

server.listen(3200);

console.log("Server Listening");

