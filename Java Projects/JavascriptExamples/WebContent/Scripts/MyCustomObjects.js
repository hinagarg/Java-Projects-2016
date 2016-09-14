/**
 * 
 */

var item = {

	
	itemNumber : 101,
	itemName : 'Tv',
	
	showItem : function(){
		
		return this.itemName.toUpperCase();
	}
	

}

function Product(){
	this.name = "Laptop";
	this.price = 45000;
	this.showDetails = function(){
		return this.name + ":" + this.price;
	}
	
}

function SalesMan(name,code){
	this.name = name;
	this.code = code;
	this.showSalesMan = function(){
		return this.name + ":" + this.code;
	}
	
}
(function(){
	
	document.writeln(item.itemNumber);
	document.writeln(item.itemName);
	document.writeln(item.showItem());
	
	var prd1 = new Product();
	
	document.write(prd1.showDetails());
	
	var obj = new SalesMan("Rajesh", "Raj101");
	document.writeln(obj.showSalesMan());
})();