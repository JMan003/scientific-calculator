pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/JMan003/scientific-calculator.git'
            }
        }
        
        stage('Build and Test') {
            steps {
                // This runs the same Maven command you ran locally
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Maven build and JUnit tests completed successfully!'
                }
                failure {
                    echo 'Build or tests failed. Check the logs.'
                }
            }
        }
    }
}
