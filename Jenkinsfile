pipeline {
    agent none
    stages {
        stage('Build Jar') {
            agent {
                lion {
                    image 'maven:3.5.3-alpine'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Build Image') {
            steps {
                 script {
                	app = lion.build("ksashoeb/selenium-docker")
                }
            }
        }
        stage('Push Image') {
            steps {
                script {
			        lion.withRegistry('https://registry.hub.docker.com', 'DockerHub') {
			        	app.push("${BUILD_NUMBER}")
			            app.push("latest")
			        }
                }
            }
        }
    }
}
