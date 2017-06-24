angular.module("DiasporaApp").service(
		"DiasporaService",
		function($http, $cookies, userUrl, loginUrl, logoutUrl, registerUrl) {

			var serviceData = this;

			serviceData.authUser = {};

			serviceData.register = function(user) {

				return $http({
					method : 'PUT',
					url : userUrl,
					data : user
				}).then(function(response) {
					return response;
				}, function(response) {
					throw response;
				});
			}

			serviceData.auth = function(user) {
				var headers = user ? {
					Authorization : "Basic "
							+ btoa(user.username + ":" + user.password)
				} : {};
				return $http({
					method : 'POST',
					url : userUrl + loginUrl,
					headers : headers
				}).then(function(response) {
					return response;
				}, function(response) {
					throw response;
				});

			}
		});