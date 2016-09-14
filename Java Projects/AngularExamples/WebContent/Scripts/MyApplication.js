/**
 * 
 */

var app = angular.module("iteration", []);

var projects = [
                {'projectCode': 'EDU101', 'description': 'MultiMedia', 'cost':45000},
                {'projectCode': 'EDU102', 'description': 'E-Tutor', 'cost':65000},
                {'projectCode': 'MED101', 'description': 'ECG', 'cost':145000},
                {'projectCode': 'MED102', 'description': 'CT-Scan', 'cost':512000},
                {'projectCode': 'ANI301', 'description': 'Ambulance', 'cost':45000}
                ];

/*function pushArray(projCode, projDesc, projCost){
	  projects.push({'projectCode': projCode, 'description': projDesc, 'cost':projCost});
	}*/

app.controller("projectController", function($scope){
	$scope.projectPushArray = function pushArray(user){
	  projects.push({'projectCode': user.projcode, 'description': user.projdesc, 'cost':user.projcost});
	}
	$scope.projectDetails = projects;
});



