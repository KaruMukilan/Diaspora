angular.module("DiasporaApp")
.controller("NavbarCtrl", function($uibModal){
//.controller("NavbarCtrl", function(DiasporaService, $uibModal){
	
	var navbarData = this;
	//navbarData.authUser = DiasporaService.authUser;
	
/*	navbarData.openUserModal = function(){
	    var modalInstance = $uibModal.open({
	        animation: true,
	        templateUrl: 'ng/templates/modals/userModal.html',
	        controller: 'UserModalCtrl as uData',
	        size: 'lg'
	      });	
	}*/

	navbarData.openLoginModal = function(){
	    var modalInstance = $uibModal.open({
	        animation: true,
	        templateUrl: 'ng/login.html',
	        //controller: 'LoginCtrl as lData',
	        size: 'sm'
	      });	
	}
	
	navbarData.openRegisterModal = function(){
	    var modalInstance = $uibModal.open({
	        animation: true,
	        templateUrl: 'ng/register.html',
	        //controller: 'RegisterCtrl as rData',
	        size: 'sm'
	      });	
	}
	
});