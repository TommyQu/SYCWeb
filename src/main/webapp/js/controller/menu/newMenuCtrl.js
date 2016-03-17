app.controller('newMenuCtrl', function($scope, $http, $cookies) {
	
	var userCookie = $cookies.get('userCookie');
	
	$scope.newMenu = function () {
//		var title = $scope.title;
//		var content = $scope.content;
		alert("11");
//		alert(content);
//		var pwd = $scope.pwd;
//		$http({
//			method: 'GET',
//			url: 'http://localhost:8080/SYCWeb/user/login.do',
//			params: {
//				email: email,
//				pwd: pwd
//			}
//		}).then(function successCallback(response) {
//				var result = response.data;
//				if("fail" == result)
//					alert("Login Failed!");
//				else {
//					$cookies.put('userCookie', response.data);
//					location.reload();
//				}
//			}, function errorCallback(response) {
//				alert(response.data);
//			});
	};
});
