pipeline {
    agent {
        docker {
            image 'gradle'
            args '-w /home/gradle/project'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'gradle build'
            }
        }
        stage('Test') {
            steps {
                sh 'gradle test'
            }
        }
    }
}