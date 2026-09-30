pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/amit007iv/GstInvoiceApp.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t gst-invoice-app:latest .'
            }
        }

        stage('Stop Old Container') {
            steps {
                sh 'docker stop gst-invoice-app || true'
                sh 'docker rm gst-invoice-app || true'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d --name gst-invoice-app -p 8080:8080 gst-invoice-app:latest'
            }
        }
    }
}