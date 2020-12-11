pipeline {
    agent any
    triggers { cron('H/15 * * * *') }
    options { timeout(time: 5) }
    stages {
        stage("hello") {
            steps {
                echo "argh"
            }
        }
        stage("Checkout code") {
            steps {
                git url: 'https://github.com/alexwestcott1/jenkins-nonsense'
            }
        }
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Unit tests") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}