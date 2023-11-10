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

stage('SonarQube Analysis') {
            steps {
              script {
            // Assuming 'sonar-auth' is a token credential, retrieve it directly
            def sonarToken = credentials('sonar-auth')

            // Run SonarQube analysis with the token
            sh 'mvn clean package sonar:sonar -Dsonar.login=${sonarToken}'
        }
}

            }
}

        
    }


