pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Pull code from GitHub
                git branch: 'main', url: 'https://github.com/InfraArchitect-SOC/math-utils.git', credentialsId: 'your-credentials-id'
            }
        }

        stage('Install Dependencies') {
            steps {
                // Install pytest and pytest-html
                bat 'pip install pytest pytest-html'
            }
        }

        stage('Test') {
            steps {
                // Run pytest and generate an HTML report
                bat 'pytest test_math_utils.py --html=report.html'
            }
        }

        stage('Publish Test Results') {
            steps {
                // Publish HTML report
                publishHTML(target: [
                    reportName: 'Python Test Report',
                    reportDir: '.',
                    reportFiles: 'report.html',
                    alwaysLinkToLastBuild: true
                ])
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
