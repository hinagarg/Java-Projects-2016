
/**
 * http://usejsdoc.org/
 */

var fs = require('fs');

fs.writeFile("Names.txt", "Ramesh, Suresh, Magesh", function(err){
	
	if(err) {
		console.log(err);
	} else {
		console.log("File Created");
	}
});

fs.readFile("Names.txt", 'utf8', function(err, data){
	
	console.log("Reading from file");
	
	if(err) {
		console.log(err);
	} 
	
	console.log(data.toString());
}); 
