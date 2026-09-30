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

        stage('Run Docker Container') {
            steps {
                sh 'docker rm -f gst-invoice-app || true'
                sh 'docker run --name gst-invoice-app gst-invoice-app:latest'
            }
        }
    }
}