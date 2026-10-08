pipeline {

    agent any

    tools {
        maven 'Maven-3.9'
    }

    environment {
        APP_NAME = 'quickcart-order-service'
    }

    stages {

        stage('Build') {

            steps {
                echo "Building ${APP_NAME}"
                bat 'mvn clean compile'
            }
        }

        stage('Test') {

            steps {
                echo 'Running unit tests'
                bat 'mvn test'
            }
        }

        stage('Package') {

            steps {
                echo 'Packaging application'
                bat 'mvn package -DskipTests'
            }
        }
    }

    post {

        always {

            junit(
                allowEmptyResults: true,
                testResults: 'target/surefire-reports/*.xml'
            )
        }

        success {

            archiveArtifacts(
                artifacts: 'target/*.jar',
                fingerprint: true
            )

            echo 'QuickCart CI Pipeline SUCCESS'
        }

        failure {
            echo 'QuickCart CI Pipeline FAILED'
        }
    }
}