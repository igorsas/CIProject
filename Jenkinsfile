pipeline {
   agent any

   stages {
      stage('Build') {
        steps {
          echo 'Building...'
          echo "Running ${env.BUILD_ID} ${env.BUILD_DISPLAY_NAME} on ${env.NODE_NAME} and JOB ${env.JOB_NAME}"
          mvn compile
        }
   }
   stage('Test') {
     steps {
        echo 'Testing...'
        mvn test
     }
   }
   stage('Deploy') {
     steps {
       echo 'Deploying...'
       mvn deploy
     }
   }
  }
}