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

stage('SonarQube analysis') {
            steps {
                 script {
                    withSonarQubeEnv(credentialsId:'sonar-auth') {
                       
                        sh 'mvn clean package sonar:sonar'
                    }
                }
              
           
        }
}

stage('Unit Tests') {
            steps {
                script {
                    // Run your unit tests with Mockito
                    sh 'mvn test' // Assurez-vous que cette ligne est adaptée à votre outil de construction
                }
            }
        }

stage('NEXUS') {
    steps {
        script {
            def nexusUsername = 'admin'
            def nexusPassword = 'nexus'

            sh "mvn deploy -Dusername=${nexusUsername} -Dpassword=${nexusPassword}"
        }
    }
}



            
}

        
    }


