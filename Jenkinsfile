pipeline {
	agent any

	tools{
            maven 'Maven'
	}

	stages {

		stage('Build'){
			steps {
			       dir('mssc-pizza-service') {
                               sh "pwd"
			       sh 'mvn clean install -DskipTests'
                             }
			       dir('mssc-pizza-inventory') {
                               sh "pwd"
			       sh 'mvn clean install -DskipTests'
                             }
			     
				
			}
		}

		stage('Test'){
			steps{
			     dir('mssc-pizza-service') {
                               sh "pwd"
			       sh 'mvn test'
                             }
			       dir('mssc-pizza-inventory') {
                               sh "pwd"
			       sh 'mvn test'
                             }
			}
		}

		stage('Deploy') {
			steps {
			    sh 'mvn jar:jar deploy:deploy'
			}
		}
	}
}
