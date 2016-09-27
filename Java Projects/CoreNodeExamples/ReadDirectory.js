/**
 * http://usejsdoc.org/
 */

var fs = require('fs');

//read files function from FS_ReadWrite.js
var readFiles = function(fileName) {
	fs.readFile('temp/' + fileName, 'utf8', function(err, data){
		
		console.log("Reading from file" + fileName);
		
		if(err) {
			console.log(err);
		} 
		
		console.log(data.toString());
	});

};

console.log("reading directory/temp");
fs.readdir("temp", function(err, files) {
	if(err) {
		console.error(err);
	} 
	files.forEach(function(file) {
		readFiles(file);
	});
}); 
