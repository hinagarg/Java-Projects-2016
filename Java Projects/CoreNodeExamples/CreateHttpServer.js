/**
 * 
 */

var http = require('http');

var server = http.createServer(function(request,response){
	
	
	response.writeHead(200, {'Content-Type': 'text/plain'});
	response.end('NodeJS Text Respnse');
});

server.listen(3000);

console.log("Use Client Browser and access url:= http://localhost/3000");

