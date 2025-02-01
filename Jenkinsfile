pipeline {
    agent any

    environment {
        // Define environment variables if needed
        MAVEN_HOME = tool name: 'Maven 3.8.6', type: 'maven' // Replace "Maven 3.8.6" with the actual name from Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Pull code from GitHub
                git branch: 'main', url: 'https://github.com/InfraArchitect-SOC/math-utils.git', credentialsId: 'your-credentials-id'
            }
        }

        stage('Build') {
            steps {
                // Build the project using Maven
                bat "${MAVEN_HOME}\\bin\\mvn clean install"
            }
        }

        stage('Test') {
            steps {
                // Run JUnit tests
                bat "${MAVEN_HOME}\\bin\\mvn test"
            }
        }

        stage('Publish Test Results') {
            steps {
                // Publish JUnit test results
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        success {
            echo 'Build and tests succeeded!'
        }
        failure {
            echo 'Build or tests failed!'
        }
    }
}
