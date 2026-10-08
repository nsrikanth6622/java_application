pipeline {

    agent any

    environment 
    {
        APP_NAME = 'quickcart-order-service'
        APP_VERSION = '1.0'
    }
    parameters 
    {
        choice (
            name: 'EVIRONMENT',
            choices: ['dev','qa','prod'],
            description: 'select your environment'
        )
        booleanParam(
            name: 'RUN_TESTS',
            defaultValue: true,
            description: 'execute application tests'
        )
    }
    stages {
        stage('Initialize') {
            steps {
                echo 'Initializing QuickCart Pipeline'
                echo "Job Name: ${env.JOB_NAME}"
                echo "Build Number: ${env.BUILD_NUMBER}"
                echo "Workspace: ${env.WORKSPACE}"

                echo "environment is: ${params.EVIRONMENT}"
                echo "run tests or not: ${params.RUN_TESTS}"
            }
        }

        stage('Build') {
            steps {
                echo 'Building QuickCart Order Service Version 2'
                echo "App Name: ${APP_NAME}"
                echo "Version: ${APP_VERSION}"
                echo "Jenkins Build Number: ${env.BUILD_NUMBER}"
            }
        }

        stage('Test') {
            steps {
                echo 'Running QuickCart tests'
                echo 'Successfully complated all the tests'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating QuickCart package'
            }
        }
    }
}