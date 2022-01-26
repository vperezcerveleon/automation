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
        
        success {
emailext(body: content, mimeType: 'text/html',
         replyTo: '$DEFAULT_REPLYTO', subject: subject,
         to: to, attachLog: true );
	}
    }
	

}
