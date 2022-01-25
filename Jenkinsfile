pipeline {
	
	agent any
	
	options{
		timestamps()
	}
	
	
	stages{
		stage("Checkout, Test & Publish") {
			//
		}
		
		stage("Email"){
			steps{
				emailext (to: 'jorgesebastiancuevasromero@gmail.com', replyTo: 'jorgesebastiancuevasromero@gmail.com', subject: "Email Report from - '${env.JOB_NAME} ${env.BUILD_NUMBER}');
			}
		}
	}
	

}
