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

stage('SonaQube Analysis') {
            steps {
                 script {
                    withSonarQubeEnv('') {
                        // Assuming 'sonar-auth' is a SonarQube token credential
                        def sonarTokenCredentials = credentials('sonar-auth')
                        def sonarToken = sonarTokenCredentials.getToken()

                        // Run SonarQube analysis with the token
                        sh "mvn clean package sonar:sonar -Dsonar.login=${sonarToken}"
                    }
                }
              
           
        }
}

            
}

        
    }


