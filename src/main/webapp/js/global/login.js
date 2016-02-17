app.controller('headerCtrl', function($scope, $http) {
	$scope.btnShow = true;
	$scope.nicknameShow = false;
	$scope.login = function () {
		
		var email = $("#email").val();
		var pwd = $("#pwd").val();
		$http({
			method: 'GET',
			url: 'http://localhost:8080/SYCWeb/user/login.do',
			params: {
				email: email,
				pwd: pwd
			}
		}).then(function successCallback(response) {
				console.log("test:", response);
//				location.reload();
//				$scope.user = response.data;
//				alert($scope.user);
//				console.log("test:", $scope.user.email);
			}, function errorCallback(response) {
				alert(response.data);
			});
	};

});
