pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                git branch: 'main', url: 'https://github.com/shweta1525/jenkinsjob.git'
                sh '''ls
                  pwd'''
            }
        }
        stage('Build') { 
            steps {
            sh 'mvn clean package'
            }
        }
        stage('Deploy') { 
            steps {
               echo 'this is deploy'
            }
        }
    }
}