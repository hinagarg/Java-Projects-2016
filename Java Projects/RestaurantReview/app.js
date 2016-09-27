
/**
 * Module dependencies.
 */
var MongoClient = require('mongodb').MongoClient;
var express = require('express')
  , routes = require('./routes')
  , user = require('./routes/user')
  , HotelReview = require('./routes/HotelReview')
  , http = require('http')
  , path = require('path');

var app = express();

// all environments
app.set('port', process.env.PORT || 3000);
app.set('views', __dirname + '/views');
app.set('view engine', 'ejs');
app.use(express.favicon());
app.use(express.logger('dev'));
app.use(express.bodyParser());
app.use(express.methodOverride());
app.use(app.router);
app.use(express.static(path.join(__dirname, 'public')));

// development only
if ('development' == app.get('env')) {
  app.use(express.errorHandler());
}

app.get('/', routes.index);
app.get('/users', user.list);
var result = app.get('/HotelReviews', HotelReview.list);
app.get('/addReviews', function(req, res) {
    res.sendfile("./views/AddDetails.html");
});

app.post('/saveReview', function(req,res){
	
	console.log(req.body.name);
	console.log(req.body.rating);
	console.log(req.body.reviewers);
	connection.collection('reviews').insertOne(req.body);
	res.send("Data added");
});

var connection;
var url = 'mongodb://localhost:27017/test';

MongoClient.connect(url, function(err, db) {
            connection=db;
    console.log("Connected correctly to server"+connection);
 
//db.close();
});

app.get('/ShowReviews', function (req, res)
{
	res.render('ShowReview.ejs', {hotelName:"Citrus", rating : "3/5", reviewers:'200'});
});
app.get('/show', function (req, res)
{
	//res.render('ShowReview.ejs', {hotelName:"ChaiPoint"});
	connection.collection('reviews').find().toArray(function(err,result){
		res.render('show.ejs',{list:result});
	});
	
});
http.createServer(app).listen(app.get('port'), function(){
  console.log('Express server listening on port ' + app.get('port'));
});
