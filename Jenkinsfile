pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'test'
            }
        }

        stage('Test') {
            steps {
                sh 'build'
            
        }

        stage('Deliver') {
            steps {
                sh 'deploy'
            }
        }
    }
}
