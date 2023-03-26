pipeline {
	agent any

	tools{
            maven 'Maven'
	}

	stages {

		stage('Build'){
			steps {
			       dir('mssc-pizza-inventory') {
                               sh "pwd"
			       sh 'mvn clean install -DskipTests'
                             }
			     
				
			}
		}

		stage('Test'){
			steps{
			     
			}
		}

		stage('Deploy') {
			steps {
			    sh 'mvn jar:jar deploy:deploy'
			}
		}
	}
}
