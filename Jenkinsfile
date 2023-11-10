pipeline {
    agent any
    environment {
        SONARQUBE_USERNAME = 'admin'
        SONARQUBE_PASSWORD = 'sonar'
    }
    
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
                 sh "mvn sonar:sonar -Dsonar.login=${SONARQUBE_USERNAME} -Dsonar.password=${SONARQUBE_PASSWORD}"

            }
}

        
    }
}

