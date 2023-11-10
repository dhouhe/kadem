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
                withSonarQubeEnv(credentialsId: 'sonar-auth') {
                sh 'mvn clean package sonar:sonar'
}

            }
}

        
    }
}

