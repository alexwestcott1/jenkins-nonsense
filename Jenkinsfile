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
        stage("Code coverage") {
            steps {
                sh "./gradlew jacocoTestReport"
                publishHTML (target: [
                    reportDir: 'build/reports/jacoco/test/html',
                    reportFiles: 'index.html',
                    reportName: "Jacoco Test Coverage"
                ]

                )
                sh "./gradlew jacocoTestCoverageVerification"
            }
        }
        stage("Checkstyle") {
            steps {
                sh "./gradlew checkstyleMain"
                publishHTML (target: [
                    reportDir: 'build/reports/checkstyle/',
                    reportFiles: 'main.html',
                    reportName: "Checkstyle Report"
                ]

            }
        }
    }
}