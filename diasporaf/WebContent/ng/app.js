angular.module("DiasporaApp",[
                           "ui.router", 
                           "ui.bootstrap",
                           'ui.gravatar',
                           'ngAnimate',
                           'ngCookies',
                           'textAngular'
                           ]);

angular.module("DiasporaApp").constant("loginUrl","login/");
angular.module("DiasporaApp").constant("logoutUrl","logout/");
angular.module("DiasporaApp").constant("registerUrl","register/");