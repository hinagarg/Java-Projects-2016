/**
 * http://usejsdoc.org/
 */

exports.list = function(req, res){
  var restaurents = {
		  
		  'Citrus': {
				ratingValue: '3',
				reviewCount:  '250',
				priceRange: 'Medium'
			}

  }
  res.send(restaurents);
};
