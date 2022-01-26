pipeline {
	
	agent any
	
	options{
		timestamps()
	}
	
	
	stages{
		stage("Checkout, Test & Publish") {
			steps{
				bat 'echo "hello"'
			}
		}
		
		stage("Email"){
			steps{
				emailext (to: 'jorgesebastiancuevasromero@gmail.com', replyTo: 'jorgesebastiancuevasromero@gmail.com', subject: "Email Report from - ${env.JOB_NAME} ${env.BUILD_NUMBER}", body: "Email Report from - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)");
			}
		}
	}
	
  
        post {
        failure {
            mail to: 'notify-list@example.com', from: 'jenkins@example.com',
                subject: "Example Build: ${env.JOB_NAME} - Failed", 
                body: "Job Failed - \"${env.JOB_NAME}\" build: ${env.BUILD_NUMBER}\n\nView the log at:\n ${env.BUILD_URL}\n\nBlue Ocean:\n${env.RUN_DISPLAY_URL}"
        }
    }
}
