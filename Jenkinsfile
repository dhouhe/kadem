pipeline {
    agent any
    
    stages {
        stage('Checkout GIT') {
            steps {
                echo 'Pulling...'
                git branch: 'main', url: 'https://github.com/dhouhe/kadem'
            }
        }

        stage('Testing maven') {
            steps {
                sh 'mvn -version'
            }
        }

        stage('MVN SONARQUBE'){

           steps{
               
        // Run SonarQube analysis
        sh 'sonar-scanner'
            
          }
    }
    }
}

