app.controller('signUpCtrl', function($scope, $http, $cookies) {
	$scope.signUp = function () {
		var email = $scope.email;
		var nickname = $scope.nickname;
		var pwd = $scope.pwd;
		var gender = $('input[name=gender-radio]:checked', '#sign-up-form').val();
		$http({
			method: 'GET',
			url: 'http://localhost:8080/SYCWeb/user/signUp.do',
			params: {
				email: email,
				nickname: nickname,
				pwd: pwd,
				gender: gender
			}
		}).then(function successCallback(response) {
				var result = response.data;
				if("exist" == result)
					alert("Email is already exists!");
				else if("success" == result) {
					alert("Sign up succeeded!");
					window.history.back();
				}
				else
					alert(result);
			}, function errorCallback(response) {
				alert(response.data);
			});
	};

});