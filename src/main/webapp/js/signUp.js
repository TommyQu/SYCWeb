app.controller('signUpCtrl', function($scope, $http) {
	$scope.signUp = function () {
		var email = $("#email").val();
		var nickname = $("#nickname").val();
		var pwd = $("#pwd").val();
		var gender = $('input[name=gender-radio]:checked', '#sign-up-form').val()
		$http({
			method: 'GET',
			url: 'user/signUp.do',
			params: {
				email: email,
				nickname: nickname,
				pwd: pwd,
				gender: gender
			}
		}).then(function successCallback(response) {

			}, function errorCallback(response) {

			});
	};

});