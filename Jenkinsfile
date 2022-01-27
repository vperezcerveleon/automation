pipeline {
	
	agent any
	
	options{
		timestamps()
	}
	
	
	stages{
		stage("Checkout, Test & Publish") {
			steps{
				bat  'echo "hello"'
			}
		}
		
		
	}
	
  
        post {
        failure {
           emailext (to: 'jorgesebastiancuevasromero@gmail.com', from: 'jorgesebastiancuevasromero@gmail.com',
                subject: "Example Build: ${env.JOB_NAME} - Failed", 
                body: "Job Failed - \"${env.JOB_NAME}\" build: ${env.BUILD_NUMBER}\n\nView the log at:\n ${env.BUILD_URL}\n\nBlue Ocean:\n${env.RUN_DISPLAY_URL}");
		
		slackSend failOnError: true, color: "#b73732", message:"Build failed  - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"

        	}
	success {
			emailext (to: 'jorgesebastiancuevasromero@gmail.com', from: 'jorgesebastiancuevasromero@gmail.com',
                subject: "Example Build: ${env.JOB_NAME} - Success", 
                body: "Job Success - \"${env.JOB_NAME}\" build: ${env.BUILD_NUMBER}\n\nView the log at:\n ${env.BUILD_URL}\n\nBlue Ocean:\n${env.RUN_DISPLAY_URL}");
		
		   slackSend failOnError: false, color: "#22D71D", message:"Build Succeeded - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"

         } 
    }
}
